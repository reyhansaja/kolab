package kolab;

import java.util.Scanner;

public class tugas {
    static String[][] dataPrestasi = new String[100][5]; 
    static int jumlahPrestasi = 0; 
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan = 0;

        while (pilihan != 4) {
            System.out.println("\n=== MENU PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Lihat Semua Prestasi");
            System.out.println("3. Cari Prestasi Berdasarkan Jenis");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

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
    static void tambahPrestasi() {
    if (jumlahPrestasi >= 100) {
        System.out.println("Kapasitas penuh! Tidak bisa menambah data lagi.");
        return;
    }

    System.out.print("Masukkan Nama Mahasiswa: ");
    dataPrestasi[jumlahPrestasi][0] = sc.nextLine();
    System.out.print("Masukkan NIM Mahasiswa: ");
    dataPrestasi[jumlahPrestasi][1] = sc.nextLine();
    System.out.print("Masukkan Jenis Prestasi: ");
    dataPrestasi[jumlahPrestasi][2] = sc.nextLine();
    System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
    dataPrestasi[jumlahPrestasi][3] = sc.nextLine();

    if (!dataPrestasi[jumlahPrestasi][3].equalsIgnoreCase("Lokal") && 
        !dataPrestasi[jumlahPrestasi][3].equalsIgnoreCase("Nasional") && 
        !dataPrestasi[jumlahPrestasi][3].equalsIgnoreCase("Internasional")) {
        System.out.println("Tingkat prestasi tidak valid. Harus Lokal, Nasional, atau Internasional.");
        return;
    }

    System.out.print("Masukkan Tahun Prestasi (2010 - 2024): ");
    int tahunPrestasi = sc.nextInt();
    sc.nextLine(); 

    if (tahunPrestasi < 2010 || tahunPrestasi > 2024) {
        System.out.println("Tahun tidak valid. Harus antara 2010 dan 2024.");
        return;
    }
    dataPrestasi[jumlahPrestasi][4] = String.valueOf(tahunPrestasi);

    jumlahPrestasi++;
    System.out.println("Prestasi berhasil ditambahkan!");
}

static void lihatSemuaPrestasi() {
    if (jumlahPrestasi == 0) {
        System.out.println("Belum ada data prestasi.");
    } else {
        System.out.println("\n=== DAFTAR SEMUA PRESTASI ===");
        for (int i = 0; i < jumlahPrestasi; i++) {
            System.out.println("Nama: " + dataPrestasi[i][0] +
                               " | NIM: " + dataPrestasi[i][1] +
                               " | Jenis: " + dataPrestasi[i][2] +
                               " | Tingkat: " + dataPrestasi[i][3] +
                               " | Tahun: " + dataPrestasi[i][4]);
        }
    }
}

static void cariPrestasi() {
    System.out.print("Masukkan Jenis Prestasi yang ingin dicari: ");
    String jenisDicari = sc.nextLine();
    boolean ditemukan = false;

    System.out.println("\n=== HASIL PENCARIAN ===");
    for (int i = 0; i < jumlahPrestasi; i++) {
        if (dataPrestasi[i][2].equalsIgnoreCase(jenisDicari)) {
            System.out.println("Nama: " + dataPrestasi[i][0] +
                               " | NIM: " + dataPrestasi[i][1] +
                               " | Tingkat: " + dataPrestasi[i][3] +
                               " | Tahun: " + dataPrestasi[i][4]);
            ditemukan = true;
        }
    }

    if (!ditemukan) {
        System.out.println("Tidak ada prestasi dengan jenis tersebut.");
    }
}
}
