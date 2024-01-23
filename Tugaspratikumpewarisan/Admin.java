package Tugaspratikumpewarisan;
public class Admin extends Karyawan {

   @Override
   public void tampilIdentitas(String profesi){
    super.tampilIdentitas(profesi);
   }
  public void tampilnama(){
    super.nama="Ryo";
    super.jk= 'L';
    super.nopeg=333333;
    System.out.println(super.nama);
    System.out.println(super.jk);
    System.out.println(super.nopeg);
  }
  public double gaji(double pokok){
    return pokok;
  }
  public int gaji(int tunjangan){
    return tunjangan;
  }
    
  }

