public class penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    public penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }

    public void tampilkanDetailPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan + " ---> Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan + " ---> Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Harga Tiket: Rp " + hargaTiket);
        System.out.println();
    }

    public float getHargaTiket() {
        return hargaTiket;
    }

    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }
}