package test.test;

import java.util.Arrays;

public class LookupTable1 {
	
	byte[] table = null;
	
	public LookupTable1() {
		
		this.table = new byte[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,      
				-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,			
				-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,			
				0,1,2,3,4,5,6,7,8,9,-1,-1,-1,-1,-1,-1,
				-1,10,11,12,13,14,15,-1,-1,-1,-1,-1,-1,-1,-1,-1,
				-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
				-1,10,11,12,13,14,15,-1,-1,-1,-1,-1,-1,-1,-1,-1,
				-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,
				-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1 };
		
	}

	public byte[] getTable() {
		return table;
	}

	public void setTable(byte[] table) {
		this.table = table;
	}

	@Override
	public String toString() {
		return "LookupTable1 [table=" + Arrays.toString(table) + "]";
	}
	
	
	
	
}
