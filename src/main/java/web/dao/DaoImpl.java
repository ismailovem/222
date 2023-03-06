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
    public List<Car> getCars(Integer num) {
        if (num == null) {
            return this.list;
        } else {
            return this.list.stream().limit(num).toList();
        }
    }
}
