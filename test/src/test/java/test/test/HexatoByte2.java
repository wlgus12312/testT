package test.test;

public class HexatoByte2 {
		
	LookupTable1 barr1 = new LookupTable1();
	byte[] barr2 = barr1.getTable();
	
	public static void main(String[] args) {
		
		/*String hex = "414243";
		HexatoByte2 bt2 = new HexatoByte2();
		byte[] barr = bt2.hexaInt(hex);
		
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
		}*/
		
	}
	
	public byte[] hexaString(String str) {
		String hex = str;
		byte[] barr = this.hexaInt(hex);
//		for (int i = 0; i < barr.length; i++) {
//			System.out.println(barr[i]);
//		}
		return barr;
	}
	
	public byte[] hexaInt(String str) {
		
		byte[] barr = new byte[str.length()/2];
		
		for (int i = 0; i < str.length(); i++) {
			
			char ch2 = str.charAt(i);
			char ch3 = str.charAt(i+1);
			i++;
			barr[i/2] = this.hexamatch(ch2, ch3);
		}
		
		return barr;
		
	}
	
	public byte hexamatch(char ch1, char ch2) {
	
//		System.out.println("넘어온 스트링 = " + ch1 + " : " +ch2);
		
		byte a = 0;
		byte b = 0;
		
		if(ch1<255) {
			if(ch1 >= '0' && ch1 <= '9') {
				a = (byte) (this.matchTable(ch1));
			}else if (ch1 >='A' && ch1<='F') {
				a = (byte)(this.matchTable(ch1));
			}else if(ch1 >= 'a' && ch1<='z') {
				a = (byte)(this.matchTable(ch1));
			}
		}
//		System.out.println("+++" + a);
		
		if(ch2<255) {
			if(ch2 >= '0' && ch2 <= '9') {
				b = (byte) (this.matchTable(ch2));
			}else if (ch2 >='A' && ch2<='F') {
				b = (byte) (this.matchTable(ch2));
			}else if(ch2 >= 'a' && ch2<='z') {
				b = (byte) (this.matchTable(ch2));
			}
		}
		
		byte c = (byte)(a*16 + b);
		
		return c;
		
	}

	public int matchTable(char ch1) {
		return barr2[ch1];
//		int a = 0;
//		int b = 0;
//		a = ch1;
//		System.out.println("매칭할 에이 = " + a);
//		b = barr2[a];
//		System.out.println("매칭된 인덱스의 값 = "+ barr2[a]);
//		System.out.println(b);
//		return b;
	}
	
	
	
	
	
	
	
	
}
