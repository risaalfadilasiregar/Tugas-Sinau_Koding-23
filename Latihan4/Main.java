package Latihan4;

import Latihan4.DataBuku.DataBuku;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Latihan4.Helper.Parse;
import Latihan4.StatusBuku.StatusBuku;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<DataBuku> listBook = new ArrayList<DataBuku>();

        System.out.println("======== Masukan Daftar Buku ========");
        Boolean star = true;

        while (star != false){
            DataBuku book = new DataBuku();

            System.out.print("\nMasukkan judul\t: ");
            book.setJudul(scan.nextLine());

            System.out.print("Masukkan penerbit\t: ");
            book.setPenerbit(scan.nextLine());

            System.out.print("Masukkan tahunTerbit\t: ");
            book.setTahunTerbit(scan.nextLine());

            System.out.print("Masukkan pengarang\t: ");
            book.setPengarang(scan.nextLine());

            System.out.print("Masukkan isbn\t: ");
            book.setIsbn(scan.nextLine());

            System.out.print("Masukkan tanggal Kembali\t: ");
            Date parsed = Parse.stringToDate(scan.nextLine());
            book.setTanggalKembali(parsed);

            if(parsed == null){
                book.setStatus(StatusBuku.Status.BELUM_DIKEMBALIKAN);
            } else {
                book.setStatus(StatusBuku.Status.SUDAH_DIKEMBALIKAN);
            }

            listBook.add(book);

            System.out.print("\nTambah lagi (y/n) ? ");
            String input = scan.nextLine();

            if (input.equals("n")){
                star = false;
            }
        }

        System.out.println("\n======== Daftar Buku ========");
        for(DataBuku book : listBook){
            System.out.println("Judul : " + book.getJudul()+"\n"+" Penerbit: " + book.getPenerbit()+"\n"+" Tahun Terbit: "+book.getTahunTerbit()+"\n" + " Pengarang: "+book.getPengarang()+"\n"+ " ISBN: "+book.getIsbn()+"\n"+ " Status: "+book.getStatus()+"\n"+ "Tanggal Kembali: " + book.getTanggalKembali() + "\n\n");

        }
    }
}
