def receiveVarArgs(int a, int ... b) {
    println "You passed $a and $b"
}

def receiveArray(int a, int[] b) {
    println "You passed $a and $b"
}

receiveVarArgs(1, 2, 3, 4, 5)
receiveArray(1, 2, 3, 4, 5)

/*
    We must use caution when we send an array instead of discrete values.
    Groovy treats the values wrapped in square brackets [] as an instance of ArrayList,
    not of the plain vanilla array. So if we simply send, for example, [2, 3, 4, 5],
    we’ll get a MethodMissingException. To send an array,
    either define a reference of the array type or use the as operator.
*/

int[] values = [2, 3, 4, 5]
receiveVarArgs(1, values)
receiveVarArgs(1, [2, 3, 4, 5] as int[])