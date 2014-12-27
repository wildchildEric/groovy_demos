package GroovyForJavaEyes
/**
 * Created by lizhe on 14/12/26.
 */

class Demo {
    public static void main(args){
        String.metaClass.isPalindrome = {->
            delegate == delegate.reverse()
        }
        
        println "wow".isPalindrome()
    }
}
