/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ushtrimenewhile;
import java.util.*;

public class Ushtrimi13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shtyp emra");

        String fjala = sc.next();

        int count = 0;

        while (!(fjala.equals("end"))) {
            if (fjala.equals("programim")) {
                count++;
            }
            
            System.out.println("Fjala end e terminon unazen");
            fjala = sc.next();
            
            
            
        }
        System.out.println("Ju keni shtypur " + count + " fillojn me emra programim");

    }
}