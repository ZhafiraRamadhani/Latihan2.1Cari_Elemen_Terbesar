import java.util.Scanner;

public class Cari_Elemen_Terbesar {
    // Tulis kode disini(SAYA UBAH NAMA CLASSNYA)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input dari pengguna
        System.out.print("Masukkan beberapa angka (pisahkan dengan spasi): ");
        String input = scanner.nextLine();

        // Memisahkan input berdasarkan spasi
        String[] angkaString = input.split(" ");

        // Membuat array untuk menyimpan angka
        int[] angkaArray = new int[angkaString.length];

        // Mengonversi string ke integer dan menyimpannya dalam array
        for (int i = 0; i < angkaString.length; i++) {
            angkaArray[i] = Integer.parseInt(angkaString[i]);
        }

        // Mencari angka terbesar
        int angkaTerbesar = angkaArray[0]; // Inisialisasi dengan elemen pertama

        for (int i = 1; i < angkaArray.length; i++) {
            if (angkaArray[i] > angkaTerbesar) {
                angkaTerbesar = angkaArray[i]; // Update angka terbesar jika ditemukan yang lebih besar
            }
        }

        // Menampilkan hasil
        System.out.println("Angka terbesar: " + angkaTerbesar);

        scanner.close();
    }
}