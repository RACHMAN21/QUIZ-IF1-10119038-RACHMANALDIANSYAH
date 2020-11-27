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
 * Deskripsi Program : program ini berisi class Customer yang merupakan
 *                     sub-class dari ServicePrice & CustomerInvoice
 * 
 */

public class Customer extends ServicePrice implements CustomerInvoice {
    private String name;
    private String email;
    private boolean member;

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
        
    }
    
    public void setMember(boolean member) {
        this.member = member;
    }
    
    public String currentTime() {
        String hari[] = {"Minggu","Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu"};
        Date sekarang = new Date();
        
    }

    @Override
    public String currentTimer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}