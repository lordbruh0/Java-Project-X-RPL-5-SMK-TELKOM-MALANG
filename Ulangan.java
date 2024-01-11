import java.util.Scanner;
public class Ulangan {
public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in);

    System.out.println("Selamat Dayang di Toko Kecantikan Fahrell");
    System.out.println("Kami menyediahkan:\n Perawatan:                       Produk:\n 1) Perawatan Wajah Rp 200.000               1)Krim Wajah Rp 50.000 \n 2) Perawatan Rambut Rp 75.000              2)Bedak Rp 25.000\n                                  3) Sampo Rp 35.000");

    int noMember, berapakaliperawatan, totalharga;
    String namaPembeli, Beliapa, beliproduk, perawatan, perawatan2;

    System.out.print("Masukan no member:");
    noMember = scan.nextInt();
 scan.nextLine();
    System.out.print("Masukan nama mu:");
    namaPembeli = scan.nextLine();


    scan.nextLine();
    System.out.print("Mau beli apa?");
    Beliapa = scan.nextLine();

    

    switch(Beliapa){
        case "Perawatan" -> {

                scan.nextLine();

            System.out.print("Mau perawatan apa?");
            perawatan2 = scan.nextLine();

            if( perawatan2.equalsIgnoreCase("Wajah") ){
                    
                System.out.println("Baiklah kamu memilih perawatan wajah");
                System.out.print("Berapa orang yang melakukan perawatan?");
                berapakaliperawatan=scan.nextInt();
                totalharga = ((berapakaliperawatan*200000)*2)/100;
                System.out.println("Total harga "+ namaPembeli + " adalah Rp "+totalharga+ " Harga sudah dikali dengan diskon karena hari ini klinik sedang ulang tahun" );
           
            }if( perawatan2.equalsIgnoreCase("Rambut") ){
                    
                System.out.println("Baiklah kamu memilih perawatan Rambut");
                System.out.print("Berapa orang yang melakukan perawatan?");
                berapakaliperawatan=scan.nextInt();
                totalharga = ((berapakaliperawatan*75000)*2)/100;
                System.out.println("Total harga "+ namaPembeli + " adalah Rp "+totalharga+ " Harga sudah dikali dengan diskon karena hari ini klinik sedang ulang tahun" );
           
            }
        }
        case "Produk" -> {

                scan.nextLine();

            System.out.print("Mau beli produk apa?");
            perawatan2 = scan.nextLine();

            if( perawatan2.equalsIgnoreCase("Krim Wajah") ){
                    
                System.out.println("Baiklah kamu membeli krim wajah");
                System.out.print("Berapa banyak yang ingin kamu beli?");
                berapakaliperawatan=scan.nextInt();
                totalharga = ((berapakaliperawatan*50000)*5)/100;
                System.out.println("Total harga "+ namaPembeli + " adalah Rp "+totalharga+ " Harga sudah dikali dengan diskon karena hari ini klinik sedang ulang tahun" );
           
            }if( perawatan2.equalsIgnoreCase("Bedak") ){
                    
                System.out.println("Baiklah kamu memilih bedak");
                System.out.print("Berapa banyak yang ingin kamu beli?");
                berapakaliperawatan=scan.nextInt();
                totalharga = ((berapakaliperawatan*25000)*5)/100;
                System.out.println("Total harga "+ namaPembeli + " adalah Rp "+totalharga+ " Harga sudah dikali dengan diskon karena hari ini klinik sedang ulang tahun" );
           
            }if( perawatan2.equalsIgnoreCase("Sampo") ){
                    
                System.out.println("Baiklah kamu memilih sampo");
                System.out.print("Berapa banyak yang ingin kamu beli?");
                berapakaliperawatan=scan.nextInt();
                totalharga = ((berapakaliperawatan*35000)*5)/100;
                System.out.println("Total harga "+ namaPembeli + " adalah Rp "+totalharga+ " Harga sudah dikali dengan diskon karena hari ini klinik sedang ulang tahun" );
           
            }
        }
    }
}
}


            
    

    


