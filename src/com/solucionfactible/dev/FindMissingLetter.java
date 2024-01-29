package com.solucionfactible.dev;

import java.util.Arrays;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {
	
        public static char findMissingLetter(/*char[] fullArray,*/ char[] segmentArray) {
        
        
        char [] alphabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Arrays.sort(segmentArray);

        
        for (int i = 0; i < alphabetArray.length - 1; i++) {
            char current = alphabetArray[i];
            char next = alphabetArray[i + 1];

            if (Arrays.binarySearch(segmentArray, current) >= 0 && Arrays.binarySearch(segmentArray, next) < 0) {
                return (char) (current + 1);
            }
        }

       
        return '\0';
    }
        
    /*public static void main(String[] args) {
            char [] array = {'x','z'};
            
            
            char result = findMissingLetter(array);
            
            System.out.println(result);
            //boolean comp = =('c',result);
            
    }*/

}
