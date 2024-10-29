package Tugas4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TiketPesawatRefactored {

    private static final Map<String, Map<String, Integer>> hargaKelasPerMaskapai = new HashMap<>();

    static {
        // Harga untuk Garuda Indonesia
        Map<String, Integer> hargaGaruda = new HashMap<>();
        hargaGaruda.put("Ekonomi", 300000);
        hargaGaruda.put("Bisnis", 800000);
        hargaGaruda.put("First Class", 1500000);
        hargaKelasPerMaskapai.put("Garuda Indonesia", hargaGaruda);

        // Harga untuk Lion Air
        Map<String, Integer> hargaLion = new HashMap<>();
        hargaLion.put("Ekonomi", 200000);
        hargaLion.put("Bisnis", 600000);
        hargaLion.put("First Class", 1200000);
        hargaKelasPerMaskapai.put("Lion Air", hargaLion);
    }

    /**
     * menghitung harga total pemilihan kelas pesawat
     * @param maskapai menunjukan parameter maskapai
     * @param kelas menunjukan parameter kelas
     * @param hargaDasar menunjukan parameter
     * @return
     */
    public static int hitungHargaTotal(String maskapai, String kelas, int hargaDasar) {
        Map<String, Integer> hargaKelas = hargaKelasPerMaskapai.getOrDefault(maskapai, new HashMap<>());
        return hargaDasar + hargaKelas.getOrDefault(kelas, 0);
    }

    /**
     *
     * @param maskapai
     * @return
     */
    public static String pilihKelas(String maskapai) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> kelasTersedia = hargaKelasPerMaskapai.get(maskapai);

        if (kelasTersedia == null) {
            System.out.println("Maskapai tidak ditemukan.");
            return null;
        }

        System.out.println("Pilih kelas penerbangan untuk maskapai " + maskapai + ":");

        int index = 1;
        for (String kelas : kelasTersedia.keySet()) {
            System.out.println(index + ". " + kelas + " - Rp" + kelasTersedia.get(kelas));
            index++;
        }

        System.out.print("Masukkan nomor kelas yang dipilih: ");
        int pilihan = scanner.nextInt();

        // Validasi pilihan kelas
        if (pilihan < 1 || pilihan > kelasTersedia.size()) {
            System.out.println("Pilihan tidak valid.");
            return null;
        }

        // Mendapatkan nama kelas berdasarkan pilihan
        String kelasDipilih = (String) kelasTersedia.keySet().toArray()[pilihan - 1];
        return kelasDipilih;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama maskapai: ");
        String maskapai = scanner.nextLine();

        String kelasPenerbangan = pilihKelas(maskapai);
        if (kelasPenerbangan == null) {
            System.out.println("Pemilihan kelas gagal.");
            return;
        }

        System.out.print("Masukkan harga dasar: ");
        int hargaDasar = scanner.nextInt();

        int hargaTotal = hitungHargaTotal(maskapai, kelasPenerbangan, hargaDasar);

        System.out.println("\n--- Informasi Tiket ---");
        System.out.println("Maskapai: " + maskapai);
        System.out.println("Kelas Penerbangan: " + kelasPenerbangan);
        System.out.println("Harga Total: Rp" + hargaTotal);
    }
}
