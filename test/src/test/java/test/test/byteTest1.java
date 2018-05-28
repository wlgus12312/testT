	package test.test;

	import static org.junit.Assume.assumeFalse;

import java.util.HashMap;

	public class byteTest1 {

		static HashMap map = null;
		static String[] hexaTable = null;
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
			
			/*byteTest1 bt3 = new byteTest1();
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
			
			System.out.println(sb);*/
			
			//return sb;
			
			
			byteTest1 bt1 = new byteTest1();
			String[] hexaTable1 = bt1.lookup();
	
			hexaTable = hexaTable1;
			String str = bt1.test2(new byte[]{'A','i','n','g'});
			
			System.out.println(str);
			
			
		}
		
		
		public String test2(byte[] arr) {
			
			
			byteTest1 bt1 = new byteTest1();
			String[] hexaTable1 = bt1.lookup();
	
			hexaTable = hexaTable1;
			
			String sb = "";
			for (int i = 0; i < arr.length; i++) {
				int a = (int)arr[i]; 
				System.out.println("모지"+a);
				sb += this.match(a);
			}
			System.out.println("sb = " + sb);
			return sb;
		}
		
		
		public String match(int a) {
			
			String str = "";
			
			int d = (char)a;
			
			for (int i = 0; i < hexaTable.length; i++) {
				
				if(d<0) {
					d = d+256;
				}
				
				str = hexaTable[d];
				
			}
			
			return str;
		
		}
		
		

		/*public String hexastr(int a){

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
*/		
		
		/*public HashMap lookupTable() {
			
			//HashMap map = new HashMap();
			
			String ab = ""; 
			
			
			for (int i = 0; i < 128; i++) {
				
				ab = "";
				
				if(i==0) {
					ab = "00";
				}else {
					
					if(i <16) {
						ab = "0";
					}
					ab += this.hexastr(i);
				}
				map.put(i, ab);
				
			}
			
			System.out.println(map.values());
			
			return map;
			
		}*/ 
		
		public String[] lookup() {
			
			 String[] hexaTable = new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "0A", "0B", "0C", "0D", "0E", "0F"
		                , "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "1A", "1B", "1C", "1D", "1E", "1F"
		                , "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "2A", "2B", "2C", "2D", "2E", "2F"
		                , "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "3A", "3B", "3C", "3D", "3E", "3F"
		                , "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "4A", "4B", "4C", "4D", "4E", "4F"
		                , "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "5A", "5B", "5C", "5D", "5E", "5F"
		                , "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "6A", "6B", "6C", "6D", "6E", "6F"
		                , "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "7A", "7B", "7C", "7D", "7E", "7F"
		                , "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "8A", "8B", "8C", "8D", "8E", "8F"
		                , "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "9A", "9B", "9C", "9D", "9E", "9F"
		                , "A0", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "AA", "AB", "AC", "AD", "AE", "AF"
		                , "B0", "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "BA", "BB", "BC", "BD", "BE", "BF"
		                , "C0", "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "CA", "CB", "CC", "CD", "CE", "CF"
		                , "D0", "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "DA", "DB", "DC", "DD", "DE", "DF"
		                , "E0", "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "EA", "EB", "EC", "ED", "EE", "EF"
		                , "F0", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "FA", "FB", "FC", "FD", "FE", "FF"};
			
			 return hexaTable;
			
		}
		 

	}

	

	


