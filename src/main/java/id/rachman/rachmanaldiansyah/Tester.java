/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.rachmanaldiansyah;

/**
 *
 * @author 
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program :
 * 
 */

import java.util.Scanner; // import kelas scanner

public class Tester {
    public static String name,email;
    public static void main(String[] args) {
        Customer cust = new Customer();
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.println("Customer Name  : ");cust.setName(name);
        System.out.println("Customer Email : ");cust.setEmail(email);
        cust.displayService();
    }
}