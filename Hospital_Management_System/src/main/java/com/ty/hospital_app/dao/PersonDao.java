package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Person;

public interface PersonDao {
	public Person savePerson(int personId, Person person);

	public Person getPersonId(int personId);

	public boolean deletePersonId(int personId);

	public Person updatePersonId(int personId, Person person);

	public List<Person> getAllPerson();

	public List<Person> getPersonByGender(String gender);

	public List<Person> getPersonByAge(int age);

	public List<Person> gerPersonByPhone(long phone);

}
