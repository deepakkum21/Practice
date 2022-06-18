package Recursion;


//https://www.codingninjas.com/codestudio/problems/find-power-of-a-number_893198
public class FindPowerOfNumber {

    // time complexity = O(n)
    public static long Pow(int X, int N) {
        if(N==0) return 1L;
        if(N==1) return (long)X;
        if(X==0) return 0L;

        return X*Pow(X,N-1);
    }

    public static void main(String[] args) {
        System.out.println(ImprovedPow(0,5));
    }

    // time complexity = log(n)
    public static long ImprovedPow(int X, int N) {
        if(N==0) return 1L;
        if(N==1) return (long)X;
        if(X==0) return 0L;

        Long temp = ImprovedPow(X,N/2);
        if(N%2 == 1) {
            return temp * temp * X;
        }

        return temp * temp;
    }
}
