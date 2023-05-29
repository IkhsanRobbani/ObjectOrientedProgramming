package com.Learning;

class Mahasiswa{
   String nama;
   String NIM;
   String jurusan;
   double IPK;
   int umur;
}

public class ObjectClass {
   public static void main(String[] args){
    System.out.println(" test 1 2 3 low ");
     // instansiasi / membuat object
     Mahasiswa mahasiswa1 = new Mahasiswa();  // Kita bisa membuat object dari nama class
     mahasiswa1.nama = "Supriman";
     mahasiswa1.NIM = "42069";
     mahasiswa1.jurusan = "PhD in Mathematics";
     mahasiswa1.IPK = 4.0;
     mahasiswa1.umur = 27;

    
     System.out.println(mahasiswa1.nama+ "\n" +
                        mahasiswa1.NIM+ "\n"  +
                        mahasiswa1.jurusan+ "\n" +
                        mahasiswa1.IPK+ "\n"+ 
                        mahasiswa1.umur);
     
     Mahasiswa mahasiswa2 = new Mahasiswa();
     mahasiswa2.nama = "otong";
     mahasiswa2.NIM = "13305042";
     mahasiswa2.jurusan = "teknik perteknikan";
     mahasiswa2.IPK = 3.5;
     mahasiswa2.umur = 32;

     System.out.println(mahasiswa2.nama);
     System.out.println(mahasiswa2.NIM);
     System.out.println(mahasiswa2.jurusan);
     System.out.println(mahasiswa2.IPK);
     System.out.println(mahasiswa2.umur);
   }
   
}


