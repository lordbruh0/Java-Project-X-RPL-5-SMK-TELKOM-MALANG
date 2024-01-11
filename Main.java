import java.util.ArrayList;
import java.util.List;

class Orang {
    private String nama;
    private double beratBadan;

    public Orang(String nama, double beratBadan) {
        this.nama = nama;
        this.beratBadan = beratBadan;
    }

    public String getNama() {
        return nama;
    }

    public double getBeratBadan() {
        return beratBadan;
    }

    public void tambahBeratBadan(double tambahanBerat) {
        beratBadan += tambahanBerat;
    }

    @Override
    public String toString() {
        return "Orang{" +
                "nama='" + nama + '\'' +
                ", beratBadan=" + beratBadan +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Orang> daftarOrang = new ArrayList<>();

        // Menambahkan orang pertamaS
        Orang orang1 = new Orang("Orang 1", 60.0);
        daftarOrang.add(orang1);

        // Menambahkan orang kedua
        Orang orang2 = new Orang("Orang 2", 70.0);
        daftarOrang.add(orang2);

        // Menambahkan berat badan 50 kg untuk setiap orang
        for (Orang orang : daftarOrang) {
            orang.tambahBeratBadan(50.0);
        }

        // Menampilkan informasi setiap orang setelah penambahan berat badan
        for (Orang orang : daftarOrang) {
            System.out.println(orang);
        }

        // Menghitung rata-rata berat badan
        double totalBeratBadan = 0.0;
        for (Orang orang : daftarOrang) {
            totalBeratBadan += orang.getBeratBadan();
        }

        double rataRataBeratBadan = totalBeratBadan / daftarOrang.size();
        System.out.println("Rata-rata Berat Badan: " + rataRataBeratBadan);
    }
}
