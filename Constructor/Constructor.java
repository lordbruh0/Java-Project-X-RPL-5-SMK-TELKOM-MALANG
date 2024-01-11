package Constructor;
//class tanpa constructor / class polos
class polos{
    String dataString;
    int dataInteger;
}


//class dengan constructor
class Mahasiswa{
    String nama;
    String Nim;
    String jurusan;

    //constructor dipanggil saat objek pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("ini adalah constructor");
    //}

        //constructor dengan parameter
Mahasiswa(String inputNama, String inputNIM, String inputjurusan){
        nama = inputNama;
        Nim = inputNIM;
        jurusan = inputjurusan;

        System.out.println(nama);
        System.out.println(Nim);
        System.out.println(jurusan);
    }
}

public class Constructor {
    public static void main(String[] args) {

        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "13305041", "teknik pertenikan");
        Mahasiswa mahasiswa2 = new Mahasiswa("otong", "13305041", "teknik pertambangan");
       
        // polos objectPolos = new polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 0;

        // System.out.println( objectPolos.dataString);
        // System.out.println( objectPolos.dataInteger);

    }

}
