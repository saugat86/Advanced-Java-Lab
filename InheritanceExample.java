public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
    }    
class Animal {
 	public void eat() {
 		System.out.println("Animal is eating");
 	}
 }
 class Dog extends Animal {
 	public void bark() {
 		System.out.println("Dog is barking");
 	}
 }
 class Cat extends Animal {
 	public void meow() {
 		System.out.println("Cat is meowing");
 	}
 }
 

    

