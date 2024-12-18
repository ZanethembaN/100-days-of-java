package portfolio;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public String fizzBuzz(int number) {
        if (!validate(number)) {
            return "Invalid input";
        }

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }


    public List<String> fizzBuzzN(int numbers) {
        if (numbers <= 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        }

        List<String> results = new ArrayList<>();
        for (int i = 1; i <= numbers; i++) {
            results.add(fizzBuzz(i));
        }
        return results;
    }


    public boolean validate(int n) {
        return n > 0;
    }


    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();


        System.out.println(fizzBuzz.fizzBuzz(15));
        System.out.println(fizzBuzz.fizzBuzz(3));
        System.out.println(fizzBuzz.fizzBuzz(5));
        System.out.println(fizzBuzz.fizzBuzz(7));

        // Test fizzBuzzN method
        System.out.println(fizzBuzz.fizzBuzzN(15));
    }
}
