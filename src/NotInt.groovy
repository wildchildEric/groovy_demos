//Prior to version 2.0 all primitive types were treated as objects in Groovy.
// To improve performance and use more-direct bytecode for operations on 
// primitives, starting in version 2.0 Groovy does some optimization.
// Primitives are treated as objects only where necessary—for instance,
// if we invoke methods on them or pass them to object references.
// Otherwise, Groovy retains them as primitive types at the bytecode level.
int val = 5
assert val.getClass() == Integer
println val.getClass().name