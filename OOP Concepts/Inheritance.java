public class Inheritance {
    public static void main(String[] args) {
        Fish shark =new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }
    
}