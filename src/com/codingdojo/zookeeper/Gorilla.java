package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Threw a banana peel");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Ate a banana");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Climbed a tree");
		energyLevel -= 10;
	}

}
