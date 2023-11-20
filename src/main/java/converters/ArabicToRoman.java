package converters;

import numbers.Arabic;
import numbers.NumberException;
import numbers.Roman;

public class ArabicToRoman {

    public static String arConvertion(Integer num){

        StringBuilder result = new StringBuilder();

        if(num <= 0 || num > 3999){
            throw new NumberException("NÚMERO INVÁLIDO! O VALOR DEVE SER > 0 E < 3999");
        }

        for(int i = 0; i < Arabic.arabicNumbers.length; i++){
            //DEPURAÇÃO -> System.out.println("num: " + num + ", Arabic: " + Arabic.arabicNumbers[i] + ", result: " + result);
            while(num >= Arabic.arabicNumbers[i]){
                num -= Arabic.arabicNumbers[i];
                result.append(Roman.romanSymbols[i]);
            }
        }

        return result.toString();

    }
}
