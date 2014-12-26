def splitName(fullName) {
    fullName.split(' ')
}

def (firstName, lastName) = splitName('James Bond')
println "$lastName, $firstName $lastName"

def (String cat, String mouse) = ['Tom', 'Jerry', 'Spike', 'Tyke']
println "$cat and $mouse"

def (first, second, third) = ['Tom', 'Jerry']
assert third == null
println "$first, $second, and $third"

def (one, two, three) = [1, 2]
assert three == null
println "$one, $two, $three"