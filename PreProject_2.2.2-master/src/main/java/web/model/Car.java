package web.model;

public class Car {
    public String model;
    public String series;
    public int year;

    @Override
    public String toString() {
        return model + " " + series + " " + year;
    }

    public Car(String model, String series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }
}
