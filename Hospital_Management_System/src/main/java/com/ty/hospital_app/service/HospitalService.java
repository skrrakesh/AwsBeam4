package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.HospitalDaoImp;
import com.ty.hospital_app.dto.Hospital;

public class HospitalService {
	
	public void saveHospital(Hospital hospital) {
		HospitalDaoImp daoimp=new HospitalDaoImp();
		Hospital hospital1=daoimp.saveHospital(hospital);
		if(hospital1!=null) {
			System.out.println("Data Saved");
		}
		else {
			System.out.println("Unfortunately DatA Not Saved");
		}
	}
	
	public Hospital getHospital(int hid) {
		HospitalDaoImp daoimp=new HospitalDaoImp();
		Hospital hospital=daoimp.getHospitalId(hid);
		if(hospital!=null) {
			return hospital;
		}
		else {
			return null;
		}
	}
	
	public void deleteHospital(int hid) {
		HospitalDaoImp daoimp=new HospitalDaoImp();
		boolean flag=daoimp.deleteHospitalId(hid);
		if(flag) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data Not Found");
		}
	}
	
	public void updateHospital(int hid, Hospital hospital) {
		HospitalDaoImp daoimp=new HospitalDaoImp();
		Hospital hospital1=daoimp.updateHospital(hid, hospital);
		if(hospital!=null) {
			System.out.println("Hospital Data Updated");
		}
		else {
			System.out.println("Hospital Data Not Updated");
		}
	}

}
