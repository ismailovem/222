package web.service;

import web.dao.Dao;
import web.dao.DaoImpl;
import web.model.Car;

import java.util.List;

public class ServiceImpl implements Service {
    private Dao dao = new DaoImpl();
    @Override
    public List<Car> getCars(Integer num) {
        return dao.getCars(num);
    }
}
