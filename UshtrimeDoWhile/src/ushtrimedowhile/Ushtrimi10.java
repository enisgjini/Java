/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ushtrimedowhile;

/**
 *
 * @author Student
 */
import java.util.*;

public class Ushtrimi10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shtyp nje fjalë");

        String fjala = sc.next();

        int count = 0;

        do {
            System.out.println("Fjala end e terminon unazen");

            fjala = sc.next();

            if (fjala.contains("ubt")) {
                count++;
            }
        } while (!(fjala.equals("end")));
        System.out.println("Ju keni shtypur " + count + "  emra qe permbajne fjalen ubt");

    }
}
