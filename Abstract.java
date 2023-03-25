public abstract class Abstract {
    public String fname = "John";
    public int age = 24;

    public abstract void study();

}

class Student extends Abstract {
    public int graduationyear = 2025;

    public void study() {
        System.out.println("Studying code all day");
    }
}

class Second {
    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name :" + myObj.fname);
        System.out.println("Age : " + myObj.age);
        System.out.println("Graduation year : " + myObj.graduationyear);
    }
}
