public class MakananKering {
// Don't delete any comments below!!!


    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String name;
    private int jumlah;
    private double harga;
    private String brand;

    // Todo : Create Constructor of MakananKering
    public MakananKering(String name, int jumlah, double harga, String brand) {
        this.name = name;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
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
    public String getbrand(){
        return brand;
    }
    public void setbrand(String brand){
        this.brand = brand;
    }
    // Todo : Create Method ShowData
    public void display(){
        System.out.println("Name : " + name + "Jumlah : " + jumlah + "Harga : " + harga + "Brand : " + brand);
    }
}
