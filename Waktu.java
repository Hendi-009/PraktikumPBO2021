package Finansial;

public class Waktu {
    protected int tanggal;
    protected int minggu;
    protected int bulan;
    protected int tahun;
    
    public int getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(int tanggal){
        this.tanggal = tanggal;
    }    
    
    public int getMinggu(){
        return minggu;
    }
    
    public void setMinggu(int minggu){
        this.minggu = minggu;
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

    public void display(int tanggal, int minggu, int bulan, int tahun){
        System.out.println("Tanggal : " + tanggal);
        System.out.println("Minggu : " + minggu);
        System.out.println("Bulan : " + bulan);
        System.out.println("Tahun : " + tahun);
        
    }
    
    protected void display(int no, String nama, int jumlah){
        System.out.println(no);
        System.out.println(nama);
        System.out.println(jumlah);
    }
}
