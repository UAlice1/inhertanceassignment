public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.makeSound();  // Output: Bird says: Chirp!
        bird.fly();        // Output: Bird does: Flying!

        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Output: Dog says: Woof!
        myCat.makeSound(); // Output: Cat says: Meow!
    }
}

// Superclass
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass: Bird
class Bird extends Animal {
    public void fly() {
        System.out.println("Bird does: Flying!");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Chirp!");
    }
}

// Subclass: Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

// Subclass: Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}
