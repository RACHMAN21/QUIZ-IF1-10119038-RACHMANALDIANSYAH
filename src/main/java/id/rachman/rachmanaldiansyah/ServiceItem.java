/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.rachmanaldiansyah;
/*
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi interface ServiceItem
 *
 */
public interface ServiceItem {
    public void displayService();
    public float getPrice(int serviceItem);
    public float getSale(boolean isMember, float parServicePrice);
    public boolean checkMemberStatus(String statusMember);
}