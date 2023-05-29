package com.Learning;

class Buku{
    String judul;
    String penulis;
    String rating;

    Buku(String judul, String penulis, String rating){
        this.judul = judul;
        this.penulis = penulis;
        this.rating = rating;
    }

    void display(){
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
        System.out.println("Rating\t" + this.rating);
    }
}

public class referenceObject{
    public static void main(String[] args) {
        Buku buku1 = new Buku("Killing Commandantore", "Haruki Murakami", "7/10");
        buku1.display();

        // Menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);
        
        // assignment object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        // karena buku1 dan buku2 berada pada address atau referensi yang sama 
        buku2.judul = "Membunuh komandantur";
        buku1.display();
        buku2.display();

        // kita akan memasukan object kedalam methods
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi " + addressDataBuku);
        dataBuku.penulis = "Haruki Mahalkami";
    }
}
