package com.mitrais.modul;

import javax.persistence.*;

@Entity
@Table(name = "mata_kuliah")
public class MataKuliah {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kd_matkul;
    private String Nama;
    @ManyToMany (cascade = CascadeType.ALL)
    private Mahasiswa Mahasiswa;
    public MataKuliah(){

    }

    public MataKuliah(String nama){
        this.Nama = nama;
    }

    public Long getKd_matkul() {
        return kd_matkul;
    }

    public void setKd_matkul(Long kd_matkul) {
        this.kd_matkul = kd_matkul;
    }

    public String getNama() {
        return Nama;
    }

    public void setName(String nama) {
        this.Nama = nama;
    }
    public Mahasiswa getMahasiswa() {
        return Mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.Mahasiswa = mahasiswa;
    }


}

