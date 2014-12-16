package org.grails.example

class Author {

    String firstName = 'first'
	String lastName = 'last'
	Integer age = 30
    Date birthdate = new Date()
	
	String toString() {
		return "${lastName}, ${firstName}"
	}

    static constraints = {
        firstName blank: false
        age nullable: true
        birthdate nullable: true
    }
}
