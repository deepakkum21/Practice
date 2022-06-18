package Recursion;

public class Factorial {

    public static long findFactorial(int no) {
        if(no == 0) return 1L;
        long partialAns = findFactorial(no-1);
        return no*partialAns;
    }

    public static void main(String... args) {
        int num = 0;
        if(num>-1) {
            System.out.println(findFactorial(num));
        } else {
            System.out.println("Cannot find factorial of -ve no "+num);
        }
    }
}


