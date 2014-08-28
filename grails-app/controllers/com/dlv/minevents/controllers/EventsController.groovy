package com.dlv.minevents.controllers

import com.dlv.minevents.domain.Event
import com.dlv.minevents.domain.EventType

class EventsController {

    def displayForm() {
		[event:new Event()]
		[eventTypes:EventType.getAll()]
	}
	
	def save(){
		def toRedirect="displayEvents"
		def event = new Event(params)
		if(event.validate()){
			event.save()
		}else{
			toRedirect="displayForm"
			flash.messages = new ArrayList()
			event.errors.allErrors.each {
				flash.messages.add(it)
			}
		}
		redirect(action:toRedirect)
	}
	
	def displayEvents(){
		[list:Event.list(sort:"time")]
	}
}
