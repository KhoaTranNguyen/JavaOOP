package Chapter4.Colleagues;

class Person {
    String name;
    String hairColor;
    String eyeColor;
    String skinColor;
    double height;
    double weight;

    Person() {
        System.out.println("Creating default colleagues profile");
        name = "";
        hairColor = "";
        eyeColor = "";
        skinColor = "";
        height = 0;
        weight = 0;
    }

    Person(String name, String hairColor, String eyeColor, String skinColor, double height, double weight) {
        System.out.println("Creating " + name + "\'s profile");
        this.name = name;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.skinColor = skinColor;
        this.height = height;
        this.weight = weight;
    }

    void info() {
        System.out.println("\nName: " + name);
        System.out.println("Hair Color: " + hairColor);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Skin Color: " + skinColor);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }

    void eat() {
        System.out.print("\n>> " + name + ": ");
        System.out.println("Nom..nom..");
    }

    void sleep() {
        System.out.print("\n>> " + name + ": ");
        System.out.println("Zz..zz..");
    }

    void walk() {
        System.out.print("\n>> " + name + ": ");
        System.out.println("I like walking!");
    }

    void play() {
        System.out.print("\n>> " + name + ": ");
        System.out.println("Wow! The toys!");
    }

    void study() {
        System.out.print("\n>> " + name + ": ");
        System.out.println("Wow! Knowledges!");
    }
}

public class Colleagues {
    public static void main(String[] args) {
        Person colleague1 = new Person(
            "Colleague1",
            "black",
            "black",
            "black",
            2.0,
            60);

        Person colleague2 = new Person(
            "Colleague2",
            "yellow",
            "yellow",
            "yellow",
            1.5, 
            50);

        Person colleague3 = new Person(
            "Colleague3",
            "white",
            "white",
            "white",
            1.9, 70);

        Person colleague4 = new Person(
            "Colleague4",
            "red",
            "red",
            "red",
            1.7, 65);


        colleague1.info();
        colleague1.eat();

        colleague2.info();
        colleague2.sleep();

        colleague3.info();
        colleague3.walk();

        colleague4.info();
        colleague4.play();
    }
}

