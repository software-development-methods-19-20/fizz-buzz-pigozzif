package dssc.fizzbuzz;

import java.util.HashMap;
import java.util.stream.IntStream;

public class FizzBuzz {

    public void printNumbers(HashMap<Integer, String> codes) {
        IntStream seq = IntStream.rangeClosed(1, 100);
        seq.mapToObj(x -> numToString(x, codes)).forEach(System.out::println);
    }

    public static String numToString(int num, HashMap<Integer, String> codes) {
        String ans = "";
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
