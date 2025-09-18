package Dogs;
class Dog {
    String breed;
    String size;
    int age;
    String color;

    public String getInfo() {
        return ("Breed is: "+breed+", Size is: "+size+", Age is: "+age+", Color is: "+color);
    }
}

public class Execute{
    public static void main(String[] args) {
        Dog NeapolitanMastiff = new Dog();
        NeapolitanMastiff.breed = "Neapolitan Mastiff";
        NeapolitanMastiff.size = "Large";
        NeapolitanMastiff.age = 5;
        NeapolitanMastiff.color = "Black";
        System.out.println(NeapolitanMastiff.getInfo());

        Dog ChowChow = new Dog();
        ChowChow.breed = "Chow Chow";
        ChowChow.size = "Midium";
        ChowChow.age = 3;
        ChowChow.color = "Brown";
        System.out.println(ChowChow.getInfo());

        Dog Corgi = new Dog();
        Corgi.breed = "Corgi";
        Corgi.size = "Small";
        Corgi.age = 1;
        Corgi.color = "Red and White";
        System.out.println(Corgi.getInfo());
    }
}