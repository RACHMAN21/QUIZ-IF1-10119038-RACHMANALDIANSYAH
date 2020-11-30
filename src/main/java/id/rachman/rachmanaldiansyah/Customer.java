/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.rachmanaldiansyah;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi class Customer yang merupakan sub-class
 *                     dari CustomerInvoice & ServicePrice
 */
public class Customer extends ServicePrice implements CustomerInvoice {
    private String name, email;
    boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String currentTime() {
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter FormatDate = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
        return waktu.format(FormatDate);
    }
}