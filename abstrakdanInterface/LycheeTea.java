package abstrakdanInterface;

public class LycheeTea extends minuman {

    @Override
    public void tampilJenis(String jenis) {
        System.out.println("Jenis Minuman: " + jenis);
    }

    @Override
    public int jenisMinuman() {
        return super.jenisMinuman();
    }
}
