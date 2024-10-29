package Tugas4;

class TiketPesawat {
    public static void main(String[] args) {
        String maskapai = "Garuda Indonesia";
        String kelasPenerbangan = "Ekonomi";
        int hargaDasar = 1000000;
        int hargaTotal;

        if (maskapai.equals("Garuda Indonesia")) {
            if (kelasPenerbangan.equals("Ekonomi")) {
                hargaTotal = hargaDasar + 300000;
            } else if (kelasPenerbangan.equals("Bisnis")) {
                hargaTotal = hargaDasar + 800000;
            } else if (kelasPenerbangan.equals("First Class")) {
                hargaTotal = hargaDasar + 1500000;
            } else {
                hargaTotal = hargaDasar;
            }
        } else if (maskapai.equals("Lion Air")) {
            if (kelasPenerbangan.equals("Ekonomi")) {
                hargaTotal = hargaDasar + 200000;
            } else if (kelasPenerbangan.equals("Bisnis")) {
                hargaTotal = hargaDasar + 600000;
            } else if (kelasPenerbangan.equals("First Class")) {
                hargaTotal = hargaDasar + 1200000;
            } else {
                hargaTotal = hargaDasar;
            }
        } else {
            hargaTotal = hargaDasar;
        }

        System.out.println("Maskapai: " + maskapai);
        System.out.println("Kelas Penerbangan: " + kelasPenerbangan);
        System.out.println("Harga Total: " + hargaTotal);
    }
}
