package TypesAndTyping

import groovy.transform.TypeChecked

@TypeChecked
def shout(String str) {
    println "Printing in uppercase"
    println str.toUpperCase()
    println "Printing again in uppercase"
//    println str.toUppercase() //Typo here
}

try {
    shout('hello')
} catch (ex) {
    println "Failed..."
}