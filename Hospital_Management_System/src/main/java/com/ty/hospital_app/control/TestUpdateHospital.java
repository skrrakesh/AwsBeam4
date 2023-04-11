package com.ty.hospital_app.control;

import com.ty.hospital_app.dto.Hospital;
import com.ty.hospital_app.service.HospitalService;

public class TestUpdateHospital {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.setName("jayadevKumar");
		hospital.setWebsite("www.jayadevKumar.com");
		HospitalService service=new HospitalService();
		service.updateHospital(2, hospital);

	}

}
