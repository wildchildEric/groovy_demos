/*
== and equals() are a source of confusion in Java, 
and Groovy adds to the confusion.
Groovy maps the == operator to the equals() method in Java. 
What if we want to actually perform the reference equals (the original ==, that is)? 
We have to use is() in Groovy for that
 */
str1 = 'hello'
str2 = str1
str3 = new String('hello')
str4 = 'Hello'

println "str1 == str2: ${str1 == str2}"
println "str1 == str3: ${str1 == str3}"
println "str1 == str4: ${str1 == str4}"

println "str1.is(str2): ${str1.is(str2)}"
println "str1.is(str3): ${str1.is(str3)}"
println "str1.is(str4): ${str1.is(str4)}"

/*
The observation that Groovy == maps to equals() is only partially true
—that mapping happens only if the class does not implement the Comparable interface.
 If it does, then it maps to the class’s compareTo() method.
 */

class A {
    boolean equals(other) {
        println "equals called"
        false
    }
}

class B implements Comparable {
    boolean equals(other) {
        println "equals called"
        false
    }

    int compareTo(Object o) {
        println "compareTo called"
        0
    }
}

new A() == new A()
new B() == new B()