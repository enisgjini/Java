/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class RanguINumrave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shtyp sa numra deshhiron te shytpesh");
        int numri = sc.nextInt();
        int numerimi = 0;

        for (int i = 0; i < numri; i++) {
            System.out.println("Shenoni keta numra");
            
            int numrat = sc.nextInt();
            
            if (numrat > 10 && numrat < 20)
            {
                numerimi++;
            } 
        }
        System.out.println("Ju keni shtypur " + numri + " numrat dhe nga keta numra " + numerimi + " jane ne mes te numrave 10-20");

    }
}
