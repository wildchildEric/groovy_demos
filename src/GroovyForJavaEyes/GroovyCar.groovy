package GroovyForJavaEyes

class GCar {
    def miles = 0
    final year

    GCar(theYear) { year = theYear }
}

GCar car = new GCar(2008)

println "Year: $car.year"
println "Miles: $car.miles"
println "Setting miles"
car.miles = 25
println "Miles: $car.miles"