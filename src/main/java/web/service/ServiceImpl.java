package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.Dao;
import web.model.Car;

import java.util.List;
@Component
public class ServiceImpl implements Service {
    private Dao dao;
    @Autowired
    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }
    @Override
    public List<Car> getCars(Integer num) {
        return dao.getCars(num);
    }
}
