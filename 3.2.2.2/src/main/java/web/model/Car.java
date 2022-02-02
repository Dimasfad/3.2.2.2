package web.model;

public class Car {
    private String model;
    private String color;
    private int licensePlate;

    public Car(String model,String color,int licencePlate){
        this.model=model;
        this.color=color;
        this.licensePlate=licencePlate;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getLicencePlate(){
        return licensePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "web.model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", licensePlate=" + licensePlate +
                '}';
    }
}
