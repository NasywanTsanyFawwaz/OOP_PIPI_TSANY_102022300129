// Don't delete any comments below!!!
public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String name;
    private int jumlah;
    private double harga;
    private String bahan;
    // Todo : Create Constructor of MakananBasah
    public MakananBasah(String name, int jumlah, double harga, String bahan) {
    this.name = name;
    this.jumlah = jumlah;
    this.harga = harga;
    this.bahan = bahan;
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
    public String getbahan(){
        return bahan;
    }
    public void setbahan(String bahan){
        this.bahan = bahan;
    }
    // Todo : Create Method ShowData
    public void display(){
        System.out.println("Name : " + name + "Jumlah : " + jumlah + "Harga : " + harga + "Bahan : " + bahan);
}
}
