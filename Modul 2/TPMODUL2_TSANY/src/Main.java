public class Main {
    public static void main(String[] args) {
        Kucing Kucing1 = new Kucing("Ninja", 2, "British");
        Burung burung1 = new Burung("Genjor", 1, "Unggu");

        System.out.println("Detail Hewan");
        System.out.println();
       
        System.out.println("ini adalah " + Kucing1.getNama() + " !");
        Kucing1.suara();
        Kucing1.makan();
        Kucing1.makan("whiskas");

        System.out.println();

        System.out.println("ini adalah " + burung1.getNama() + " !");
        burung1.suara();
        burung1.makan();
        burung1.makan("biji-bijian");

        System.out.println();
        Kucing1.infoHewan();
        burung1.infoHewan();
    }
}
