import java.util.Scanner;

public class GajiKaryawan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] gaji = {
                5000000,
                6500000,
                9500000
        };

        int[] lembur = { 30, 32, 34, 36, 38 };

        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        String golongan = input.next().toUpperCase();

        System.out.print("Masukkan Jumlah Jam Lembur: ");
        int jamLembur = input.nextInt();

        double gajiPokok = 0;
        double persenLembur = 0;

        if (golongan.equals("A")) {
            gajiPokok = gaji[0];
        } else if (golongan.equals("B")) {
            gajiPokok = gaji[1];
        } else if (golongan.equals("C")) {
            gajiPokok = gaji[2];
        } else {
            System.out.println("Golongan tidak valid!");
            return;
        }

        if (jamLembur == 1) {
            persenLembur = lembur[0];
        } else if (jamLembur == 2) {
            persenLembur = lembur[1];
        } else if (jamLembur == 3) {
            persenLembur = lembur[2];
        } else if (jamLembur == 4) {
            persenLembur = lembur[3];
        } else if (jamLembur >= 5) {
            persenLembur = lembur[4];
        }

        double gajiLembur = (persenLembur / 100) * gajiPokok;

        double totalGaji = gajiPokok + gajiLembur;

        // Output
        System.out.println("\n===== DATA GAJI KARYAWAN =====");
        System.out.println("Golongan           : " + golongan);
        System.out.println("Gaji Pokok         : Rp " + gajiPokok);
        System.out.println("Jam Lembur         : " + jamLembur + " Jam");
        System.out.println("Persen Lembur      : " + persenLembur + "%");
        System.out.println("Gaji Lembur        : Rp " + gajiLembur);
        System.out.println("Total Gaji         : Rp " + totalGaji);

        input.close();
    }
}
