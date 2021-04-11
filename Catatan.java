
package Finansial;

public class Catatan {
    private int tanggal;
    private int bulan;
    private int tahun;
    
    public int getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(int tanggal){
        this.tanggal = tanggal;
    }    
    
    public int getBulan(){
        return bulan;
    }
    
    public void setBulan(int bulan){
        this.bulan = bulan;
    }  
    
    public int getTahun(){
        return tahun;
    }
    
    public void setTahun(int tahun){
        this.tahun = tahun;
    }    

    public void display1(int tanggal, int bulan, int tahun){
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Bulan : " + bulan);
        System.out.println("Tahun : " + tahun);
        
    }
    
    protected void display1(int no1, String nama1, int jumlah1){
        System.out.println("Nomor : " + no1);
        System.out.println("Keterangan : " + nama1);
        System.out.println("Nominal pengeluaran : " + jumlah1);
    }
    
    protected void display(int no, String nama, int jumlah){
        System.out.println("Nomor : " + no);
        System.out.println("Keterangan : " + nama);
        System.out.println("Nominal pengeluaran : " + jumlah);
    }
}
