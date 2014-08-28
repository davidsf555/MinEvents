package com.dlv.minevents.domain

import com.sun.istack.internal.Nullable;
import com.sun.org.glassfish.gmbal.Description;

class EventType {
	
	String name
	String description
	
    static constraints = {
		name(unique:true)
		description(nullable:true)
    }
}
