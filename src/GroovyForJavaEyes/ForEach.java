package GroovyForJavaEyes;

class ForEachDemo {
    public static void main(String[] args) {
        String[] greetings = {"Hello", "Hi", "Howdy"};
        for (String greet : greetings) {
            System.out.println(greet);
        }
    }
} 