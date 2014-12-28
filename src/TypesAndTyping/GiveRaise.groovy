package TypesAndTyping

void giveRaise(Employee employee){
    employee.raise(new BigDecimal(10000.00))
}

giveRaise new Employee()
giveRaise new Executive()