public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Лада", "Гранта", 2015, "Россия", null,
                0);
        Car car2 = new Car("Audi ", "A8 50 L TDI quattro", 0 , "Германии", "черный ",
                3.0 );
        Car car3 = new Car("BMW ", "Z8", 2021 , "Германии ", "черный ",
                3.0);
        Car car4 = new Car("Kia ", " Sportage 4-го поколения", 2018 , " Южной Корее", "красный",
                2.4 );
        Car car5 = new Car("Hyundai ", "Avante", 2016 , "Южной Корее", "оранжевый",
                1.6 );
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}