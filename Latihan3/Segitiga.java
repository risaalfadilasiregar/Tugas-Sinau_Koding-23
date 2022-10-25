package Latihan3;

public class Segitiga  implements PenghitungLuasKeliling{
    private float sisi1, sisi2, tinggi;

    public void keliling(float sisi1, float sisi2, float tinggi){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.tinggi = tinggi;
    }
    public void luas(float tinggi1, float sisi3){
        this.tinggi= tinggi1;
        this.sisi1 = sisi3;
    }
    @Override
    public float keliling() {
        return sisi2 + sisi1 + tinggi;
    }

    @Override
    public float luas() {
        return ((tinggi*sisi1)/2) ;
    }
}
