package test.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class hexaTest {

	@Test
	public void testHexaString() {

		String hex = "414243";
		HexatoByte2 bt2 = new HexatoByte2();
		assertArrayEquals(new byte[] {65,66,67}, bt2.hexaString(hex));
		assertArrayEquals(new byte[] {00,01}, bt2.hexaString("0001"));
		assertArrayEquals(new byte[] {(byte) 0xFE,(byte) 0xFF}, bt2.hexaString("FEFF"));
		assertArrayEquals(new byte[] {(byte) 0xFE,(byte) 0xF0}, bt2.hexaString("FEFM"));
		assertArrayEquals(new byte[] {(byte) 0x00}, bt2.hexaString("한글"));
	// bt2.hexaString("FEF");
		
	}

	@Test
	public void testHexaInt() {
		
		//byte[] arr = new byte[] {'A','i','n','g'};
		byteTest1 bt = new byteTest1();
		//bt.test2(arr);
		//assertArrayEquals("65696E67", bt.test2(arr));
		assertEquals("41696E67", bt.test2(new byte[]{'A','i','n','g'}));
		
	}

	@Test
	public void testHexamatch() {
		fail("Not yet implemented");
	}

}
