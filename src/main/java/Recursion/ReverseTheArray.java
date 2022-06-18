package Recursion;

import java.util.ArrayList;

public class ReverseTheArray {

    public static void main(String ...args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        reverse(arr);
        System.out.println(arr);
    }

    private static void reverse(ArrayList<Integer> arr) {
        reverseHelper(arr,0,arr.size()-1);
    }

    private static void reverseHelper(ArrayList<Integer> arr, int left, int right) {
        if(left>=right) {
            return;
        }

        // perform swap b/w left and right index
        int temp = arr.get(left);
        arr.set(left, arr.get(right));
        arr.set(right, temp);

        reverseHelper(arr, left+1, right-1);
    }
}
