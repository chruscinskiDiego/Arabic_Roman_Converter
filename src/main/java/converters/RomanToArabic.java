package converters;

import numbers.Arabic;
import numbers.Roman;
import numbers.RomanException;

public class RomanToArabic {

    public static Integer raConvertion(String num) {

        num = num.toUpperCase();

        Integer arabicNumber = 0;

        if (num == null || num.isEmpty()) {
            throw new RomanException("CARACTERE VAZIO OU INVÁLIDO!");
        }
        if (!num.matches("[IVXLCDM]+")) {
            throw new RomanException("ENTRADA INVÁLIDA: " + num);
        }

        for (int i = 0; i < Roman.romanSymbols.length; i++) {
            while (num.startsWith(Roman.romanSymbols[i])) {

                arabicNumber += Arabic.arabicNumbers[i];
                num = num.substring(Roman.romanSymbols[i].length());

            }
        }

        return arabicNumber;
    }

}
