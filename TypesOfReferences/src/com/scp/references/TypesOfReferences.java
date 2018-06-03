package com.scp.references;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

public class TypesOfReferences {

	public static void main(String[] args) {

		// softReferences();
		// strongReferences();
		// weakReferences();

	}

	public static void strongReferences() {
		Employee employee = new Employee(1, "Jagdish"); // Strong reference
		employee = null; // Eligible for GC
		System.out.println(employee); // null
	}

	public static void softReferences() {

		Employee employee = new Employee(1, "Jagdish");
		SoftReference<Employee> softReference = new SoftReference<Employee>(employee);
		System.out.println(softReference.get());
		employee = null;
		// System.gc();
		System.out.println(softReference.get());

	}

	public static void weakReferences() {

		Employee employee = new Employee(1, "Jagdsih");
		WeakReference<Employee> weakReference = new WeakReference<Employee>(employee);
		System.out.println(weakReference.get());
		employee = null;
		System.gc();
		System.out.println(weakReference.get());

	}
	
	
	public static void phantomReference() {
		
		
	}
}
