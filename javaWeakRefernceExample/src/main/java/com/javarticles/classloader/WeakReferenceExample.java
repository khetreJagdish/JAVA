package com.javarticles.classloader;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WeakReferenceExample {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
          new Employee("Joe"),
          new Employee("Ram"),
          new Employee("Sam"),
          new Employee("John")
        };
        Company company = new Company();
        company.addEmployee(employees[0]);
        company.addEmployee(employees[1]);
        
        ReferenceQueue<Employee> queue = new ReferenceQueue<>();
        List<WeakReference<Employee>> empList = new ArrayList<WeakReference<Employee>>();
        for (int i = 0; i < employees.length; i++) {
            empList.add(new WeakReference<Employee>(employees[i], queue));
            employees[i] = null;
        }
        
        System.out.println("Queue's polling returns null? " + (queue.poll() == null));
        
        
        reclaimEmpObjects(empList);
        
        company.removeAllEmployees();
        
        reclaimEmpObjects(empList); 
                
                
        Reference<? extends Employee> empRef = queue.poll();
        System.out.println("Poll weak emp references garbage collected");
        while (empRef != null) {        
            empRef = queue.poll();
            if (empRef != null) {
                System.out.println("WeakReference of Emp removed from queue");
            }
        }
        System.out.println("done");
    }
    
    private static void reclaimEmpObjects(List<WeakReference<Employee>> empList) {
        System.out.println("Run gc");
        System.gc();
        boolean objReclaimed = false;
        while(!objReclaimed) {
            for (int i = 0; i < empList.size(); i++) {
                if (empList.get(i).get() == null) {
                    System.out.println("employee reclaimed");                    
                    objReclaimed = true;
                }
            }
        }  
        
        Predicate<WeakReference<Employee>> notNullEmp = empRef-> empRef.get() != null;
        List<WeakReference<Employee>> newEmpList = empList.stream().filter(notNullEmp).collect(Collectors.toList());
        empList.retainAll(newEmpList);
        System.out.println("Employee un-claimed size: " + empList.size());
    }
}
