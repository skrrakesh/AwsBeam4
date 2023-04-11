package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.MedorderDaoImp;
import com.ty.hospital_app.dto.Medorder;

public class MedorderService {

	public void saveMedorder(int mid, Medorder medorder) {
		MedorderDaoImp daoimp = new MedorderDaoImp();
		Medorder medorder1 = daoimp.saveMedorder(mid, medorder);
		if (medorder1 != null) {
			System.out.println("Data Saved.");
		} else {
			System.out.println("Data not Saved.");
		}
	}

	public Medorder getMedorder(int mid) {
		MedorderDaoImp daoimp = new MedorderDaoImp();
		Medorder medorder1 = daoimp.getMedorder(mid);
		if (medorder1 != null) {
			return medorder1;
		} else {
			return null;
		}
	}

	public void deleteMedorder(int mid) {
		MedorderDaoImp daoimp = new MedorderDaoImp();
		boolean flag = daoimp.deleteMedorder(mid);

		if (flag) {
			System.out.println("Data Deleted.");
		} else {
			System.out.println("Data not Found.");
		}
	}

	public Medorder updateMedorder(int mid, Medorder medorder) {
		MedorderDaoImp daoimp = new MedorderDaoImp();
		Medorder medorder1 = daoimp.updateMedorder(mid, medorder);
		if (medorder1 != null) {
			return medorder1;
		} else {
			return null;
		}
	}

	public void getAllMedorder() {
		MedorderDaoImp daoimp = new MedorderDaoImp();
		List<Medorder> medorders = daoimp.getAllMedorder();
		for (Medorder medorder : medorders) {
			System.out.println(medorder);
		}
	}

	public void getMedorderByDoctorname(String name) {
		MedorderDaoImp daoimp = new MedorderDaoImp();
		List<Medorder> medorders = daoimp.getMedorderByDoctorname(name);
		for (Medorder medorder : medorders) {
			System.out.println(medorder);
		}
	}
}
