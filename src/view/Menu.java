package view;

import java.util.Scanner;

import entity.Pet;
import handle.PetHandle;

public class Menu {
	public static Pet petNhapVao = new Pet();

	public static void menu() {
		PetHandle petHandel = new PetHandle();
		Scanner sc = new Scanner(System.in);
		while (true) {
			showMenu();
			int functionChoice = chooseFunction();
			switch (functionChoice) {
			case 1:
				petNhapVao = petHandel.inputPet(sc);
				break;
			case 2:
				if(petNhapVao.getName()==null||petNhapVao.getName()=="") {
					System.out.println("nhập chức năng 1 đi");
					break;
				}
				Pet petNgauNhien = petHandel.hienThiNgauhienPet();
				petHandel.soSanh( petNhapVao,petNgauNhien);
				break;
			case 3:
                showSortMenu();
				break;
			}
		}
	}

	public static int chooseFunction() {
		System.out.print("Xin mời chọn chức năng: ");
		int choice = 0;
		do {
			choice = new Scanner(System.in).nextInt();
			if (choice >= 1 && choice <= 4) {
				break;
			}
			System.out.print("Chức năng vừa chọn không hợp lệ, vui lòng chọn lại: ");
		} while (true);
		return choice;
	}

	public static void showMenu() {
		System.out.println("----PHỐI GIỐNG CHO THÚ CƯNG-----");
		System.out.println("1. Nhập thông tin pet của mình.");
		System.out.println("2. Hiển thị thông tin ngẫu nhiên 1 pet.");
		System.out.println("3. bạn có muốn tìm chú pet khác ko.");
		System.out.println("4. Thoát.");
	}
	 private static void showSortMenu() {
	        System.out.println("Bạn muốn tìm chú pet khác ko ");
	        System.out.println("1. Yes");
	        System.out.println("2. No");
	        int choose = 0;
	        do {
	            choose = new Scanner(System.in).nextInt();
	            if (choose >= 1 && choose <= 2) {
	                break;
	            }
	            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
	        } while (true);
	        switch (choose) {
	            case 1:
	               System.out.println("có");
	                break;
	            case 2:
	               System.out.println("ko");
	                break;
	        }
	 }
}


