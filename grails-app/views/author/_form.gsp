<%@ page import="org.grails.example.Author" %>



<div class="fieldcontain ${hasErrors(bean: authorInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="author.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${authorInstance?.firstName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: authorInstance, field: 'age', 'error')} ">
	<label for="age">
		<g:message code="author.age.label" default="Age" />
		
	</label>
	<g:field name="age" type="number" value="${authorInstance.age}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: authorInstance, field: 'birthdate', 'error')} ">
	<label for="birthdate">
		<g:message code="author.birthdate.label" default="Birthdate" />
		
	</label>
	<g:datePicker name="birthdate" precision="day"  value="${authorInstance?.birthdate}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: authorInstance, field: 'lastName', 'error')} ">
	<label for="lastName">
		<g:message code="author.lastName.label" default="Last Name" />
		
	</label>
	<g:textField name="lastName" value="${authorInstance?.lastName}"/>
</div>

