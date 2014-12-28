package TypesAndTyping

import groovy.transform.TypeChecked

@TypeChecked
def use(Object instance){
    if(instance instanceof String)
        println instance.length()
    else
        println instance
}

use('hello')
use(4)