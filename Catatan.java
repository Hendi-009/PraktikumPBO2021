package Finansial;

public abstract class Catatan {
    protected int tanggal;
    protected int minggu;
    protected int bulan;
    protected int tahun;   
    protected int no;
    protected String nama;
    protected long jumlah;

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public int getMinggu() {
        return minggu;
    }

    public void setMinggu(int minggu) {
        this.minggu = minggu;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getJumlah() {
        return jumlah;
    }

    public void setJumlah(long jumlah) {
        this.jumlah = jumlah;
    }
    
    public abstract void display(int tanggal, int minggu, int bulan, int tahun, int no, String nama, long jumlah);
}
