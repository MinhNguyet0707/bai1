package Test;
	import java.awt.Menu;
import java.util.ArrayList;
import java.util.Scanner;

import contain.Type;
	import entity.Pet;
import handle.PetHandle;
	
	public class Main {
	public static ArrayList<Pet> petArrayList = new ArrayList<>();
	PetHandle petHandle= new PetHandle();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
	Pet pet = new Pet(1,"a", "a", 2, "female", "cat", Type.Dog, "a");
	Pet pet1 = new Pet(2,"b", "b", 2, "male", "cat", Type.Cat, "a");
	Pet pet2 = new Pet(3,"c", "c", 2, "female", "cat", Type.Cat, "a");
	Pet pet3 = new Pet(4,"d", "d", 2, "male", "dog", Type.Dog, "a");
	Pet pet4 = new Pet(5,"e", "e", 2, "male", "dog", Type.Cat, "a");
	Pet pet5= new Pet(6,"f", "f", 2, "male", "cat", Type.Dog, "a");
	petArrayList.add(pet1);
	petArrayList.add(pet2);
	petArrayList.add(pet3);
	petArrayList.add(pet4);
	petArrayList.add(pet5);	
	
	view.Menu.menu();
	
	
	
	}
	
	}
