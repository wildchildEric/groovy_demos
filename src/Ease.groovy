//The ?. operator dispatches calls only if the object reference is not null.
//if null passed in resulted in a null instead of a NullPointerException
def foo(str) {
    str?.reverse()
}

println foo('evil')
println foo(null)
