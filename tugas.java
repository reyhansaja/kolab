package kolab;

import java.util.Scanner;

public class tugas {
    static String[][] dataPrestasi = new String[100][5]; // Array 2 dimensi (maksimum 100 data, 5 kolom)
    static int jumlahPrestasi = 0; // Indeks untuk melacak jumlah data
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan = 0;

        while (pilihan != 4) {
            System.out.println("\n=== MENU PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Lihat Semua Prestasi");
            System.out.println("3. Cari Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer input

            if (pilihan == 1) {
                tambahPrestasi();
            } else if (pilihan == 2) {
                lihatSemuaPrestasi();
            } else if (pilihan == 3) {
                cariPrestasi();
            } else if (pilihan == 4) {
                System.out.println("Program selesai. Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }