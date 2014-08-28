package com.dlv.minevents.controllers

import static org.junit.Assert.*;
import org.junit.*;
import com.dlv.minevents.domain.*
import com.dlv.minevents.controllers.ConditionController;

import grails.test.mixin.TestFor
import grails.test.mixin.*
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ConditionController)
@Mock([Condition,EventType,Event])
class ConditionControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

	@Test
    void dayStatus() {
		when:
			controller.dayStatus()
		
    }
}
