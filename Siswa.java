public class Siswa { 
public static void main(String[] args) {
       Siswa s =new Siswa();
       s.tampilnama();
       s.tampilkelas(5);
}

public void tampilnama(){

     String nama= "Ryo";
        char jeniskelamin= 'p';
        int usia=16;
        String alamat="Malang";
        System.out.println("nama: "+nama);
}
    public void tampilkelas(int kelas){
       System.out.println("kelas: "+kelas);
    }
}
    
