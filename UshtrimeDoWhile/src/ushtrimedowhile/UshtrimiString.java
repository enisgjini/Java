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

public class UshtrimiString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shtyp nje fjalë");

        String fjala = sc.next();

        do {
            System.out.println("Fjala exit e terminon unazen");
            fjala = sc.next();
        } while (!(fjala.equals("exit")));
        System.out.println("Fjala e fundit qe ju shtypet eshte " + fjala);

    }
}
