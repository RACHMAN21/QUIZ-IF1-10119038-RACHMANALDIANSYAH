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
 * Deskripsi Program : program ini berisi class ServicePrice yang merupakan sub-class dari ServiceItem
 *
 */
public class ServicePrice implements ServiceItem {
    private float priceService;
    private float discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }

    @Override
    public void displayService() {
        int selectPrice;
        Scanner sc = new Scanner(System.in);
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#******Service List*******#");
        System.out.println("1.Haircut : IDR 45K");
        System.out.println("2.Haircut + Hairwash : IDR 55K");
        System.out.println("3.Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.print("Choose (1/2/3) : ");selectPrice=sc.nextInt();
    }

    @Override
    public float getPrice(int serviceItem) {
        if (serviceItem == 1) {
            priceService = 45000;
        } else if (serviceItem == 2) {
            priceService = 55000;
        } else if (serviceItem == 3) {
            priceService = 15000;
        } else {
            System.out.println("Nomor hanya antara 1 s/d 3, Ulangi!");
        }

        return priceService;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        boolean stat = false;
        if(statusMember.toUpperCase().equals("YES")) {
            stat = true;
        }

        return stat;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        discount = 0;
        if (isMember) {
            discount = (10 * parServicePrice) / 100;
        }

        return discount;
    }

    public float getTotalPay(float priceService, float sale) {
        return this.priceService - discount;
    }
}