package web.model;


public class Car {
    public String model;

    public String mark;

    public String number;

    public Car(String model, String mark, String number) {
        this.model = model;
        this.mark = mark;
        this.number = number;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
