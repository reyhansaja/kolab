package kolab;

import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        menu();
        System.out.print("Pilih menu: ");
        menu = sc.nextInt();
    }
    public static void menu() {
        System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
        System.out.println("1. Tambah Data Prestasi");
        System.out.println("2. Tampilkan Semua Prestasi");
        System.out.println("3. Analisi Prestasi Berdasarkan Jenis");
        System.out.println("4. Keluar");
    }
}