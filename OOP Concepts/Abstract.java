public class Abstract {

    public static void main(String[] args) {
        Horse h= new Horse();         // for each class constructor of parent class is called first
        h.eat();
        h.walk();
        System.out.println();

        Chicken c= new Chicken();
        c.eat();;
        c.walk();
        System.out.println();

        // constructor is called   here in output the method output will bein seq animal-dog-rocky
        Rocky r = new Rocky();
    }
    
}

abstract class Animal{
    void eat(){
        System.out.println("eats");
    }

    abstract void walk();

    //constructor
    Animal(){
        System.out.println("animal constructor is called ");
    }

}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs ");
    }
}
 class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
 }

 // here we are creating classes with constructors
class Dog extends Animal{
    Dog(){
        System.out.println("dog constructor is called "); }

        void walk(){
            System.out.println("walks on 4 legs ");
        }
    }

    class Rocky extends Dog{
        Rocky(){
            System.out.println("rocky has 3 legs");
        }
    }
    