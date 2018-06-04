package com.edureka.wrapper;

public class WrapperDemo {
	public static void main(String[] args) {
		Integer i = new Integer(34);
		int i1 = 35;
		int val = Integer.parseInt("3400");
		Integer value = Integer.valueOf(val);
		int test = value.intValue();
		Integer k = 56;
		System.out.println(k.compareTo(56));
		
		Boolean b = false;
		Boolean b1 = new Boolean(true);
		acceptInteger(56);
	}
	
	public static int acceptInteger(Integer i) {
		
		return i*2;
	}

}
