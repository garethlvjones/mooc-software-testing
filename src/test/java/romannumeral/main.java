
package romannumeral;

public class main {
    
    public static void main(String[] args) {
    // write testcode here
    RomanNumeral test1 = new RomanNumeral("cccxxxii");
    System.out.println(test1.convertToNum());
    
    RomanNumeral test2 = new RomanNumeral("xc");
    System.out.println(test2.convertToNum());
    
        
    RomanNumeral test3 = new RomanNumeral("mmmmcccxcvii");
    System.out.println(test3.convertToNum());
    
    RomanNumeral test4 = new RomanNumeral(3097);
    System.out.println(test4.convertToNum());
    System.out.println("here: " + test4.convertToString());    


 
    }
    
}
