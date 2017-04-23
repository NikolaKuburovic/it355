package com.it355.metcourses.service.impl;

import com.it355.metcourses.dao.AsistentDao;
import com.it355.metcourses.service.AsistentService;
import com.it355.model.Asistent;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Nikola Kuburovic 1095
 */
public class AsistentServiceImpl implements AsistentService {

    @Autowired
    AsistentDao asistentDao;

    @Override
    public int getCount() {
        return asistentDao.getCount();
    }

    @Override
    public List<Asistent> getAllAsistent() {
        return asistentDao.getAllAsistent();
    }

    @Override
    public Asistent addAsistent(Asistent asistent) {
        return asistentDao.addAsistent(asistent);
    }

    @Override
    public void deleteAsistent(int id) {
        asistentDao.deleteAsistent(id);
    }

    @Override
    public Asistent updateAsistent(Asistent asistent) {
        return asistentDao.updateAsistent(asistent);
    }

    @Override
    public Asistent getAsistentById(int id) {
        return asistentDao.getAsistentById(id);
    }

}
