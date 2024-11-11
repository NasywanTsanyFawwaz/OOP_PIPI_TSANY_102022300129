class KomputerGame extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;

    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerGame (int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    public void Informasi(){
        super.Informasi();
        if (vipCard) {
            System.out.println("Fasilitas Ruangan Premium : ");
            System.out.println("- Ruangan Ber Kipas Pribadi");
            System.out.println("- Kursi Kondangan Miring Dikit");
            System.out.println("- Kumputer Spesifikasi Jadoel");
            System.out.println("- Koneksi Internet Hotspot Dari Hp");
        }
    }
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void login(String login){
        System.out.println("Login : " + login);
    }
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int Bermain){
        System.out.println("Bermain Selama : " + Bermain);
    }
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int Bermain, int menitTambahan){
        System.out.println("Bermain Selama : " + Bermain + "Nambah Billing Selama : " + menitTambahan);
    }

}