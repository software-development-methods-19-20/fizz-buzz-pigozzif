package dssc.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    public void printNumbers() {
        IntStream seq = IntStream.rangeClosed(1, 100);
        seq.mapToObj(FizzBuzz::numToString).forEach(System.out::println);
    }

    public static String numToString(int num) {
        if (num % 3 == 0) {
            return "Fizz";
        }
        else {
            return String.valueOf(num);
        }
    }
}
