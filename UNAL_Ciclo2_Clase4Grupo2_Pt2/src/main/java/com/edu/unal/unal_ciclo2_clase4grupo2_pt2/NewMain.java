/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2_clase4grupo2_pt2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a=97 e=101 i=105 o=111 u=117
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite un valor entero: ");
        int valorEnt = tec.nextInt();
        System.out.println("el valor es una vocal es ascii? "
                +esVocalEnASCII(valorEnt));
        
        System.out.println("Digite solo un caracter: ");
        char letra=tec.next().charAt(0);
        System.out.println("la letra "+letra +" es "+esLetraASCIIPar(letra));

    }

    public static boolean esVocalEnASCII(int x) {
        boolean resul;
        /*
        if (x == 97 || x == 101 || x == 105 || x == 111 || x == 117) {
            resul = true;
        } else {
            resul = false;
        }
        */
        /*
        if (x == 97) {
            resul = true;
        } else if (x == 101) {
            resul = true;
        } else if (x == 105) {
            resul = true;
        } else if (x == 111) {
            resul = true;
        } else if (x == 117) {
            resul = true;
        } else {
            resul = false;
        }
        */
        
        switch (x) {
            case 97:
            case 101:
            case 105:
            case 111:
            case 117:
                resul = true;
                break;
            default:
                resul = false;
                break;

        }

        
        return resul;
    }
    
    //--------------------------------------------------
    public static String esLetraASCIIPar(char c){
        int valor=(int)c;//cast de char a int
        char x=45;//cast de int a char
        System.out.println(x);
        if (valor%2 == 0) return "Par";
        else return "Impar";
    }

}
