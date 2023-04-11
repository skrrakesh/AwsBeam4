package com.ty.hospital_app.service;

import com.ty.hospital_app.dao.imp.BranchDaoImp;
import com.ty.hospital_app.dao.imp.HospitalDaoImp;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Hospital;

public class BranchService {
	public void saveBranch(int hid, Branch branch) {
		BranchDaoImp branchdaoimp=new  BranchDaoImp();
		Branch branch1=branchdaoimp.saveBranch(hid, branch);
		if(branch1!=null) {
			System.out.println("Branch Saved");
		}
		else {
			System.out.println("Unfortunately DatA Not Saved");
		}
	}
	
	public Branch getBranch(int hid) {
		BranchDaoImp branchdaoimp=new  BranchDaoImp();
		Branch branch1=branchdaoimp.getBranch(hid);
		if(branch1!=null) {
			return branch1;
		}
		else {
			return null;
		}
	}
	
	public void deleteBranch(int hid) {
		BranchDaoImp branchdaoimp=new  BranchDaoImp();
		boolean flag=branchdaoimp.deleteBranch(hid);
		if(flag) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("Data Not Found");
		}
	}
	
	public void updateBranch(int hid, Branch branch) {
		BranchDaoImp branchdaoimp=new  BranchDaoImp();
		Branch branch1=branchdaoimp.updateBranch(hid, null);
		if(branch1!=null) {
			System.out.println("Branch Data Updated");
		}
		else {
			System.out.println("Branch Data Not Updated");
		}
	}

}
