public class Main {
    public static void main(String[]args){
        FizzBuzz.doFizzBuzz(5); // Calling the PUBLIC doFizzBuzz method from class FizzBuzz
        FizzBuzz.main(null); // Passing Null as a parameter works. See here: https://stackoverflow.com/questions/2550310/can-a-main-method-of-class-be-invoked-from-another-class-in-java
    }
}
