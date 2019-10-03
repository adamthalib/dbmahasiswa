package com.mitrais.modul;

import javax.persistence.*;

@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nim;
    private String Nama;
    private String Alamat;
    private String Email;
    @OneToOne (cascade = CascadeType.ALL)
    private Jurusan jurusan;

    public Mahasiswa(){

    }

    public Mahasiswa(String nama, String alamat, String email ){
        this.Nama = nama;
        this.Alamat = alamat;
        this.Email = email;
    }

    public Long getNim() {
        return nim;
    }

    public void setNim(Long nim) {
        this.nim = nim;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }
}

