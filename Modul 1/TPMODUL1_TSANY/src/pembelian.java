import java.util.ArrayList;
import java.util.Scanner;

public class pembelian {
    private static ArrayList<penerbangan> daftarPenerbangan = new ArrayList<>();
    private static penumpang penumpang;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        // Menambahkan penerbangan
        tambahPenerbangan();

        do {
            System.out.println("====== EAD Ticket Booking System ======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    tampilkanDaftarPenerbangan();
                    break;
                case 2:
                    beliTiket(input);
                    break;
                case 3:
                    tampilkanPesanan();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 4);

        input.close();
    }

    private static void tambahPenerbangan() {
        daftarPenerbangan.add(new penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));
    }

    private static void tampilkanDaftarPenerbangan() {
        System.out.println("\nDaftar Penerbangan:");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarPenerbangan.get(i).tampilkanDetailPenerbangan();
        }
    }

    private static void beliTiket(Scanner input) {
        System.out.println("\nSilahkan isi data diri anda terlebih dahulu!");
        System.out.println("----------------------------------------------");
        System.out.print("Masukkan NIK: ");
        String NIK = input.nextLine();
        System.out.print("Masukkan Nama Depan: ");
        String namaDepan = input.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        String namaBelakang = input.nextLine();

        penumpang = new penumpang(NIK, namaDepan, namaBelakang);
        System.out.println("\nTerima kasih telah mengisi Data Pelanggan. Silakan Pilih Tiket Penerbangan Yang Tersedia!");
        tampilkanDaftarPenerbangan();

        System.out.print("Pilih nomor penerbangan (1, 2): ");
        int nomorPenerbangan = input.nextInt();
        
        if (nomorPenerbangan > 0 && nomorPenerbangan <= daftarPenerbangan.size()) {
            System.out.println("Pemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
        } else {
            System.out.println("Pemesanan Tiket Gagal, silakan coba lagi.");
        }
    }

    private static void tampilkanPesanan() {
        if (penumpang == null) {
            System.out.println("\nPembelian Tiket Tidak Ada");
            return;
        }

        System.out.println("\n===== Detail Tiket Penerbangan =====");
        penumpang.tampilkanDetailPenumpang();
        
        // Tampilkan detail penerbangan terakhir
        if (!daftarPenerbangan.isEmpty()) {
            daftarPenerbangan.get(0).tampilkanDetailPenerbangan(); // Tampilkan penerbangan yang pertama
        }
    }
}