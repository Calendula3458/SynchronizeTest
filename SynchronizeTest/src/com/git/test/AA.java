package com.git.test;

public class AA {
	public static void main(String[] args) {
		int a = -19;
		System.out.println(~a);
		String aa = new String("aa");
		String bb = aa;
		String cc = aa;
		aa = null;
		System.out.println(bb + cc);
	}
}
