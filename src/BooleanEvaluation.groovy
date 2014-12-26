//Groovy evaluates their truth, refer to the following table:
/*
    Type                  Condition for Truth
    Boolean                   True
    Collection                Not empty
    Character                 Value not 0
    CharSequence              Length greater than 0
    Enumeration               Has more elements
    Iterator                  Has next
    Number                    Double value not 0
    Map                       Not empty
    Matcher                   At least one match
    Object[]                  Length greater than 0
    Any other type            Reference not null
*/
/*
In addition to enjoying the built-in Groovy truth conventions, 
we can write our own boolean conversions easily 
by implementing an asBoolean() method in our classes.
*/

str = 'hello'
if (str) {
    println 'hello'
}


lst0 = null
println lst0 ? 'lst0 true' : 'lst0 false'
lst1 = [1, 2, 3]
println lst1 ? 'lst1 true' : 'lst1 false'
lst2 = []
println lst2 ? 'lst2 true' : 'lst2 false'
