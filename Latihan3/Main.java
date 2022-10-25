package Latihan3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("<=============================================>");
            System.out.println("<===========Tugas 3 Sinau Koding 23===========>");
            System.out.println("|===Menghitung Luas & Keliling Bangun Datar===|");
            System.out.println("|=============================================|");
            System.out.println("1. Segitiga");
            System.out.println("2. Layang-Layang");
            System.out.println("3. Trapesium");
            System.out.println("4. Lingkaran");
            System.out.println("5. Exit");
            System.out.println("|=============================================|");
            System.out.println("| Masukkan Pilihan : ");
            int obj = scan.nextInt();
            addObj bangunan = new addObj();
            bangunan.select(obj);
        }
    }
}

class addObj{

    public void select(int bangun) {
        if (bangun == 5){
            System.exit(0);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("|---------------------------------------------|");
        System.out.println("|Pilih perhitungan Object : ");
        System.out.println("|   1. Keliling");
        System.out.println("|   2. Luas");
        System.out.println("|---------------------------------------------|");
        System.out.print("| Masukkan  pilihan : ");
        int Penghitungan = scan.nextInt();


        switch (bangun){
            case 1:
                Segitiga segitiga = new Segitiga();
                switch (Penghitungan) {
                    case 1:
                        System.out.print("| Masukkan  sisi bawah Segitiga(cm) : ");
                        float sisi1 = scan.nextFloat();
                        System.out.print("| Masukkan sisi miring Segitiga (cm) : ");
                        float sisi2 = scan.nextFloat();
                        System.out.print("| Masukkan tinggi Segitiga (cm) : ");
                        float tinggi = scan.nextFloat();
                        segitiga.keliling(sisi1, sisi2, tinggi);
                        System.out.println(segitiga.keliling() + "| Keliling Segitiga");
                        System.out.println("|---------------------------------------------|");
                        break;
                    case 2:
                        System.out.print("| Masukkan sisi alas Segitiga(cm) : ");
                        float sisi3 = scan.nextFloat();
                        System.out.print("| Masukkan tinggi Segitiga (cm) : ");
                        float tinggi1 = scan.nextFloat();
                        segitiga.luas(tinggi1, sisi3);
                        System.out.println(segitiga.luas() + "| Luas Jajar Genjang");
                        System.out.println("|---------------------------------------------|");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case 2:
                LayangLayang layangLayang = new LayangLayang();
                switch (Penghitungan) {
                    case 1:
                        System.out.print("| Masukkan sisi ke-1 Layang-Layang (cm) : ");
                        float sisi1 = scan.nextFloat();
                        System.out.print("| Masukkan sisi ke-2 Layang-Layang (cm) : ");
                        float sisi2 = scan.nextFloat();
                        layangLayang.keliling(sisi1,sisi2);
                        System.out.println(layangLayang.keliling() + "| Keliling Layang-Layang ");
                        System.out.println("|---------------------------------------------|");
                        break;
                    case 2:
                        System.out.print("| Masukkan diagonal1 ke-1 Layang-Layang (cm) : ");
                        float diagonal1 = scan.nextFloat();
                        System.out.print("| Masukkan diagonal ke-2 Layang-Layang (cm) : ");
                        float diagonal2 = scan.nextFloat();
                        layangLayang.luas(diagonal1, diagonal2);
                        System.out.println(layangLayang.luas() + "| Luas Layang-Layang ");
                        System.out.println("|---------------------------------------------|");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;

            case 3:
                Trapesium trapesium = new Trapesium();
                switch (Penghitungan) {
                    case 1:
                        System.out.print("| Masukkan sisi Atas LTrapesium (cm) : ");
                        float sisiAtas = scan.nextFloat();
                        System.out.print("| Masukkan sisi Bawah Trapesium (cm) : ");
                        float sisiBawah = scan.nextFloat();
                        System.out.print("| Masukkan sisi Miring Trapesium (cm) : ");
                        float sisiMiring = scan.nextFloat();
                        System.out.print("| Masukkan sisi Tinggi Trapesium (cm) : ");
                        float tinggi = scan.nextFloat();
                        trapesium.keliling(sisiAtas,sisiBawah,sisiMiring,tinggi);
                        System.out.println(trapesium.keliling() + "| Keliling Trapesium ");
                        System.out.println("|---------------------------------------------|");
                        break;
                    case 2:
                        System.out.print("| Masukkan Sisi Atas Trapesium (cm) : ");
                        float sisiAtas1 = scan.nextFloat();
                        System.out.print("| Masukkan Sisi Bawah Trapesium (cm) : ");
                        float sisiBawah1 = scan.nextFloat();
                        System.out.print("| Masukkan Tinggi Trapesium (cm) : ");
                        float tinggi1 = scan.nextFloat();
                        trapesium.luas(sisiAtas1, sisiBawah1, tinggi1);
                        System.out.println(trapesium.luas() + "| Luas Trapesium ");
                        System.out.println("|---------------------------------------------|");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case 4:
                System.out.print("| Masukkan jari-jari Lingkaran (cm) : ");
                float jari = scan.nextFloat();
                Lingkaran lingkaran = new Lingkaran(jari);
                switch (Penghitungan) {
                    case 1:
                        System.out.println( lingkaran.keliling() + "|Keliling Lingkaran  ");
                        System.out.println("|---------------------------------------------|");
                        break;
                    case 2:
                        System.out.println( lingkaran.luas() + "| Luas Lingkaran  ");
                        System.out.println("|---------------------------------------------|");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }
    }
}
