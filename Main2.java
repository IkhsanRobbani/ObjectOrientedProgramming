package com.Learning;

class Pelajar {
    private  double nilaiUjian1, nilaiUjian2, nilaiTugas;
    private String nama;
    private int nip;
    public double nilaiAkhir; 
    private double nilaiAkhir1;

    public Pelajar(){
        this.nilaiTugas=85;
        this.nilaiUjian1=90;
        this.nilaiUjian2=95;
        this.nama="Supri";
        this.nip=167;

    }
    void display(){
        System.out.println(this.nilaiTugas);
        System.out.println(this.nilaiUjian1);
        System.out.println();
    }
    public double getNilaiUjian1(){
        return this.nilaiUjian1;
    }
    public double getNilaiUjian2(){
        return this.nilaiUjian2;
    }
    public double getNilaiTugas(){
        return this.nilaiTugas;
    }
    public void setNilaiAkhir1(double nilaiAkhir2 ){
          this.nilaiAkhir1=nilaiAkhir2;  
    }
}
public class Main2{
    public static void main(String[] args) {
        Pelajar obj = new Pelajar();
        // read only ( pakai Getter utk akses)
        double Ujian1=obj.getNilaiUjian1();
        double Ujian2=obj.getNilaiUjian2(); 
        double Tugas=obj.getNilaiTugas();
        //System.out.println(Ujian1);
        //Pendefinisian nilaiAkhir
        double NilaiAkhir= 0.35*(Ujian1+Ujian2)+0.3*Tugas;
        // read & write pakai public
        //obj.nilaiAkhir= 90; //write
        
        // write only( setter )
       // obj.setNilaiAkhir1(obj.nilaiAkhir);
        System.out.println(NilaiAkhir);
    }
}