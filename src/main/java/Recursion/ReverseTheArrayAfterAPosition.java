package Recursion;

import java.util.ArrayList;
import java.util.Collections;

// https://www.codingninjas.com/codestudio/problems/reverse-the-array_1262298
public class ReverseTheArrayAfterAPosition {
    public static void main(String ...args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        reverse(arr,3);
        System.out.println(arr);
    }

    // approach1
    private static void reverse(ArrayList<Integer> arr, int m) {
        reverseHelper(arr,m+1,arr.size()-1);
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


    // approach 2
    public static void reverseArray(ArrayList<Integer> arr, int m) {

        int n = arr.size();

        // Declare two pointers.
        int i = m + 1;
        int j = n - 1;

        // Till the i<j condition holds swap the elements.
        while (i < j) {
            Collections.swap(arr, i, j);
            i++;
            j--;
        }

    }
}
