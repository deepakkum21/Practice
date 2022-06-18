package Recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static  Map<Long, Long> fiboMap = new HashMap<>();
    public static int findFibonacci(int no) {
        if(no ==0 || no == 1) return no;
        return findFibonacci(no-1) +findFibonacci(no-2);
    }

    public static void main(String... args) {

        int num = 50;
        if(num>-1) {
            System.out.println(findFibonacciUsingDP(num));
        } else {
            System.out.println("Cannot find Fibonacci of -ve no "+num);
        }
    }

    // should use DP as above time complexity is 2to power n
    public static Long findFibonacciUsingDP(int no) {

        fiboMap.put(0L,0L);
        fiboMap.put(1L,1L);
        if(no ==0 || no == 1) return (long)no;

        Long partialAns1;
        Long partialAns2;
        System.out.println(no);
        if(fiboMap.get(no-1) == null) {
            partialAns1 = Long.valueOf(findFibonacci(no-1));
            fiboMap.put((long)no-1, (long)partialAns1);
        } else {
            partialAns1 = fiboMap.get(no-1);
        }

        if(fiboMap.get(no-2) == null) {
            partialAns2 = Long.valueOf(findFibonacci(no-2));
            fiboMap.put((long)no-2, (long)partialAns2);
        } else {
            partialAns2 = fiboMap.get(no-2);
        }

        return partialAns1+partialAns2;
    }
}
