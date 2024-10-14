// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner

import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    Arraylist<String> daftarMakananKering = new ArrayList<>();
    Arraylist<String> daftarMakananBasah = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void tambahMakananKering() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Masukkan Nama Makanan : ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Jumlah Makanan : ");
        int jumlah = scanner.nextInt();

        System.out.print("Masukkan Harga Makanan : ");
        double harga = scanner.nextDouble();

        System.out.print("Masukkan Brand Makanan : ");
        String brand = scanner.nextLine();
        // Todo : Create a new object for MakananKering
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
    System out
        // Todo : Create a new object for MakananBasah
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
        } else {
            // Todo : Create print notification for Makanan Kering  
            for 
            }
            // Todo : Create print notification for  Makanan Basah
            for 
            }
        }
    
