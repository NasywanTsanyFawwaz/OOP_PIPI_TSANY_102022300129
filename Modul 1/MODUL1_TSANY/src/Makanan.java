// Don't delete any comments below!!!

public class Makanan {
    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    private String name;
    private int jumlah;
    private double harga;
    // Todo : Create Constructor of Makanan
    public Makanan(String name, int jumlah, double harga) {
        this.name = name;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    // Todo : Create Getter and Setter
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getjumlah(){
        return jumlah;
    }
    public void setjumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public double getharga(){
        return harga;
    }
    public void setharga(double harga){
        this.harga = harga;
    }
}