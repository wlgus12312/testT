package test;

public class byteTest {

	public static void main(String[] args) {

		byteTest bt = new byteTest();
		byte[] arr = new byte[] {'A','m','Z','t','i','n','g'};

		StringBuilder sb = new StringBuilder();
		int tint = 0;
		
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
			sb.append(bt.hexastr(arr[i]));
		}

		System.out.println("아스키  = " + sb);
		
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

	
	}


