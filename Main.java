package Finansial;

public class Main {
    public static void main(String []args){
        
        //objek tanggal
        Waktu harian = new Waktu();
        Waktu mingguan = new Waktu();
        Waktu bulanan = new Waktu();
        Waktu tahunan = new Waktu();

        //objek pendapatan
        Catatan activeIncome = new Catatan();
        Catatan passiveIncome = new Catatan();
        
        //objek pengeluaran
        Catatan wajib = new Catatan();
        Catatan cicilan = new Catatan();
        
        harian.setTanggal(01);
        mingguan.setMinggu(1);
        bulanan.setBulan(01);
        tahunan.setTahun(2021);
        
        activeIncome.setNo(01);
        activeIncome.setNama("Gaji bulanan");
        activeIncome.setJumlah(3700000);
        
        passiveIncome.setNo(02);
        passiveIncome.setNama("Penyewaan kos");
        passiveIncome.setJumlah(1500000);
        
        wajib.setNo(01);
        wajib.setNama("Dapur");
        wajib.setJumlah(400000);
        
        cicilan.setNo(02);
        cicilan.setNama("Mobil");
        cicilan.setJumlah(1500000);
        
        harian.display(harian.getTanggal(), mingguan.getMinggu(), bulanan.getBulan(), tahunan.getTahun());
        
        activeIncome.display(activeIncome.getNo(), activeIncome.getNama(), activeIncome.getJumlah());
        passiveIncome.display(passiveIncome.getNo(),passiveIncome.getNama(), passiveIncome.getJumlah());
        
        wajib.display(wajib.getNo(), wajib.getNama(), wajib.getJumlah());
        cicilan.display(cicilan.getNo(), cicilan.getNama(), cicilan.getJumlah());
    }
}    