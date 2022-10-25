package Latihan3;

public class Lingkaran implements PenghitungLuasKeliling{
    private float a;

    public Lingkaran(float a){
        this.a = a;
    }

    @Override
    public float keliling() {
        return (float) (2*3.14*a);
    }

    @Override
    public float luas() {
        return (float) (3.14 * a * a);
    }
}
