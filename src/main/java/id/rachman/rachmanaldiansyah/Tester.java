/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.rachmanaldiansyah;

import java.util.Scanner;
/*
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : Program ini berisi Program Kasir Rock n Roll Haircut dengan pendekatan berbasis objek
 *
 */
public class Tester {
    public static void main(String[] args) {
        Customer cust = new Customer();
        Scanner input = new Scanner(System.in);
        System.out.println("====Program Kasir Rock n Roll====");
        System.out.print("Customer Name  : ");cust.setName(input.nextLine());
        System.out.print("Customer Email : ");cust.setName(input.nextLine());

        cust.displayService();
        cust.getPrice(input.nextInt());

        System.out.print("Are You Member (Yes/No) : ");
        cust.setMember(cust.checkMemberStatus(input.next()));

        System.out.println("#**************************#");
        System.out.println("#*****CUSTOMER INVOICE*****#");
        System.out.println("Date Transaction : ".concat(cust.currentTime()));
        System.out.println("Service Price : " + cust.getPriceService());
        cust.getSale(cust.isMember(), cust.getPriceService());
        System.out.println("Discount : " + cust.getSale(cust.isMember(), cust.getPriceService()));
        System.out.println("Service Price : " + cust.getTotalPay(cust.getPriceService(), cust.getSale(cust.isMember(), cust.getPriceService())));
    }
}