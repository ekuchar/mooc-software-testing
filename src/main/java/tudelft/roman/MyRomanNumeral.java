package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class MyRomanNumeral {
    private final static char ONE = 'I' ;
    private final static char FIVE = 'V' ;
    private final static char TEN = 'X' ;
    private final static char FIFTY = 'L' ;
    private final static char HUNDRED = 'C' ;
    private final static char FIVEHUNDRED = 'D' ;
    private final static char THOUSAND = 'M' ;

    private static Map<Character,Integer> romanToNumber = new HashMap<>() ;
    static {
        romanToNumber.put(ONE,1) ;
        romanToNumber.put(FIVE,5) ;
        romanToNumber.put(TEN,10) ;
        romanToNumber.put(FIFTY,50) ;
        romanToNumber.put(HUNDRED,100) ;
        romanToNumber.put(FIVEHUNDRED,500) ;
        romanToNumber.put(THOUSAND,1000) ;
    }

    public static int convert( String romanNumber ) {
        romanNumber = romanNumber.trim().toUpperCase() ;

        if ( romanNumber.length() == 0 ) {
            return -1 ;
        }

        int currentNumber ;
        int prevNumber = romanToNumber.get(romanNumber.charAt(0)) ;
        int acc = 0 ;

        for ( int i = 1 ; i < romanNumber.length() ; i++ ) {
            currentNumber =  romanToNumber.get(romanNumber.charAt(i)) ;
            if (currentNumber > prevNumber ) {
                acc -= prevNumber ;
            } else {
                acc += prevNumber ;
            }
            prevNumber = currentNumber ;
        }

        acc += prevNumber ;

        return acc ;
    }
}
