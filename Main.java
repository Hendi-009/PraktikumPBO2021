package Finansial;

public final class Main {
    public static void main(String []args){
        final String nama = "Catatan";

        //objek pendapatan
        Pemasukan activeIncome = new Pemasukan(01, 1, 01, 2021, 01, "Gajian", 4000000);
        Pemasukan passiveIncome = new Pemasukan(01, 1, 01, 2021, 02, "Penyewaan kos", 2000000);
        
        //objek pengeluaran
        Pengeluaran wajib = new Pengeluaran(01, 1, 01, 2021, 01, "Dapur", 400000);
        Pengeluaran cicilan = new Pengeluaran(01, 1, 01, 2021, 02, "Cicil mobil", 1500000);
        
        System.out.println("Jumlah " + nama + " Pemasukan: " + Pemasukan.getpemasukan());    
        activeIncome.display(activeIncome.getTanggal(), activeIncome.getMinggu(), activeIncome.getBulan(),activeIncome.getTahun(), 
                             activeIncome.getNo(), activeIncome.getNama(), activeIncome.getJumlah());
        System.out.println("\n");
        passiveIncome.display(passiveIncome.getTanggal(), passiveIncome.getMinggu(), passiveIncome.getBulan(), passiveIncome.getTahun(),
                              passiveIncome.getNo(),passiveIncome.getNama(), passiveIncome.getJumlah());
        System.out.println("\n");
        System.out.println("Jumlah " + nama + " Pemasukan: " + Pengeluaran.getpengeluaran());
        wajib.display(wajib.getTanggal(), wajib.getMinggu(), wajib.getBulan(),wajib.getTahun(),
                      wajib.getNo(), wajib.getNama(), wajib.getJumlah());
        System.out.println("\n");
        cicilan.display(cicilan.getTanggal(), cicilan.getMinggu(), cicilan.getBulan(),cicilan.getTahun(),
                        cicilan.getNo(), cicilan.getNama(), cicilan.getJumlah());
    }
}    