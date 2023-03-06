package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoImpl implements Dao {
    private List<Car> list;
    {
        list = new ArrayList<>();
        list.add(new Car("volvo","x90",111));
        list.add(new Car("volvo","x80",111));
        list.add(new Car("bmv","x5",222));
        list.add(new Car("bmv","x6",222));
        list.add(new Car("bmv","x7",333));
    }

    public List<Car> getAllCars() {
        return this.list;
    }
    public List<Car> getCars(int num) {
        List<Car> cars = this.list;
        while (num < cars.size()) {
            cars.remove(--num);
            num++;
        }
        return cars;
    }
}
