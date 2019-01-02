package romannumeral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class RomanNumeral {
    private String stringToConvert;
    private int numberToConvert;
    private HashMap<Character, Integer> toRoman;
    private LinkedHashMap<String, Integer>toNumber;

   public RomanNumeral(String numAsString) {
       String invalidChars = "abefghjknopqrstuwyz";
       if (invalidChars.contains(numAsString) || numAsString.isEmpty()) {
           // fail here. Not a roman numeral
           System.out.println("Not a roman numeral");
       } else { 
           this.stringToConvert = numAsString.toLowerCase();
           setupMap();
           this.numberToConvert = 0;
       }
   } 
   
   public RomanNumeral(int number) {
       if (number < 0 || number > 4000) {
           // fail here. Number too big
           System.out.println("Too big or negative");
       } else {
           this.numberToConvert = number;
           setupMap();
           this.stringToConvert = "";
       }
   }
   
   public String convertToString() {
       if (numberToConvert == 0) {
           return ("0");
       }
       
       createToNumberMap();
       int numTemp = numberToConvert;
       StringBuilder sb = new StringBuilder();
       
       for (String key : toNumber.keySet()) {
           while (numTemp / toNumber.get(key) > 0) {
               sb.append(key);
               numTemp -= toNumber.get(key);
           }
       }
       return sb.toString();
   }

   public int convertToNum() {
       if (stringToConvert.isEmpty()) {
           return 0;
       }
       
       ArrayList<String> letters = new ArrayList<>();
       letters = new ArrayList(Arrays.asList(stringToConvert.split("")));
       int value = 0;
       
//       for (int i = 0; i < letters.size(); i++) {
//           // check if this is the last string
//           if (i + 1 == letters.size()) {
//               value += toNumber.get(letters.get(i));
//           }
//           // check if next string is larger eg xc
//           else if (toNumber.get(letters.get(i+1)) > toNumber.get(letters.get(i))) {
//               value += (toNumber.get(letters.get(i+1)) - toNumber.get(letters.get(i)));
//           }
//           else {
//               value += toNumber.get(letters.get(i));
//           }
//           
//       }

       for (int i = 0; i < stringToConvert.length(); i++) {
           // check if next char is last
           if (i + 1 == stringToConvert.length()) {
               value += toRoman.get(stringToConvert.charAt(i));
           } 
           // check if next char is larger, xc if so create smaller val to add
           else if (toRoman.get(stringToConvert.charAt(i+1)) > toRoman.get(stringToConvert.charAt(i))) {
               value += (toRoman.get(stringToConvert.charAt(i+1)) - toRoman.get(stringToConvert.charAt(i)));
               // jump over char + 1 so as not to add it twice
               i++;
           } 
           // or just add it to running total
           else {
               value += toRoman.get(stringToConvert.charAt(i));
           }
       }
       return value;
   }
   
   
   private void setupMap() {
       toRoman = new HashMap<>();
       toRoman.put('i', 1);
       toRoman.put('v', 5);
       toRoman.put('x', 10);
       toRoman.put('l', 50);
       toRoman.put('c', 100);
       toRoman.put('d', 500);
       toRoman.put('m', 1000);
   }
   
      private void createToNumberMap() {
       toNumber = new LinkedHashMap<>();
       toNumber.put("m", 1000);
       toNumber.put("cm", 900);
       toNumber.put("d", 500);
       toNumber.put("cd", 400);
       toNumber.put("c", 100);
       toNumber.put("xc", 90);
       toNumber.put("l", 50);
       toNumber.put("xl", 40);
       toNumber.put("x", 10);
       toNumber.put("ix", 9);
       toNumber.put("v", 5);
       toNumber.put("iv", 4);
       toNumber.put("i", 1);
   }
   
}
