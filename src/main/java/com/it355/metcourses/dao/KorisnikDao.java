package com.it355.metcourses.dao;

import com.it355.model.Korisnik;
import java.util.List;

/**
 *
 * @author Nikola Kuburovic 1095
 */
public interface KorisnikDao {

    public List<Korisnik> getAllKorisnik();

    public boolean addKorisnik(Korisnik korisnik);

    public void deleteKorisnik(Korisnik korisnik);

    public boolean updateKorisnik(Korisnik korisnik);

    public Korisnik getKorisnikById(int id);

}
