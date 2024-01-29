package com.solucionfactible.dev;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, 
 * here, that the elements in b are the elements in a squared, regardless of the order.
 * 
 * @author developer
 */
import java.util.Arrays;
public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
            boolean compArray = true;
            
            Arrays.sort(a);
            Arrays.sort(b);
            int [] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = (a[i]*a[i]);
                
            }
            //Arrays.sort(c);
            compArray  = Arrays.equals(c, b);
            System.out.println("boleano "+compArray);
            /*for (int i = 0; i < c.length; i++) {
                System.out.println(c[i]+" ");
            }
            System.out.println("-----------------------");
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]+" ");
            }*/
            return compArray;
	}
        
        /*public static void main(String[] args) {
        ///comp c= new comp();    
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
	int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        boolean result =  comp(a, b); 
            System.out.println(result);
        }*/
    
}
