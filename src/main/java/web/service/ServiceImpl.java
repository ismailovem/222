package web.service;

import web.dao.Dao;
import web.dao.DaoImpl;

import java.util.List;

public class ServiceImpl implements Service {
    private Dao dao = new DaoImpl();
    @Override
    public List getCars(int num) {
        return dao.getCars(num);
    }
    @Override
    public List getAllCars() {
        return dao.getAllCars();
    }
}
