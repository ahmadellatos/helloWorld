package com.juaracoding.helloworld;

import java.util.Scanner;

public class hellowWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Masukan Angka :");
//		Scanner scan = new Scanner(System.in);
//		int nilai = scan.nextInt();
//		
//		int counterBagi = 0;
//		
//		for(int i = 1; i >= 1; i--) {
//			counterBagi++;
//		}
//		
//		if(counterBagi == 2) {
//			System.out.println("Bilangan Prima");
//		} else {
//			System.out.println("Bukan Bilangan Prima");
//		}
//		System.out.println("Berapakah Anak Anda");
//		int anak = scan.nextInt();
//		
//		if(anak >= 2) {
//			System.out.println("Apakah anda sudah mengikuti program KB? (Y/T)");
//			String jawab = scan.next();
//			if(jawab.equalsIgnoreCase("y")) {
//				System.out.println("Kontrol di rumah sakit terdekat");
//			} else {
//				System.out.println("Silahkan Mengikuti program KB");
//			}
//		} else {
//			System.out.println("Terima Kasih");
//		}
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Masukan nama binatang");
//		String jawab = scan.next().toLowerCase();
//		
//		switch (jawab) {
//		case "kucing":
//		case "anjing":
//		case "tikus":
//			System.out.println("Binatang Mamalia");
//			break;
//		case "merak":
//		case "perkutut":
//		case "kutilang":
//			System.out.println("Binatang Aves/Unggas");
//			break;
//		default:
//			System.out.println("Binatang apa itu?");
//			break;
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan Panjang :");
		int panjang = scan.nextInt();
		System.out.println("Masukan Lebar :");
		int lebar = scan.nextInt();
		
		int nilai = 0;
		
		for(int i = 1; i <= lebar; i++) {
			for(int j = 1; j <= panjang; j++) {
				nilai++;
				int counterBagi = 0;
				
				for(int k = 1; k <= nilai; k++) {
					if(nilai % k == 0) {
						counterBagi++;
					}
				}
				
				if(counterBagi == 2) {
					System.out.print("!");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		
//		System.out.println("Masukan Angka :");
//		Scanner input = new Scanner(System.in);
//		
//		int angka = input.nextInt();
//		
//		for(int i = 1; i <= angka; i++) {
//			for(int j = 1 ; j <= angka; j++) {
//				if(j <= i) {
//					System.out.print("*");	
//				} else {
//					System.out.print("!");
//				}	
//			}
//			System.out.println("");
//		}
//		System.out.println("Masukan Angka :");
//		Scanner input = new Scanner(System.in);
//		
//		int angka = input.nextInt();
//		
//		for(int i = 1; i <= angka; i++) {
//			
//			int dummyKiri = angka-i;
//			int dummyKanan = angka+i;
//			
//			for(int j = 1; j <= angka * 2; j++) {
//				if(j == angka) {
//					System.out.println("!");
//				} else {
//					if (j>angka && j > dummyKanan) {
//						System.out.print(" ");
//					} else {
//						System.out.print("*");
//					}
//				}
//			}
//			System.out.println("");
//		}
	}
}
