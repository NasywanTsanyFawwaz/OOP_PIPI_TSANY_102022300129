public class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }
    
    public void suara() {
        System.out.println("Hewan ini bersuara.");
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan + ".");
    }

    public void infoHewan() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun.");
    }
}