/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        //for (int i = 1; i < 100; i++) {
        int i = 1; // Defining the loop variable prior to executing while loop
        while (i < 100){

            i = doFizzBuzz(i);
        }
    }

    public static int doFizzBuzz(int i) { // Note: Making this method public s.t it is accessible for calling in Main.kava
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i++; // NOTE: The accumulator of i NEEDS TO GO AT THE VERY END, as your print statement relies on having the correct value of i.
        return i;
    }
}
