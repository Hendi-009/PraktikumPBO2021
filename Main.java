package Finansial;

//import java.util.*;
//import java.util.ArrayList;

public class Main {
    public static void main(String []args){
        
        //objek pendapatan
        Pemasukkan activeIncome = new Pemasukkan();
        Pemasukkan passiveIncome = new Pemasukkan();
        
        //objek pengeluaran
        Pengeluaran wajib = new Pengeluaran();
        Pengeluaran cicilan = new Pengeluaran();
        
//       Scanner in = new Scanner(System.in);
        
        
        activeIncome.setTanggal(3700000);
        activeIncome.setBulan(3700000);
        activeIncome.setTahun(3700000);
        activeIncome.setNo(3700000);
        activeIncome.setNama("Gaji bulanan");
        activeIncome.setJumlah(3700000);
        
        passiveIncome.setTanggal(3700000);
        passiveIncome.setBulan(3700000);
        passiveIncome.setTahun(3700000);
        passiveIncome.setNo(3700000);
        passiveIncome.setNama("Penyewaan kos");
        passiveIncome.setJumlah(1500000);
        
        wajib.setTanggal(3700000);
        wajib.setBulan(3700000);
        wajib.setTahun(3700000);
        wajib.setNo1(3700000);
        wajib.setNama1("Dapur");
        wajib.setJumlah1(400000);
        
        cicilan.setTanggal(3700000);
        cicilan.setBulan(3700000);
        cicilan.setTahun(3700000);
        cicilan.setNo1(3700000);
        cicilan.setNama1("Mobil");
        cicilan.setJumlah1(1500000);
        
        activeIncome.display(activeIncome.getNo(), activeIncome.getNama(), activeIncome.getJumlah());
        passiveIncome.display(passiveIncome.getNo(),passiveIncome.getNama(), passiveIncome.getJumlah());
        
        wajib.display1(wajib.getNo1(), wajib.getNama1(), wajib.getJumlah1());
        cicilan.display1(cicilan.getNo1(), cicilan.getNama1(), cicilan.getJumlah1());
    }
}    
