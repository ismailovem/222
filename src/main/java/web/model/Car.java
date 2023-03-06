package web.model;

public class Car {
    private String brand;
    private String model;
    private int series;
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
