package com.edureka.package2;

import com.edureka.package1.PrivateModifiedDemo;

public class DefaultAccessCheck extends PrivateModifiedDemo {
	public static void main(String[] args) {
		DefaultAccessCheck demo = new DefaultAccessCheck();
		demo.protectedMethod();
	}

}
