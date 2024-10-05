

class InheritanceMultilevel {
    public static void main(String[] args) {

        Dog Rocky= new Dog ();
        Rocky.legs=4;
        System.out.println(Rocky.legs);
        Rocky.eat();
        
        
    }
}
class Animal{
    String type;
    
    void eat(){
        System.out.println("eats");
    }}

    class Mammal extends Animal{
    int legs;
     }

     class Dog extends Mammal{
        String breed;
        
        }
     
    
