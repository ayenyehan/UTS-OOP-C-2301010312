
package buku;

import java.util.Scanner;

/**
 *
 * @author Grace Maya
 */
public class AplikasiPerpustakaan {
    static Scanner scanner = new Scanner(System.in);
    static Buku[] daftarBuku = new Buku[100];
    static int jumlahBuku = 0;

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Ubah Data Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    tampilkanBuku();
                    break;
                case 3:
                    ubahBuku();
                    break;
                case 4:
                    hapusBuku();
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    // Tambah buku baru
    public static void tambahBuku() {
        System.out.print("Masukkan kode buku: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan nama penulis: ");
        String penulis = scanner.nextLine();

        daftarBuku[jumlahBuku] = new Buku(kode, judul, penulis);
        jumlahBuku++;
        System.out.println("Buku berhasil ditambahkan.");
    }

    // Tampilkan semua buku
    public static void tampilkanBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Belum ada data buku.");
        } else {
            for (int i = 0; i < jumlahBuku; i++) {
                System.out.println(daftarBuku[i]);
            }
        }
    }

    // Ubah data buku
    public static void ubahBuku() {
        System.out.print("Masukkan kode buku yang ingin diubah: ");
        String kode = scanner.nextLine();

        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarBuku[i].getKodeBuku().equals(kode)) {
                System.out.print("Masukkan judul baru: ");
                String judul = scanner.nextLine();
                System.out.print("Masukkan penulis baru: ");
                String penulis = scanner.nextLine();
                daftarBuku[i].setJudul(judul);
                daftarBuku[i].setPenulis(penulis);
                System.out.println("Data buku berhasil diubah.");
                return;
            }
        }
        System.out.println("Buku dengan kode tersebut tidak ditemukan.");
    }

    // Hapus buku
    public static void hapusBuku() {
        System.out.print("Masukkan kode buku yang ingin dihapus: ");
        String kode = scanner.nextLine();

        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarBuku[i].getKodeBuku().equals(kode)) {
                for (int j = i; j < jumlahBuku - 1; j++) {
                    daftarBuku[j] = daftarBuku[j + 1];
                }
                jumlahBuku--;
                System.out.println("Buku berhasil dihapus.");
                return;
            }
        }
        System.out.println("Buku dengan kode tersebut tidak ditemukan.");
    }
}
