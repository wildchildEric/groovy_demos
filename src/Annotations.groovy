import groovy.transform.Canonical
import groovy.transform.Immutable

/*
If we find ourselves writing a toString() method that simply displays select fields values as comma-separated,
we can let the Grooovy compiler work for us by using the @Canonical transformation. 
By default it includes all the fields; how- ever, we can ask it to include certain fields and exclude others
*/

@Canonical(excludes = "lastName, age")
class Person {
    String firstName
    String lastName
    int age
}

def sara = new Person(firstName: "Sara", lastName: "Walker", age: 49)
println(sara)

class Worker {
    def work() { println 'get work done' }

    def analyze() { println 'analyze...' }

    def writeReport() { println 'get report written' }
}

class Expert {
    def analyze() { println 'expert analysis...' }
}

class Manager {
    @Delegate
    Expert expert = new Expert()
    @Delegate
    Worker worker = new Worker()
}

def bernie = new Manager()
bernie.analyze()
bernie.work()
bernie.writeReport()

/*
Immutable objects are inherently thread-safe, 
and it is a good practice to mark fields as final. 
Groovy makes it easier to do the right thing by marking the fields as final and, 
as a bonus, creating some convenience methods for us if we mark a class with the @Immutable annotation.
 */
//Groovy adds the hashCode(), equals(), and toString() methods
@Immutable
class CreditCard {
    String cardNumber
    int creditLimit
}

println new CreditCard('4000-1111-2222-3333', 1000)


class Heavy {
    def size = 10

    Heavy() { println "Creating Heavy with $size" }
}

class AsNeeded {
    def value

    @Lazy
    Heavy heavy1 = new Heavy()
    @Lazy
    Heavy heavy2 = new Heavy()

    AsNeeded() { println "Created AsNeeded" }
}

def asNeeded = new AsNeeded(value: 1000)
println asNeeded.heavy1.size
println asNeeded.heavy1.size
println asNeeded.heavy2.size

/*
The @Newify annotation can help us create Ruby-like constructors where new is a method on the class.
It can also help us create Python-like constructors (and Scala-like applicators) where we can do away with new entirely. 
To create the Python-like constructor, we must specify the list of types to the @Newify annotation. 
The Ruby-style constructor is created for us unless we set the value auto=false as a parameter to @Newify.
*/

@Newify([Person, CreditCard])
def fluentCreate() {
    println Person.new(firstName: "John", lastName: "Doe", age: 20)
    println Person(firstName: "John", lastName: "Doe", age: 20)
    println CreditCard("1234-5678-1234-5678", 2000)
}

fluentCreate()

@Singleton(lazy = true, strict = false)
class TheUnique {
    private TheUnique() { println 'Instance created' }

    def hello() { println 'hello' }
}

println "Accessing TheUnique"
TheUnique.instance.hello()
TheUnique.instance.hello()