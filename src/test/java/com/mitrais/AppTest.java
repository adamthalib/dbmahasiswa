package com.mitrais;

import com.mitrais.modul.Jurusan;
import com.mitrais.modul.Mahasiswa;
import com.mitrais.modul.MataKuliah;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import repository.JurusanRepository;
import repository.MahasiswaRepository;
import repository.MataKuliahRepository;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class AppTest {

    @Autowired
    JurusanRepository jurusanRepositoryrepository;
    MahasiswaRepository mahasiswaRepositoryrepository;
    MataKuliahRepository mataKuliahRepositoryreRepository;

    @Test
    public void testCreate(){
        Jurusan jurusan = new Jurusan();
        jurusanRepositoryrepository.save(jurusan);
        assertThat(jurusan.getKdjurusan()).isNotNull();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswaRepositoryrepository.save(mahasiswa);
        assertThat(mahasiswa.getNim()).isNotNull();

        MataKuliah mataKuliah = new MataKuliah();
        mataKuliahRepositoryreRepository.save(mataKuliah);
        assertThat(mataKuliah.getKd_matkul()).isNotNull();
    }

}
