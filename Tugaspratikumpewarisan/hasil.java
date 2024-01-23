package Tugaspratikumpewarisan;

public class hasil {
    public static void main(String[] args) {
        Admin a = new Admin();
        a.tampilIdentitas("bos");
        a.tampilnama();
        System.out.println("Gaji pokok yang diterima " + a.gaji(240000));
        System.out.println("Gaji tunjangan yang diterima: "+a.gaji(50000000));
    }
}
