package kolab;

import java.util.Scanner;

public class tugas {
        static Scanner sc = new Scanner(System.in);
        static String[] nama = new String[100];
        static int[] nim = new int[100];
        static String[] jenis = new String[100];
        static String[] tingkat = new String[100];
        static int[] tahun = new int[100];
        static int jumlahPrestasi = 0;

        public static void main(String[] args) {
            int pilihan = 0;

            while(pilihan !=0){
                System.out.println("\n=== MENU PRESTASI MAHASISWA ===");
                System.out.println("1. Tambah Data Prestasi");
                System.out.println("2. Tapilkan Semua Prestasi");
                System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu");
                pilihan = sc.nextInt();
                sc.nextLine();

                if(pilihan == 1){
                    tambahPrestasi();
                }else if(pilihan == 2){
                    lihatSemuaPrestasi();
                }else if(pilihan == 3){
                    cariPrestasi();
                }else if(pilihan == 4){
                    System.out.println("Program selesai, terima kasih :)");
                }else{
                    System.out.println("Pilihan salah, coba lagi");
                }
            }
        }
        static void tambahPrestasi(){
            if (jumlahPrestasi >= 100) {
                System.out.println("Kapasitas penuh! Tidak bisa tambah data lagi!!");
                return;
            }
            System.out.print("Masukkan Nama Mahasiswa: ");
            nama[jumlahPrestasi] = sc.nextLine();
            System.out.print("Masukkan NIM Mahasiswa: ");
            nim[jumlahPrestasi] = sc.nextInt();
            System.out.print("Masukkan Jenis Prestasi: ");
            jenis[jumlahPrestasi] = sc.nextLine();
            System.out.print("Masukkan Tingkat Prestasi (Lokal / Nasional / Internasional): ");
            tingkat[jumlahPrestasi] = sc.nextLine();
            
        }
}