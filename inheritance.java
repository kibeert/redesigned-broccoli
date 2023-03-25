class Inheritance {
    public static class Vehicle {
        public String Brand = "Ford";

        public void honk() {
            System.out.println("Tuuut! tuut!");
        }
    }

    public class Car extends Vehicle {
        protected String modelname = "Ranger";

        public static void main(String[] args) {
            Car myCar = new Car();

            myCar.honk();

            System.out.println(myCar.Brand + " " + myCar.modelname);
        }

    }
}