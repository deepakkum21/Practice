package Recursion;

public class SumOfNNaturalNo {

    public static  int findSumOfNumbers(int no) {
        if(no == 0) return 0;
        int partialAns = no > 0 ? findSumOfNumbers(no-1) : findSumOfNumbers(no+1);
        return no+partialAns;
    }

    public static void main(String... args) {
        int num = -4;

        System.out.println(findSumOfNumbers(num));

    }
}
