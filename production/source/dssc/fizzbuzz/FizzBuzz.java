package dssc.fizzbuzz;

import java.util.HashMap;
import java.util.stream.IntStream;

public class FizzBuzz {

    public void printNumbers() {
        IntStream seq = IntStream.rangeClosed(1, 100);
        seq.mapToObj(FizzBuzz::numToString).forEach(System.out::println);
    }

    public static String numToString(int num) {
        String ans = "";
        HashMap<Integer, String> codes = new HashMap<>();
        codes.put(3, "Fizz");
        codes.put(5, "Buzz");
        for (Integer divisor : codes.keySet()) {
            if (num % divisor == 0) {
                ans += codes.get(divisor);
            }
        }
        if (ans.isEmpty()) {
            return String.valueOf(num);
        }
        return ans;
    }
}
