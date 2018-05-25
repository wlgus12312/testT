package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int qq = sc.nextInt();
		sc.nextLine();
		
		int ten = new test().hexa(qq);
		
		new test().strInt(ten);
		
	}
	
	public int hexa(int a){
		
		byte[] aa = new byte[a];
		
		int ten = aa.length;
		
		String hexint = Integer.toHexString(ten).toUpperCase();
		
		System.out.println(hexint);
		
		return ten;
	}
	
	public void strInt(int ten){
		
		String s = String.format("%02X%n", ten); 
		
		String str = ""+ten;
		
		int t = Integer.parseInt(str);
		
		byte[] cc = new byte[t];
		
		System.out.println(cc.length);
		
	}
	
	

}
