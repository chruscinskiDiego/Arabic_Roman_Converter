package application;

import converters.ArabicToRoman;
import converters.RomanToArabic;
import numbers.NumberException;
import numbers.RomanException;

import javax.swing.*;

public class Menu {

    public void mainMenu(){

        int choice = 0;

        String[] options = {"Arábico -> Romano", "Romano -> Arábico", "Sair"};

        while(choice != 2){

            choice = JOptionPane.showOptionDialog(
                    null,
                    "Escolha o tipo de conversão",
                    "Conversor",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if(choice == 0){
                String input = JOptionPane.showInputDialog(
                        null,
                        "Digite o número:",
                        "Arábico -> Romano",
                        JOptionPane.QUESTION_MESSAGE);


                try {
                    int arabicNumber = Integer.parseInt(input);
                    String romanSymbol = ArabicToRoman.arConvertion(arabicNumber);

                    JOptionPane.showMessageDialog(null,
                            "Conversão realizada com sucesso!\n" +
                                    "Arábico: " + arabicNumber + "\n" +
                                    "Romano: " + romanSymbol);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                }
                catch (NumberException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            else if(choice == 1){
                String input = JOptionPane.showInputDialog(
                        null,
                        "Digite o símbolo:",
                        "Romano -> Arábico",
                        JOptionPane.QUESTION_MESSAGE);

                try{
                    int arabicNumber = RomanToArabic.raConvertion(input);

                    JOptionPane.showMessageDialog(null,
                            "Conversão realizada com sucesso!\n" +
                                    "Romano: " + input + "\n" +
                                    "Arábico: " + arabicNumber);
                }
                catch (RomanException e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

        }
    }
}
