package com.Learning;

public class dosen {
    protected String nama,nik,jurusan;
    //constructor
    dosen (String namax, String nikx,String jur){
        nama=namax;
        nik=nikx;
        jurusan=jur;
    }
    public void view(){
        System.out.println("Nama    :"+nama);
        System.out.println("NIK     :"+nik);
        System.out.println("Jurusan :"+jurusan);
    }
}

