package com.dlv.minevents.controllers

import com.dlv.minevents.domain.Condition
import com.dlv.minevents.domain.Event;
import com.dlv.minevents.domain.EventType

class ConditionController {

    def displayForm() {
		def condition = new Condition()
		condition.quantity=1.0d
		[eventTypes:EventType.getAll(),condition:condition]
	}
	
	def save(){
		def toRedirect="displayConditions"
		def condition = new Condition(params)
		if(condition.validate()){
			condition.save()
		}else{
			toRedirect="displayForm"
			flash.messages = new ArrayList()
			condition.errors.allErrors.each {
				flash.messages.add(it)
			}
		}
		redirect(action:toRedirect)
	}
	
	def displayConditions(){
		[list:Condition.list(sort:"initDate")]
	}
	
	def dayStatus(){
		def conditions = Condition.findAllByInitDateLessThanEquals(new Date())
		def conditionsEvaluated = new HashMap()
		conditions.each {
			def events=Event.findAllByType(it.eventType)
			def evaluation = new Expando()
			evaluation.quantity=0d
			events.each {
				println ("DLV "+evaluation.quantity+",,,,"+it)
				evaluation.quantity = (double)evaluation.quantity+(double)it.quantity
			}
			evaluation.completed = evaluation.quantity >= it.quantity
			conditionsEvaluated.put(it,evaluation)
		}
		[conditions:conditionsEvaluated]
	}
}
