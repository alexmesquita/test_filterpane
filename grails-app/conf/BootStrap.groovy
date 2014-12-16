import org.grails.example.*

import java.sql.Date
class BootStrap {

    def init = { servletContext ->
    	Author da = new Author(firstName: 'Douglas', lastName: 'Adams', age: 42, birthdate: Date.valueOf('1952-03-11')).save()
        Author cl = new Author(firstName: 'Clive', lastName: 'Lewis', birthdate: Date.valueOf('1898-11-29')).save()
        Author ra = new Author(firstName: 'Richard', lastName: 'Adams', birthdate: Date.valueOf('1920-05-10')).save()
        Author mt = new Author(firstName: 'Mark', lastName: 'Twain', birthdate: Date.valueOf('1835-11-30')).save()
        Author sk = new Author(firstName: 'Steve', lastName: 'Krug', birthdate: Date.valueOf('1950-01-01')).save()
        Author sf = new Author(firstName: 'Scott', lastName: 'Fox', birthdate: Date.valueOf('1969-01-01')).save()
        Author mg = new Author(firstName: 'Malcolm', lastName: 'Gladwell').save()
        Author hm = new Author(firstName: 'Herman', lastName: 'Melville').save()
        Author ac = new Author(firstName: 'Arthur', lastName: 'Clarke').save()

        Author dm = new Author(firstName: 'Dave', lastName: 'Mark').save()
        Author jl = new Author(firstName: 'Jeff', lastName: 'LaMarche').save()

    }
    def destroy = {
    }
}
