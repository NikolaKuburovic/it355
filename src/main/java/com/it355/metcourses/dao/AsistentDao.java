package com.it355.metcourses.dao;

import com.it355.model.Asistent;
import java.util.List;

/**
 *
 * @author Nikola Kuburovic 1095
 */
public interface AsistentDao {

    public int getCount();

    public List<Asistent> getAllAsistent();

    public boolean addAsistent(Asistent asistent);

    public void deleteAsistent(int id);

    public boolean updateAsistent(Asistent asistent);

    public Asistent getAsistentById(int id);

}
