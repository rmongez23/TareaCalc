
package com.mycompany.tptarea1;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opcion,num1,num2;
        float resultado;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\t\tTarea 1 TP"+" \n1)Suma \n2)Resta \n3)Multiplicacion \n4)Division \n5)Verificacion de numero primo \n6)Verificacion de numero palindromo"));
            switch(opcion){
                case 1: num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
                        num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
                        JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+(resultado=num1+num2));
                break;
                case 2: num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
                        num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
                        JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+(resultado=num1-num2));
                break;
                case 3: num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
                        num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
                        JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: "+(resultado=num1*num2));        
                break;
                case 4: num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
                        num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
                        JOptionPane.showMessageDialog(null,"El resultado de la division es: "+(resultado=num1/num2)); 
                break;
                case 5: num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
                        int divisor=0; 
                        for (int i = 1; i < num1; i++) {
                            if(num1/i==0);
                            divisor++;
                        }
                        if(divisor==2){
                            JOptionPane.showMessageDialog(null,"El numero "+num1+" es un numero primo.");
                        }else{
                            JOptionPane.showMessageDialog(null,"El numero "+num1+" NO es un numero primo.");
                        }
                break;
                case 6: num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
                        if(esPalindromo(num1)){
                            JOptionPane.showMessageDialog(null, "El número "+num1+" es palindromo");
                        }else{
                            JOptionPane.showMessageDialog(null, "El número "+num1+" NO es palindromo");
                        }
                break;
                default: JOptionPane.showMessageDialog(null,"Opcion invalida");
            }          
        }while(opcion != 5);
           
        }
        
        public static boolean esPalindromo(int numero){
            String palabra = String.valueOf(numero);
            for (int i = 0, j = palabra.length() - 1; i <= j; i++, --j) {
                if(palabra.charAt(i) != palabra.charAt(j)){
                    return false;
                }
            }
            return true;
        }
    
}
