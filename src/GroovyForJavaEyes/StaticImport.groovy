package GroovyForJavaEyes

import groovy.lang.ExpandoMetaClass as EMC

import static Math.random as rand

double value = rand()
println value
def metaClass = new EMC(Integer)
assert metaClass.getClass().name == 'groovy.lang.ExpandoMetaClass'