package handle;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Test.Main;
import contain.Type;
import entity.Pet;

public class PetHandle { 
	public  Pet inputPet(Scanner sc) {
		System.out.println("nhap id pet của mình");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("nhap name pet của mình");
		String name = sc.nextLine();
		System.out.println("nhap species pet của mình");
		String species = sc.nextLine();
		System.out.println("nhap age pet của mình");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("nhap sex pet của mình");
		String sex = sc.nextLine();
		System.out.println("nhap description pet của mình");
		String description = sc.nextLine();		
		System.out.println("Nhập loại : ");
        System.out.println("1. Dog");
        System.out.println("2. cat");
        int luaChon ;
        Type type = null;
     do {
         luaChon = new Scanner(System.in).nextInt();
         if (luaChon >= 1 && luaChon <= 2) {
             break;
         }
         System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
     } while (true);
     
     switch (luaChon) {  
         case 1:
         type=Type.Dog;
             break;
         case 2:
           type=Type.Cat;
             break;
     }
		System.out.println(" mô tả hình ảnh ");
		String imager = sc.nextLine();
		Pet pet = new Pet(id, name, species, age, sex, description, type, imager);
		System.out.println(pet.toString());
		return pet;
	}
	public Pet hienThiNgauhienPet() {
		
		Random rd = new Random();
		int viTri = rd.nextInt(Main.petArrayList.size()+1);		
		 Pet ketQua =  Main.petArrayList.get(viTri);		
		return ketQua;
	}
	public  void soSanh(Pet pet1,Pet pet2) {
		if(pet1.getType()==pet2.getType()&&pet1.getSex()!=pet2.getSex()) {
			System.out.println("bạn đã lấy ra pet thành công"+pet2.toString());			
		}else {
			System.out.println("pet ngẫu nhiên ko hợp lệ");
		}	
	}

}
