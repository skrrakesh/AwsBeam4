package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.EncounterDaoImp;
import com.ty.hospital_app.dto.Encounter;

public class EncounterService {

	public void saveEncounter(int bid, Encounter encounter) {
		EncounterDaoImp  daoimp = new EncounterDaoImp ();
		Encounter encounter1 = daoimp.saveEncounter(bid, encounter);
		if (encounter1 != null) {
			System.out.println("Data Saved.");
		} else {
			System.out.println("Data not Saved.");
		}
	}

	public Encounter getEncounter(int eid) {
		EncounterDaoImp  daoimp = new EncounterDaoImp ();
		Encounter encounter1 = daoimp.getEncounter(eid);
		if (encounter1 != null) {
			return encounter1;
		} else {
			return null;
		}
	}

	public void deleteEncounter(int eid) {
		EncounterDaoImp  daoimp = new EncounterDaoImp ();
		boolean flag = daoimp.deleteEncounter(eid);

		if (flag) {
			System.out.println("Data Deleted.");
		} else {
			System.out.println("Data not Found.");
		}
	}

	public Encounter updateEncounter(int eid, Encounter encounter) {
		EncounterDaoImp daoimp = new EncounterDaoImp ();
		Encounter encounter1 = daoimp.updateEncounter(eid, encounter);
		if (encounter1 != null) {
			return encounter1;
		} else {
			return null;
		}
	}

	public void getAllEncounter() {
		EncounterDaoImp  daoimp = new EncounterDaoImp ();
		List<Encounter> encounters = daoimp.getAllEncounter();
		for (Encounter encounter : encounters) {
			System.out.println(encounter);
		}
	}
}
 
