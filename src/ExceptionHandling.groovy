def openFile(fileName) {
    new FileInputStream(fileName)
}

try {
    openFile('nonexistentfile')
} catch (FileNotFoundException ex) {
    println "Oops: " + ex
}

//With the catch(ex) without any type in front of the variable ex,
//we can catch just about any exception thrown our way.
//Beware: this doesn’t catch Errors or Throwables other than Exceptions.
//To catch all of them, use catch(Throwable throwable).
try {
    openFile('nonexistentfile')
} catch (ex) {
    println "Oops: " + ex
}