package com.paulinavelazquez;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
	    dog.breathe();
	    dog.eat();

	    Parrot parrot = new Parrot("Australian ringneck");
	    parrot.breathe();
	    parrot.eat();

	    Pinguin pinguin = new Pinguin("Emperor");
	    pinguin.fly();
    }
}


