package ushtrimenewhile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
import java.util.*;

public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sheno nje numer me te vogel se 12");
        int nr = sc.nextInt();

        while (nr < 12) {
            System.out.println("Sheno nje numer me te vogel se 12");
            nr = sc.nextInt();

        }

        System.out.println("Numri qe ju shtypet eshte: " + nr);

    }
}
