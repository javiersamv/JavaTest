package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence {
	
	public static int persistence(long num) {
            int numpersistence=0;
            while(num >= 10){
                long result = 1;
                
                while(num > 0){
                    long dig = num % 10;
                    result *= dig;
                    num /= 10;
                }
                num=result;
                numpersistence++;
            
            }
            
            
            
            return numpersistence;
	}
        
        /*public static void main(String[] args) {
            
            
            long n = 175;
            int p= persistence(n);
            System.out.println(p);
        }*/

}
