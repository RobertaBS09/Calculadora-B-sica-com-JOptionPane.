
package javaapplicationcalc;

import javax.swing.JOptionPane;

/**
 *
 * @author julia.csilva53
 */
public class JavaApplicationCalc {
    public static void main(String[] args) {
        Object [] opera��o = {"SOMA" , "SUBTRA��O", "MULTIPLICA��O" ,"DIVIS�O"};
        String escolha = (String) JOptionPane.showInputDialog(null, "Escolha uma opera��o", "Calculadora", 1, null, opera��o, opera��o [1]);
          String num1 = JOptionPane.showInputDialog(null,
                "Digite um n�mero Inteiro.", 
                "NUM1.",
                2);
        String num2 = JOptionPane.showInputDialog(null,
                "Digite um n�mero Inteiro.", 
                "NUM1.",
                2);   
        int in1=Integer.parseInt(num1);
        int in2=Integer.parseInt(num2);
      if(in2 ==0){
          JOptionPane.showConfirmDialog(null, "N�o pode fazer divis�o por 0!");
      } else{
        int total = 0;
        
        if (escolha == opera��o [0]){
            total = in1+in2 ;
            
        }
        else if (escolha ==opera��o [1]){
            total = in1-in2;
        }
        else if(escolha ==opera��o [2]){
            total = in1*in2;
            
        }
        else if (escolha == opera��o [3]) {
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
