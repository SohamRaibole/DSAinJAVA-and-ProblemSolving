public class MethodOverriding {
    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.eat();

        Animal a1= new Animal();
        a1.eat();
    }
    
}

class Animal{
    void eat(){
        System.out.println("eats");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("eats");
    }
}