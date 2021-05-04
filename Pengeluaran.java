package Finansial;

public class Pengeluaran extends Catatan{
    private static int pengeluaran;
    
    public Pengeluaran(int tanggal, int minggu, int bulan, int tahun, int no, String nama, long jumlah){
        this.tanggal = tanggal;
        this.minggu = minggu;
        this.bulan = bulan;
        this.tahun = tahun;
        this.no = no;
        this.nama = nama;
        this.jumlah = jumlah;
        pengeluaran++;
    }
    
    public static int getpengeluaran(){
        return pengeluaran;
    }
    
    public static void setpengeluaran(int pengeluaran){
        Pengeluaran.pengeluaran = pengeluaran;
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
