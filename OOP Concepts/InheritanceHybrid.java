public class InheritanceHybrid {

    public static void main(String[] args) {
        Shark s1= new Shark();
        s1.name="Shark 1";
        System.out.println(s1.name);
        s1.swim();   // fish method
        s1.eat();    // animal method 

        System.out.println();

        Eagle e1= new Eagle();
        e1.sky= "blue";
        System.out.println(e1.sky);
        e1.fly();   ///bird method
        e1.eat();  // animal method


        
    }
    
}
class Animal{
    String type;

    void eat(){
        System.out.println("eats");
    }
}

class Fish extends Animal{
    String name;

    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    String sky;

    void fly(){
        System.out.println("flies");
    }
}

class Shark extends Fish{
    String name;
}

class Eagle extends Bird{
    String sky;
}