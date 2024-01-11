import java.util.Scanner;
public class Data {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=1;
        System.out.print("Masukkan jumlah data = ");
        int jumlahData = in.nextInt();
        String[] nama = new String[jumlahData];
        in.nextLine();
        for(int i = 0; i<jumlahData; i++){
            System.out.print("Masukkan nama ke "+count+" = "); 
            nama[i] = in.nextLine();
            count++;
        }
        for(int a = 0; a<jumlahData; a++){
            System.out.print(nama[a]+", ");

        }
    }
    
}
