package com.keka.app;

import com.keka.service.AdminDepartment;
import com.keka.service.HrDepartment;
import com.keka.service.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment ad = new AdminDepartment();
		
		System.out.println("Admin Department Details:");
		System.out.println();
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		
		System.out.println();
		HrDepartment hd = new HrDepartment();
		
		System.out.println("Hr Department Details:");
		System.out.println();
		System.out.println(hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());
		
		System.out.println();
		TechDepartment td = new TechDepartment();
		
		System.out.println("Tech Department Details:");
		System.out.println();
		System.out.println(td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
		
	}	
		
}
