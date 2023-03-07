package web.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String brand;
    private String model;
    private int series;
    @Autowired
    public Car() {
    }
    public Car (String brand, String model, int series) {
        this.brand = brand;
        this.model = model;
        this.series = series;
    }
    @Override
    public String toString() {
        return  "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series;
    }
}
