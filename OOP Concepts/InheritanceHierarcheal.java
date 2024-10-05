public class InheritanceHierarcheal {
    public static void main(String[] args) {
        Fish shark= new Fish();
        shark.name= "shark1";
        shark.eat();

        Bird eagle= new Bird();
        eagle.sky="blue";
        eagle.eat();
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