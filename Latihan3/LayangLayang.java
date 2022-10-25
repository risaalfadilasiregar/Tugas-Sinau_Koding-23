package Latihan3;

public class LayangLayang implements PenghitungLuasKeliling{
    private float sisi1, sisi2, diagonal1, diagonal2;

    public void keliling(float sisi1, float sisi2){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }
    public void luas(float diagonal1, float diagonal2){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public float keliling() {
        return 2 * (sisi1 + sisi2);
    }

    @Override
    public float luas() {
        return (diagonal1 * diagonal2)/2;
    }
}
