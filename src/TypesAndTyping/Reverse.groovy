package TypesAndTyping

import groovy.transform.TypeChecked

@TypeChecked
def printInReverse(String str){
    println str.reverse()
}

printInReverse('hello')