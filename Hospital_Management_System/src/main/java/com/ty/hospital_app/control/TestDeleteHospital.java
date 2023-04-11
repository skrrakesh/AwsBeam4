package com.ty.hospital_app.control;

import com.ty.hospital_app.service.HospitalService;

public class TestDeleteHospital {

	public static void main(String[] args) {
		HospitalService service=new HospitalService();
		service.deleteHospital(3);

	}

}
