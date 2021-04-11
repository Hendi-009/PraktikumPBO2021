package Finansial;

public class Pemasukkan extends Catatan{  
    private int no;
    private String nama;
    private int jumlah;
    
    public int getNo(){
        return no;
    }
    
    public void setNo(int no){
        this.no = no;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }    
    
    public int getJumlah(){
        return jumlah;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public void display(int no, String nama, int jumlah){
        System.out.println("Nomor : " + no);
        System.out.println("Keterangan : " + nama);
        System.out.println("Nominal pemasukan : " + jumlah);
    }
}
