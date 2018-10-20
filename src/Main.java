/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Menghitung besar tegangan menggunakan hukum ohm V = R.I
 *
 */
public class Main {
    public static void main(String[] args) {
        Baterai bat = new Baterai();

        bat.baterai();
        System.out.println("Kuat Arus : "+bat.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+bat.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+bat.baterai(bat.getKuatArus(),bat.getHambatan())+" volt");

    }
}
