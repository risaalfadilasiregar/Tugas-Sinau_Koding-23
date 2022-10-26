package Latihan4.DataBuku;

import Latihan4.StatusBuku.StatusBuku;

import java.util.Date;

public class DataBuku {

    String judul;
    String penerbit;
    String tahunTerbit;
    String pengarang;
    String isbn;
    Date tanggalKembali;
    StatusBuku.Status status;

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPenerbit() {
        return penerbit;
    }
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    public String getTahunTerbit() {
        return tahunTerbit;
    }
    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public String getPengarang() {
        return pengarang;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Date getTanggalKembali() {
        return tanggalKembali;
    }
    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
    public StatusBuku.Status getStatus() {
        return status;
    }
    public void setStatus(StatusBuku.Status status) {
        this.status = status;
    }
}
