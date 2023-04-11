package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.PersonDaoImp;
import com.ty.hospital_app.dto.Person;

public class PersonService {

	public void savePerson(int personId, Person person) {
		PersonDaoImp daoimp = new PersonDaoImp();
		Person person1 = daoimp.savePerson(personId, person);
		if (person1 != null) {
			System.out.println("Data Saved.");
		} else {
			System.out.println("Data not Saved.");
		}
	}

	public Person getPersonId(int personId) {
		PersonDaoImp daoimp = new PersonDaoImp();
		Person person1 = daoimp.getPersonId(personId);
		if (person1 != null) {
			return person1;
		} else {
			return null;
		}
	}

	public void deletePersonId(int personId) {
		PersonDaoImp daoimp = new PersonDaoImp();
		boolean flag = daoimp.deletePersonId(personId);

		if (flag) {
			System.out.println("Data Deleted.");
		} else {
			System.out.println("Data not Found.");
		}
	}

	public Person updatePersonId(int personId, Person person) {
		PersonDaoImp daoimp = new PersonDaoImp();
		Person person1 = daoimp.updatePersonId(personId, person);
		if (person1 != null) {
			return person1;
		} else {
			return null;
		}
	}

	public void getAllPerson() {
		PersonDaoImp daoimp = new PersonDaoImp();
		List<Person> persons = daoimp.getAllPerson();
		for (Person person : persons) {
			System.out.println(person);
		}
	}

	public void getPersonByGender(String gender) {
		PersonDaoImp daoimp = new PersonDaoImp();
		List<Person> persons = daoimp.getPersonByGender(gender);
		for (Person person : persons) {
			System.out.println(person);
		}
	}

	public void getPersonByAge(int age) {
		PersonDaoImp daoimp = new PersonDaoImp();
		List<Person> persons = daoimp.getPersonByAge(age);
		for (Person person : persons) {
			System.out.println(person);
		}
	}

	public void getPersonByPhone(long phone) {
		PersonDaoImp daoimp = new PersonDaoImp();
		List<Person> persons = daoimp.gerPersonByPhone(phone);
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
