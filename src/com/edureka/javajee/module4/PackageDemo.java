package com.edureka.javajee.module4;

import com.edureka.interfaces.*;

import com.edureka.package1.MyClass;
import static com.edureka.package1.MyClass.VALUE;
import static com.edureka.package1.MyClass.callMe;
;
public class PackageDemo {
	public static void main(String[] args) {
		AccomodationService service = new AccomodationServiceImpl();
		MyClass myClass1 = new MyClass();
		myClass1.myClassPackage2();
		com.edureka.package2.MyClass myClass2 = new com.edureka.package2.MyClass();
		myClass2.myClassPackage2();
		com.edureka.package1.MyClass.callMe();
		callMe();
		System.out.println(VALUE);
		System.out.println();
	}
}
