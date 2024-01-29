package com.solucionfactible.dev;

import java.util.ArrayList;
import java.util.List;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 * 
 * @author developer
 */
public class ArrayDiff {
	
    public static int[] diff(int[] a, int[] b) {
        List<Integer> diffList = new ArrayList<>();
        int [] diffArray = {};
        for (int i : a) {
            if (!existArray(b,i)){
                diffList.add(i);
            }    
        }

        diffArray = diffList.stream().mapToInt(Integer::intValue).toArray();

            return diffArray;
    }



    public static boolean existArray(int [] array, int i){

        for (int j : array) {
            if (j==i) {
                return true;

            }
        }
        return false;
    }
    /*
    public static void main(String[] args) {
        int [] a = {4,3,6,8,5};
        int [] b = {25,64,8,36,6};
        
        int [] c =diff(a,b);
        for (int i = 0; i <c.length; i++) {
            System.out.print(c[i]);
        }
        
    }*/

}
