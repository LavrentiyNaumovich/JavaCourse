public enum Task12 {
    CAR("Auto", 150), 
    BUS("Bus", 80), 
    AIRPLANE("Plane", 900), 
    BICYCLE("Bycycle", 25);

     String name;
     int speed; 

    // Конструктор для инициализации имени и скорости
    Task12(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // Метод для получения информации о скорости
    public String getSpeedInfo() {
        return "Type: " + name + ", Max speed: " + speed + " km/h";
    }

    // Метод для вычисления времени на преодоление расстояния
    public double calculateTime(double distance) {
        return distance / speed; 
    }



    public static void main(String[] args) {
        Task12 car = Task12.CAR;
        System.out.println(car.getSpeedInfo());
        System.out.println("Time to reach 1000 km: " + car.calculateTime(1000) + " h");

        Task12 airplane = Task12.AIRPLANE;
        System.out.println(airplane.getSpeedInfo());
        System.out.println("Time to reach 1000 km: " + airplane.calculateTime(1000) + " h");
    }
}
