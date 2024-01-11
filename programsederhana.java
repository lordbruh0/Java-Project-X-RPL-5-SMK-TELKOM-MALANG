import java.util.Scanner;
public class programsederhana {
    public static void main(String[] args) {

 Scanner scan = new Scanner(System.in);
        System.out.println("Selamat datang di game matematika");

        String nama, level;
        int score = 0, jawaban, jawaban1, jawaban2;
        System.out.print("Masukan nickname anda: ");
        nama = scan.nextLine();

        System.out.print(" 1. easy \n 2. medium \n 3. hard \n Pilih level anda: ");
        level = scan.nextLine();

       switch (level) {
        case "easy":
            System.out.println("Baiklah, kamu memilih level easy\n Mari kita mulai!!");
            System.out.println("score: 0");
            System.out.print("soal 1: 1+2 = ");
            jawaban=scan.nextInt();

            if (jawaban==3) {
                System.out.println("Selamat jawaban anda benar");
                score= score+ 1;
                System.out.println("score: "+score);
            }
            else if (jawaban!=3) {
                System.out.println("yah, jawaban anda salah");
                score= score - 1;
                System.out.println("score: "+score);

            }






            System.out.print("soal 2: 6 x 6 = ");
            jawaban1=scan.nextInt();

            if (jawaban1==36) {
                System.out.println("Selamat jawaban anda benar");
                score= score + 1;
                System.out.println("score: "+score);
            }
            else if (jawaban1!=36) {
                System.out.println("yah, jawaban anda salah");
                score= score - 1;
                System.out.println("score: "+score);
                
            }





            System.out.print("soal 3: 6 / 2 = ");
            jawaban2=scan.nextInt();

            if (jawaban2==3) {
                System.out.println("Selamat jawaban anda benar");
                score= score + 1;
                System.out.println("score: "+score);
            }
            else if (jawaban2!=36) {
                System.out.println("yah, jawaban anda salah");
                score= score - 1;
                System.out.println("score: "+score);
                
            }
            
            break;
       
        case "medium":
            System.out.println("Baiklah, kamu memilih level medium\n Mari kita mulai!!");
            System.out.println("score: 0");
            System.out.print("soal 1: 5 x 3 = ");
            jawaban=scan.nextInt();

            if (jawaban==15) {
                System.out.println("Selamat jawaban anda benar");
                score= score+ 1;
                System.out.println("score: "+score);
            }
            else if (jawaban!=15) {
                System.out.println("yah, jawaban anda salah");
                score= score - 1;
                System.out.println("score: "+score);

            }






            System.out.print("soal 2: 9 x 6 = ");
            jawaban1=scan.nextInt();

            if (jawaban1==54) {
                System.out.println("Selamat jawaban anda benar");
                score= score + 1;
                System.out.println("score: "+score);
            }
            else if (jawaban1!=54) {
                System.out.println("yah, jawaban anda salah");
                score= score - 1;
                System.out.println("score: "+score);
                
            }





            System.out.print("soal 3: 60 / 2 = ");
            jawaban2=scan.nextInt();

            if (jawaban2==30) {
                System.out.println("Selamat jawaban anda benar");
                score= score + 1;
                System.out.println("score: "+score);
            }
            else if (jawaban2!=30) {
                System.out.println("yah, jawaban anda salah");
                score= score - 1;
                System.out.println("score: "+score);
                
            }
            

            break;
       
        case "hard":    
            System.out.println("Baiklah, kamu memilih level hard\n Mari kita mulai!!");
            System.out.println("score: 0");
            System.out.print("soal 1: 16 x 2 = ");
            jawaban=scan.nextInt();

            if (jawaban==32) {
                System.out.println("Selamat jawaban anda benar");
                score= score+ 1;
                System.out.println("score: "+score);
            }
            else if (jawaban!=32) {
                System.out.println("yah, jawaban anda salah");
                score= score - 1;
                System.out.println("score: "+score);

            }






            System.out.print("soal 2: 66 x 66 = ");
            jawaban1=scan.nextInt();

            if (jawaban1==4356) {
                System.out.println("Selamat jawaban anda benar");
                score= score + 1;
                System.out.println("score: "+score);
            }
            else if (jawaban1!=4356) {
                System.out.println("yah, jawaban anda salah");
                score= score - 1;
                System.out.println("score: "+score);
                
            }





            System.out.print("soal 3: 600 / 5 = ");
            jawaban2=scan.nextInt();

            if (jawaban2==120) {
                System.out.println("Selamat jawaban anda benar");
                score= score + 1;
                System.out.println("score: "+score);
            }
            else if (jawaban2!=120) {
                System.out.println("yah, jawaban anda salah");
                score= score - 1;
                System.out.println("score: "+score);
                
            }
            
        break;
        }
    System.out.println("score anda adalah "+score);
    System.out.println("selamat "+nama);
    }


}
