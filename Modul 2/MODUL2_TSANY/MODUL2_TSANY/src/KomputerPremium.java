class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium (int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    public void Informasi(){
        super.Informasi();
        if (ruangPrivat) {
            System.out.println("Fasilitas Ruangan Standar : ");
            System.out.println("- Ruangan Dingin Beku");
            System.out.println("- Kursi Proper");
            System.out.println("- Komputer Harga 100 Juta");
            System.out.println("- Koneksi Internet Menggunakan Starling");
        }
    }
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorkomputer){
        System.out.println("Memesan Komputer Nomor : " + nomorkomputer);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String TambahLayanan){
        System.out.println("Memesan Layanan Makan : " + TambahLayanan);
    }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String TambahLayanan, String Minuman){
        System.out.println("Menambah Layanan Makan : " + TambahLayanan + "Memesan Minuman : " + Minuman);
    }
}
