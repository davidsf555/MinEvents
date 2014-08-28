package com.dlv.minevents.controllers

import org.springframework.web.servlet.mvc.condition.ParamsRequestCondition;

import com.dlv.minevents.domain.EventType

class EventTypesController {

    def displayForm() {
		EventType type = new EventType()
		[type:type]
	}
	
	def save(){
		def toRedirect="displayTypes"
		def eventType = new EventType(params)
		if(eventType.validate()){
			eventType.save()
		}else{
			toRedirect="displayForm"
			flash.messages = new ArrayList()
			eventType.errors.allErrors.each {
				flash.messages.add(it)
			}
		}
		redirect(action:toRedirect)
	}
	
	def displayTypes(){
		[list:EventType.getAll()]
	}
}