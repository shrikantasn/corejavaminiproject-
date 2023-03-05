package miniProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient {
	public int pid;
	public String pname;
	public String pgen;
	public int page;
	public String pcon;
	public String padd;

	public Patient(int pid, String pname, String pgen, int page, String pcon, String padd) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pgen = pgen;
		this.page = page;
		this.pcon = pcon;
		this.padd = padd;
	}

	public Patient() {

	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPgen() {
		return pgen;
	}

	public void setPgen(String pgen) {
		this.pgen = pgen;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getPcon() {
		return pcon;
	}

	public void setPcon(String pcon) {
		this.pcon = pcon;
	}

	public String getPadd() {
		return padd;
	}

	public void setPadd(String padd) {
		this.padd = padd;
	}

	@Override
	public String toString() {
		return "Patient Id = " + pid + ", Patient Name = " + pname + ", Gender= " + pgen + ", Age = " + page
				+ ", Condition/Discease " + pcon + ", Address - " + padd;
	}

}
