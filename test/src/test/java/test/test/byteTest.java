package test.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import tt.byteTest3;

public class byteTest {

static HashMap map = null;
	
	
	public static void main(String[] args) {

/*		byteTest bt = new byteTest();
		byte[] arr = new byte[] {'A','m','Z','t','i','n','g'};

		StringBuilder sb = new StringBuilder();
		int tint = 0;

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
			sb.append(bt.hexastr(arr[i]));
		}

		System.out.println("아스키  = " + sb);*/
		
		/*byteTest3 bt3 = new byteTest3();
		
		HashMap map = bt3.lookupTable();

		byte[] arr = new byte[] {'A','m','Z','t','i','n','g'};
		
		String sb = "";
		
		for (int i = 0; i < arr.length; i++) {
			
			int a = (int)arr[i]; 
			
			sb += bt3.hexastr(a);
			
		}
		System.out.println(sb);*/
		
		byteTest3 bt3 = new byteTest3();
		byte[] arr = new byte[] {'A','m','Z','t','i','n','g'};

		map = bt3.lookupTable();
		
		String sb = "";
		
		for (int i = 0; i < arr.length; i++) {
			
			int a = (int)arr[i]; 
			System.out.println("a의 값"+a);
			//매치해야되는 메소드 만들어야함
			//sb += bt3.hexastr(a);
			sb += bt3.match(a);
			
		}
		
		System.out.println(sb);
		
		//return sb;
		
	}
	
	
	public String test2(byte[] arr) {

		byteTest3 bt = new byteTest3();
//		byte[] arr = new byte[] {'A','m','Z','t','i','n','g'};

		/*StringBuilder sb = new StringBuilder();
		int tint = 0;

		for (int i = 0; i < arr.length; i++) {

			sb.append(bt.hexastr(arr[i]));
		}*/
		
		byteTest3 bt3 = new byteTest3();
		
		map = bt3.lookupTable();
		
		String sb = "";
		
		for (int i = 0; i < arr.length; i++) {
			
			int a = (int)arr[i]; 
			
			//매치해야되는 메소드 만들어야함
			//sb += bt3.hexastr(a);
			sb += bt3.match(a);
		}
		System.out.println("sb = " + sb);
		return sb;
	}
	
	
	public String match(int a) {
		
		String str = "";
		
		Set set = map.keySet();
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()){
			  int key = (int)iterator.next();
			  if(key == a) {
				  str = (String) map.get(key);
				  System.out.println(str);
			  }
			}
		
		return str;
	}
	
	
	
	

	public String hexastr(int a){

		String str = "";

		String temp = "";

		while(a != 0){

			switch(a % 16) {
			case 10:
				temp = "A";
				break;
			case 11:
				temp = "B";
				break;
			case 12:
				temp = "C";
				break;
			case 13:
				temp = "D";
				break;
			case 14:
				temp = "E";
				break;
			case 15:
				temp = "F";
				break;
			default:
				temp = (a % 16)+"";
			}
			str = temp + str;

			a /= 16;
		}

		return str;
	}
	
	
	public HashMap lookupTable() {
		byteTest3 bt3 = new byteTest3();
		
		HashMap map = new HashMap();
		
		String ab = ""; 
		
		
		for (int i = 0; i < 128; i++) {
			
			ab = "";
			
			if(i==0) {
				ab = "00";
			}else {
				
				if(i <16) {
					ab = "0";
				}
				ab += bt3.hexastr(i);
			}
			map.put(i, ab);
			
		}
		
		System.out.println(map.values());
		
		return map;
		
	} 
	
///////////////////////////////////////////////////////
	
	package tt;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Set;

	public class byteTest3 {

		static HashMap map = null;
		
		
		public static void main(String[] args) {

	/*		byteTest bt = new byteTest();
			byte[] arr = new byte[] {'A','m','Z','t','i','n','g'};

			StringBuilder sb = new StringBuilder();
			int tint = 0;

			for (int i = 0; i < arr.length; i++) {

				System.out.println(arr[i]);
				sb.append(bt.hexastr(arr[i]));
			}

			System.out.println("아스키  = " + sb);*/
			
			/*byteTest3 bt3 = new byteTest3();
			
			HashMap map = bt3.lookupTable();

			byte[] arr = new byte[] {'A','m','Z','t','i','n','g'};
			
			String sb = "";
			
			for (int i = 0; i < arr.length; i++) {
				
				int a = (int)arr[i]; 
				
				sb += bt3.hexastr(a);
				
			}
			System.out.println(sb);*/
			
			byteTest3 bt3 = new byteTest3();
			byte[] arr = new byte[] {'A','m','Z','t','i','n','g'};

			map = bt3.lookupTable();
			
			String sb = "";
			
			for (int i = 0; i < arr.length; i++) {
				
				int a = (int)arr[i]; 
				System.out.println("a의 값"+a);
				//매치해야되는 메소드 만들어야함
				//sb += bt3.hexastr(a);
				sb += bt3.match(a);
				
			}
			
			System.out.println(sb);
			
			//return sb;
			
		}
		
		
		public String test2(byte[] arr) {

			byteTest3 bt = new byteTest3();
//			byte[] arr = new byte[] {'A','m','Z','t','i','n','g'};

			/*StringBuilder sb = new StringBuilder();
			int tint = 0;

			for (int i = 0; i < arr.length; i++) {

				sb.append(bt.hexastr(arr[i]));
			}*/
			
			byteTest3 bt3 = new byteTest3();
			
			map = bt3.lookupTable();
			
			String sb = "";
			
			for (int i = 0; i < arr.length; i++) {
				
				int a = (int)arr[i]; 
				
				//매치해야되는 메소드 만들어야함
				//sb += bt3.hexastr(a);
				System.out.println("a의 값"+a);
				sb += bt3.match(a);
			}
			System.out.println("sb = " + sb);
			return sb;
		}
		
		
		public String match(int a) {
			return (String)map.get(a);
	/*		
			String str = "";
			
			Set set = map.keySet();
			
			Iterator iterator = set.iterator();
			
			while(iterator.hasNext()){
				  int key = (int)iterator.next();
				  if(key == a) {
					  str = (String) map.get(key);
					  System.out.println(str);
				  }
				}
			
			return str;*/
		}
		
		
		
		

		public String hexastr(int a){

			String str = "";

			String temp = "";

			while(a != 0){

				switch(a % 16) {
				case 10:
					temp = "A";
					break;
				case 11:
					temp = "B";
					break;
				case 12:
					temp = "C";
					break;
				case 13:
					temp = "D";
					break;
				case 14:
					temp = "E";
					break;
				case 15:
					temp = "F";
					break;
				default:
					temp = ""+(a % 16);
				}
				str = temp + str;

				a /= 16;
			}

			return str;
		}
		
		
		public HashMap lookupTable() {
			byteTest3 bt3 = new byteTest3();
			
			HashMap map = new HashMap();
			
			String ab = ""; 
			
			
			for (int i = 0; i < 128; i++) {
				
				ab = "";
				
				if(i==0) {
					ab = "00";
				}else {
					
					if(i <16) {
						ab = "0";
					}
					ab += bt3.hexastr(i);
				}
				map.put(i, ab);
				
			}
			
			System.out.println(map.values());
			
			return map;
			
		} 
		 

	}





	

	
	}


