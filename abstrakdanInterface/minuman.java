package abstrakdanInterface;

import java.util.Scanner;

public abstract class minuman {

    Scanner scan = new Scanner(System.in);
    public int jenisMinuman(){
        int harga=0;
        System.out.println("Tulis pilihan jenis: (coffe/tea)");
        String pilihan=scan.nextLine();
        switch (pilihan) {
            case "coffe":harga = 15000;
                break;
            case "tea":harga = 7500;
                break;
            default: harga=0;
            break;
            
        }

        return harga;
    }
    public abstract void tampilJenis(String jenis);
}