public class Car {

    public  String brand;
    public String model;
    public int year;
    public String country;
    public String color;
    public double engineVolume;

    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка в " + country + ", " + color + "  цвет, обьем двигателя "
                + engineVolume + " литра.";

    }

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;}


        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;}
    }




}


