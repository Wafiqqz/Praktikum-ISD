package Jurnal02;
public class ATK implements Comparable<ATK>  {
    String kodeBarang;
    String jenisBarang;
    String namaBarang;
    int stokBarang;

    public ATK (String kodeBarang, String jenisBarang, String namaBarang, int stokBarang) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    @Override
    public int compareTo(ATK o) {
        // TODO Auto-generated method stub
        return this.kodeBarang.compareTo(kodeBarang);
    }
    
}