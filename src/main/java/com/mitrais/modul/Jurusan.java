package com.mitrais.modul;


import javax.persistence.*;

@Entity
@Table(name = "Jurusan")
    public class Jurusan {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long kdjurusan;
        private String Nama;
        private String NamaJurusan;
        @OneToMany(cascade = CascadeType.ALL, mappedBy = "kdjurusan")
        private Mahasiswa Mahasiswa;

        public Jurusan() {

        }

        public Jurusan(String Nama, String NamaJurusan) {
            this.Nama = Nama;
            this.NamaJurusan = NamaJurusan;
        }

        public Long getKdjurusan() {
            return kdjurusan;
        }

        public void setKdjurusan(Long kdjurusan) {
            this.kdjurusan = kdjurusan;
        }

        public String getNama() {
            return getNama();
        }

        public void setNama(String nama) {
            this.Nama = nama;
        }

        public String getNamaJurusan() {
            return NamaJurusan;
        }

        public void setNamaJurusan(String namaJurusan) {
            this.NamaJurusan = namaJurusan;
        }

        public Mahasiswa getMahasiswa() {
            return Mahasiswa;
        }

        public void setMahasiswa(Mahasiswa mahasiswa) {
            this.Mahasiswa = mahasiswa;
        }
    }

