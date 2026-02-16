//base class (parent class)
class Animal {
    //function 1 
    void eat(){
        System.out.println("animal is eating ");
    }
}

// deriver class - (child class)
class Dog extends Animal {
    void bark(){
    System.out.println("animal is eating ");
    }
}

public class Inheritance {
public static void main(String args[]){
    Dog d1 = new Dog();
    d1.eat(); // eat function not in dog - but in animal it is available and - by extends keyword it is deriverd from base class

}
}