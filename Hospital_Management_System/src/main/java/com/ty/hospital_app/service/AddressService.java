package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.AddressDaoImp;
import com.ty.hospital_app.dto.Address;

public class AddressService {

	public void saveAddress(int bid, Address address) {
		AddressDaoImp daoimp = new AddressDaoImp();
		Address address1 = daoimp.saveAddress(bid, address);
		if (address1 != null) {
			System.out.println("Data Saved.");
		} else {
			System.out.println("Data not Saved.");
		}
	}

	public Address getAddress(int id) {
		AddressDaoImp daoimp = new AddressDaoImp();
		Address address1 = daoimp.getAddress(id);
		if (address1 != null) {
			return address1;
		} else {
			return null;
		}
	}

	public void deleteAddress(int id) {
		AddressDaoImp daoimp = new AddressDaoImp();
		boolean flag = daoimp.deleteAddress(id);

		if (flag) {
			System.out.println("Data Deleted.");
		} else {
			System.out.println("Data not Found.");
		}
	}

	public Address updateAddress(int id, Address address) {
		AddressDaoImp daoimp = new AddressDaoImp();
		Address address1 = daoimp.updateAddress(id, address);
		if (address1 != null) {
			return address1;
		} else {
			return null;
		}
	}

	public void getAllAddresses() {
		AddressDaoImp daoimp = new AddressDaoImp();
		List<Address> addresses = daoimp.getAllAddresses();
		for (Address address : addresses) {
			System.out.println(address);
		}
	}
}
