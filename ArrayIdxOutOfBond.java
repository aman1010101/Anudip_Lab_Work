package com;

public class ArrayIdxOutOfBond {
	public void Array() {
		int[] arr = { 1, 5, 8, 6, 8 };
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println("array is at index:" + i + " value is "+ arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception is occure");
			e.printStackTrace();

		}
	}

	public static void main(String[] args) {
		ArrayIdxOutOfBond arrayIdxOutofbond = new ArrayIdxOutOfBond();
		arrayIdxOutofbond.Array();
		
				
		

	}

}
