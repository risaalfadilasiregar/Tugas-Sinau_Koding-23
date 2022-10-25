package Latihan3;

public class Trapesium implements PenghitungLuasKeliling{
    private float sisiAtas, sisiBawah, sisiMiring, tinggi;

    public void keliling(float sisiAtas, float sisiBawah, float sisiMiring, float tinggi){
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
    }
    public void luas(float sisiAtas, float sisiBawah, float tinggi){
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
    }
    @Override
    public float keliling() {
        return sisiAtas + sisiBawah + sisiMiring + tinggi;
    }

    @Override
    public float luas() {
        return ((sisiAtas+sisiBawah)*tinggi)/2;
    }
}
