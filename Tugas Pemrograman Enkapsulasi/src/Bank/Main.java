/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author udaxd
 */
public class Main {

    public static void main(String args[]) {
        int tmp;
        boolean status;
        Nasabah Agus = new Nasabah("Agus", "Daryanto");
        System.out.println("Nasabah atas nama : " + Agus.getNamaAwal() + " " + Agus.getNamaAkhir());
        Agus.setTabungan(new Tabungan(5000));
        tmp = Agus.getTabungan().getSaldo();
        
        System.out.println("Saldo awal : " + tmp);
        Agus.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        status = Agus.getTabungan().ambilUang(6000);
        System.out.print("Jumlah uang yang diambil : 6000");
        
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        Agus.getTabungan().simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");
        status = Agus.getTabungan().ambilUang(4000);
        System.out.print("Jumlah uang yang diambil : 4000");
        
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        
        status = Agus.getTabungan().ambilUang(1600);
        System.out.print("Jumlah uang yang diambil : 1600");
        
        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        Agus.getTabungan().simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");
        tmp = Agus.getTabungan().getSaldo();
        System.out.println("Saldo sekarang = " + tmp);

        Nasabah budi = new Nasabah("Budi", "Hartono");
        budi.setTabungan(new Tabungan(10000));
        System.out.println(budi.toString());
        System.out.println(Agus.toString());
        
        budi.getTabungan().simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");
        System.out.println(budi.toString());
        System.out.println(Agus.toString());
        
        budi.getTabungan().transfer(Agus.getTabungan(), 5000);
        System.out.println();
        System.out.println("Jumlah yang ditransfer Budi = 5000");
        System.out.println(budi.toString());
        System.out.println(Agus.toString());



//        budi.getTabungan().transfer(nasabah.getTabungan(), 5000);
//        System.out.println(budi.toString());
//        System.out.println(nasabah.toString());

    }
}

