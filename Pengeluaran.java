package Finansial;

public class Pengeluaran extends Catatan {
    private int no1;
    private String nama1;
    private int jumlah1;
    
    public int getNo1(){
        return no1;
    }
    
    public void setNo1(int no1){
        this.no1 = no1;
    }
    
    public String getNama1(){
        return nama1;
    }
    
    public void setNama1(String nama1){
        this.nama1 = nama1;
    }    
    
    public int getJumlah1(){
        return jumlah1;
    }
    
    public void setJumlah1(int jumlah1){
        this.jumlah1 = jumlah1;
    }

    public void display1(int no1, String nama1, int jumlah1){
        System.out.println("Nomor : " + no1);
        System.out.println("Keterangan : " + nama1);
        System.out.println("Nominal pengeluaran : " + jumlah1);
    }
}
