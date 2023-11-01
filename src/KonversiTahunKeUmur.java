import java.util.Calendar;
import java.util.Scanner;

/**
 * The type Konversi tahun ke umur.
 */
public class KonversiTahunKeUmur {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun kelahiran: ");
        int tahunKelahiran = input.nextInt();

        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        int umur = PerhitunganUmur(tahunSekarang, tahunKelahiran);

        System.out.println("Umur Anda sekarang adalah " + umur + " tahun.");

        input.close();
    }

    /**
     *
     * @param tahunSekarang
     * @param tahunkelahiran
     * @return
     */
    private static int PerhitunganUmur(int tahunSekarang, int tahunkelahiran) {
        return tahunSekarang - tahunkelahiran;
    }
}
