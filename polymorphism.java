public class polymorphism {
    class Animal {
        public void Animalsound() {
            System.out.println("the animal makes this sound");
        }
    }

    class Pig extends Animal {
        public void Animalsound() {
            System.out.println("the pig makes this sound");
        }
    }

    class Dog extends Animal {
        public void Animalsound() {
            System.out.println("the dog makes this sound");
        }
    }

    class Main {
        public void main(String[] args) {
            Animal myAnimal = new Animal();
            Pig myPig = new Pig();
            Dog myDog = new Dog();

            System.out.println(myAnimal);
        }
    }

}
