/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ushtrimenewhile;

/**
 *
 * @author Student
 */
import java.util.*;


public class Ushtrimi9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shtyp numer | Numri -9999 e terminon unazen");

        int numri = sc.nextInt();
        int count = 0;

        while (numri != -9999) {
            System.out.println("Shtyp numer | Numri -9999 e terminon unazen");

            numri = sc.nextInt();
            if (numri < 5) {
                count++;
            }

            // System.out.println(numri);
            // break;

            // // System.out.println("Numri ");
            // // numri = sc.nextInt();
        }
        System.out.println("Ju keni shtypur " + count + " numra me te vegjel se 5");

    }
    
}
