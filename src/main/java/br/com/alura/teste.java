package br.com.alura;
import javax.swing.*;

import static java.lang.Math.sqrt;

public class teste {

    public static void main(String entrada[]){

        int n1, n2, mod,div;
        double raiz1, raiz2, pot;
        String msg="";
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digute um numero um num int"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digute um numero um num int"));

        mod = n1 % n2;
        div = (int)n1 / (int) n2;
        pot = Math.pow(n1,n2);


        msg = msg + "quociente da divisão" + n1 +" por "+ n2 + " = " + div + "\n";
        msg = msg + "potencia de " + n1 + " por " + n2 + " = " + pot + "\n";
        JOptionPane.showMessageDialog (null, msg);
        System.exit(0);
    }


}
