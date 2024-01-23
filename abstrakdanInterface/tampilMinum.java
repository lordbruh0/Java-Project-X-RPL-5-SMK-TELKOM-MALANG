package abstrakdanInterface;

public class tampilMinum {
    public static void main(String[] args) {
        LycheeTea lt = new LycheeTea();
        lt.tampilJenis("tea");
        System.out.println("Harga: "+lt.jenisMinuman());
    }
}
