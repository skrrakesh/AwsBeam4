package com.ty.hospital_app.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	private String date;
	private String discharge;
	@OneToMany
	private List<Observation> observations;
	@ManyToOne
	private Branch branches;
	@OneToMany
	private List<Medorder> medorders;
	@ManyToOne
	private Person persons;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDischarge() {
		return discharge;
	}
	public void setDischarge(String discharge) {
		this.discharge = discharge;
	}
	public List<Observation> getObservations() {
		return observations;
	}
	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}
	public Branch getBranches() {
		return branches;
	}
	public void setBranches(Branch branches) {
		this.branches = branches;
	}
	public List<Medorder> getMedorders() {
		return medorders;
	}
	public void setMedorders(List<Medorder> medorders) {
		this.medorders = medorders;
	}
	public Person getPersons() {
		return persons;
	}
	public void setPersons(Person persons) {
		this.persons = persons;
	}
} 
