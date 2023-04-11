package com.ty.hospital_app.control;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestGetDataById {

	public static void main(String[] args) {
		HospitalService service=new HospitalService();
		Hospital hospital=service.getHospital(2);
		System.out.println("Hospital Id: "+hospital.getHid());
		System.out.println("Hospital Name: "+hospital.getName());
		System.out.println("Hospital Website: "+hospital.getWebsite());
	}

}
