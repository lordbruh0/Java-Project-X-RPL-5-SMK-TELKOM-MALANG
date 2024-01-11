package Enkapsulasi;
public class modifier {
    public static char[] name;
    public String nama= "ryo";
    private int usia = 16;//bisa diakses dengan satu class
    protected String alamat = "malang";//beda folder, gak bisa di akses
    char jk='p';
   

    //mutator meethods set nilai
    public void setUsia(){
        this.usia = 20;
    }


    //mutator meethods get nilai
    public int getUsia(){
        return usia;
    }

}
