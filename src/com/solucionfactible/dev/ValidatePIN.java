package com.solucionfactible.dev;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer
 */
public class ValidatePIN {
	
	public static boolean isValid(String pin) {
		
            ///con metodo maches es muy simple ajustar la mascara y definir expresion regular
            //boolean pinValid=pin.matches("\\d{6}|\\d{4}");
            
            if (pin ==null||(pin.length() != 4 && pin.length() != 6)) {
                return false;
            }
            
            for (int i = 0; i < pin.length(); i++) {
                char dig = pin.charAt(i);
                if (!Character.isDigit(dig)) {
                    return false;
                    
                }
            }
            
            return true;
	}
        
        
        public static void main(String[] args) {
            String p="123476";
             boolean v = isValid(p);
             System.out.println(v);
            
        }

}
