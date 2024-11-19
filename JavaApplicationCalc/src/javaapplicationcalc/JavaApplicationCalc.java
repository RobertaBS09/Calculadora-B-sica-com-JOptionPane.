
package javaapplicationcalc;

import javax.swing.JOptionPane;

/**
 *
 * @author julia.csilva53
 */
public class JavaApplicationCalc {
    public static void main(String[] args) {
        Object [] operação = {"SOMA" , "SUBTRAÇÃO", "MULTIPLICAÇÃO" ,"DIVISÃO"};
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma operação", "Calculadora", 1, null, operação, operação [1]);
          String num1 = JOptionPane.showInputDialog(null,
                "Digite um número Inteiro.", 
                "NUM1.",
                2);
        String num2 = JOptionPane.showInputDialog(null,
                "Digite um número Inteiro.", 
                "NUM1.",
                2);   
        int in1=Integer.parseInt(num1);
        int in2=Integer.parseInt(num2);
      if(in2 ==0){
          JOptionPane.showConfirmDialog(null, "Não pode fazer divisão por 0!");
      } else{
        int total = 0;
        
        if (escolha == operação [0]){
            total = in1+in2 ;
            
        }
        else if (escolha ==operação [1]){
            total = in1-in2;
        }
        else if(escolha ==operação [2]){
            total = in1*in2;
            
        }
        else if (escolha == operação [3]) {
            total = in1 / in2 ;
        }
        
      String resultado =String.valueOf(total);
        JOptionPane.showMessageDialog(null, 
             "Total : " + resultado,
             "Resultado", 
             1);
    }
    }
}
