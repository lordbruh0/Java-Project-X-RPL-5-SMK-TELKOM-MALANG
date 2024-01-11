public class Bus {
    private int penumpang, maxpenumpang;
    private double beratTotal;

    // konstruktor
    public Bus(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
        beratTotal = 0;
    }

    // method mutator
    public void pluspenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxpenumpang) {
            System.out.println("Overload penumpang");
        } else {
            this.penumpang = temp;
        }
    }

    public double getPenumpang(){   //Tambahan
        return penumpang;
    }


    public void plusBerat(double berat) {  //Tambahan
        beratTotal += berat;
    }

    public double getAverage() {
       
            return beratTotal / getPenumpang();  //Tambahan
        }


    public void cetak() {
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("penumpang seharusnya adalah =" + maxpenumpang);
        System.out.println("Berat sekarang = " + beratTotal);
        System.out.println("Berat rata rata = " + getAverage());
    }
}
