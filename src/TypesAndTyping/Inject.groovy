package TypesAndTyping

def shoutString(String str) {
    println str.shout()
}

str = 'hello'
str.metaClass.shout = { -> toUpperCase() }
shoutString(str)