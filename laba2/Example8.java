package laba2;

// Animal.java
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Dog.java
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    public String getBreed() {
        return breed;
    }
}

// Cat.java
class Cat extends Animal {
    private String favoriteFood;

    public Cat(String name, int age, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }
}

// Bird.java
class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp!");
    }

    public boolean isCanFly() {
        return canFly;
    }
}


// Shape.java
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Circle.java
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Square.java
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

// Triangle.java
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Main.java
public class Example8 {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy", 3, "Golden Retriever");
        Animal myCat = new Cat("Whiskers", 2, "Tuna");
        Animal myBird = new Bird("Charlie", 1, true);

        myDog.makeSound();
        myCat.makeSound();
        myBird.makeSound();

        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}

