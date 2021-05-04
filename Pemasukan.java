package Finansial;

public class Pemasukan extends Catatan {
    private static int pemasukan;
    
    public Pemasukan(int tanggal, int minggu, int bulan, int tahun, int no, String nama, long jumlah){
        this.tanggal = tanggal;
        this.minggu = minggu;
        this.bulan = bulan;
        this.tahun = tahun;
        this.no = no;
        this.nama = nama;
        this.jumlah = jumlah;
        pemasukan++;
    }
    
    public static int getpemasukan(){
        return pemasukan;
    }
    
    public static void setpemasukan(int pemasukan){
        Pemasukan.pemasukan = pemasukan;
    }
    
    //run time polymorphism
    @Override
    public void display(int tanggal, int minggu, int bulan, int tahun, int no, String nama, long jumlah){
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Minggu : " + minggu);
        System.out.println("Bulan : " + bulan);
        System.out.println("Tahun : " + tahun);
        System.out.println("Nomor : " + no);
        System.out.println("Keterangan : " + nama);
        System.out.println("Nominal : " + jumlah);
    }
}
