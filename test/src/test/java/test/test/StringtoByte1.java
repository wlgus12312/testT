package test.test;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

public class StringtoByte1 {
	
	StringBuffer sb = new StringBuffer();
	
	byte[] barr = new byte[]{};
	
	
	public StringtoByte1(){}
	
	public static void main(String[] args){
		
		StringtoByte1 stb = new StringtoByte1();
		
		String[] arr = stb.createHex();
		
		
		stb.hexNum(arr);
		
	}
	
	public String[] createHex(){
		
		String[] hexarr = new String[]{"6D7C"};
		
		return hexarr;
	}
	
	public void hexNum(String[] hexarr){
		
		StringBuffer str2 = new StringBuffer();
		
		for (int i = 0; i < hexarr.length; i++) {
			System.out.println("반복");
			str2 = this.hexToByteNum(hexarr[i]);
			sb.append(str2);

		}
		
		System.out.println("스트링퍼버 = " + sb);
		
		String str3 = new String(sb);
		System.out.println(str3);
		
		byte[] barr = str3.getBytes();
		System.out.println(barr);
		
		
		
	}
	
	public StringBuffer hexToByteNum(String str){
		
		StringBuffer sb1 = new StringBuffer();
		
		char one = str.charAt(0);
		char two = str.charAt(1);
		
		if(!(one == 'A' || one == 'B' || one == 'C' || one == 'D' || one == 'E' || one == 'F' || two == 'A' || two == 'B' || two == 'C'
				|| two == 'D' || two == 'E' || two == 'F')){
			
			int a4 = Integer.parseInt(str, 16);
			
			char c = (char)((byte)a4);
			
			System.out.println("테스트 = " + c);
			
			sb1.append(c);
			
		}
		
		if((one == 'A' || one == 'B' || one == 'C' || one == 'D' || one == 'E' || one == 'F' || two == 'A' || two == 'B' || two == 'C'
				|| two == 'D' || two == 'E' || two == 'F')){
			int a = Integer.parseInt(str, 16);
			
			char b = (char)a;
			
			System.out.println(";;;; = " + b);
			
			sb1.append(b);
		}
		
		return sb1;
	}
	
	
}
