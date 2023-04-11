package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.ObservationDaoImp;
import com.ty.hospital_app.dto.Observation;

public class ObservationService {

	public void saveObervation(int eid, Observation observation) {
		ObservationDaoImp daoimp = new ObservationDaoImp();
		Observation observation1 = daoimp.saveObservation(eid, observation);
		if (observation1 != null) {
			System.out.println("Data Saved.");
		} else {
			System.out.println("Data not Saved.");
		}
	}

	public Observation getObservationId(int oid) {
		ObservationDaoImp daoimp = new ObservationDaoImp();
		Observation observation1 = daoimp.getObservationId(oid);
		if (observation1 != null) {
			return observation1;
		} else {
			return null;
		}
	}

	public void deleteObservationId(int oid) {
		ObservationDaoImp daoimp = new ObservationDaoImp();
		boolean flag = daoimp.deleteObservationId(oid);

		if (flag) {
			System.out.println("Data Deleted.");
		} else {
			System.out.println("Data not Found.");
		}
	}

	public Observation updateObservationId(int oid, Observation observation) {
		ObservationDaoImp daoimp = new ObservationDaoImp();
		Observation observation1 = daoimp.updateObservationId(oid, observation);
		if (observation1 != null) {
			return observation1;
		} else {
			return null;
		}
	}

	public void getAllObservation() {
		ObservationDaoImp daoimp = new ObservationDaoImp();
		List<Observation> observations = daoimp.getAllObservation();
		for (Observation observation : observations) {
			System.out.println(observation);
		}
	}

	public void getObservationByDoctorName(String name) {
		ObservationDaoImp daoimp = new ObservationDaoImp();
		List<Observation> observations = daoimp.getObservationByDoctorName(name);
		for (Observation observation : observations) {
			System.out.println(observation);
		}
	}
}
