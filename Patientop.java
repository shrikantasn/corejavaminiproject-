package miniProject;

import java.util.*;

import org.hamcrest.core.IsEqual;

public class Patientop extends Patient {
	public Patientop(int pid, String pname, String pgen, int page, String pcon, String padd) {
		super(pid, pname, pgen, page, pcon, padd);

	}

	HashSet<Patient> pat = new HashSet<Patient>();
	Patient p1 = new Patient(1, "Nikhil", "Male", 22, "Allergy", "Mumbai");
	Patient p2 = new Patient(2, "Akhil", "Male", 24, "Headache", "Pune");
	Patient p3 = new Patient(3, "Sahil", "Male", 25, "Cold", "Akola");
	Patient p4 = new Patient(4, "Neha", "Female", 30, "Mental Health Issue", "Pune");
	Patient p5 = new Patient(5, "Yash", "Male", 40, "Viral flu", "Nagpur");

	public Patientop() {
		super();
		pat.add(p1);
		pat.add(p2);
		pat.add(p3);
		pat.add(p4);
		pat.add(p5);

	}

	Scanner sc = new Scanner(System.in);
	boolean found = false;

	public void allpatlist() {
		{
			if (pat.isEmpty()) {
				System.out.println("Sorry ,No record is present at movement");
			} else {
				for (Patient p : pat) {
					System.out.println(p);
				}
			}
		}

	}

	public void searchpat() {
		System.out.println("Enter the Id of a paitent that you want to check");
		pid = sc.nextInt();
		System.out.println("Patient Details Are as follows: \n");
		for (Patient p : pat) {
			if (p.getPid() == pid) {
				System.out.println(p);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Theres no such Id is present.");
		}
	}

	public void deletepat() {
		System.out.println("Enter the Id of patient which needs to be deleted");
		pid = sc.nextInt();
		boolean found = false;
		Patient patdelete = null;
		for (Patient p : pat) {
			if (p.getPid() == pid) {
				patdelete = p;
				found = true;

			}
		}
		if (!found) {
			System.out.println("No such patient is present");
		} else {
			pat.remove(patdelete);
			System.out.println("Patient with Id " + patdelete + " had been deleted Succesfully");
		}
	}

	public void addpat() {
		System.out.println("Enter the Id of a Patient");
		pid = sc.nextInt();

		System.out.println("Enter the Name of Patient");
		pname = sc.next();

		System.out.println("Enter the Gender of Patient");
		pgen = sc.next();

		System.out.println("Enter the Age of Patient");
		page = sc.nextInt();

		System.out.println("Enter the condition or problem of Patient");
		pcon = sc.next();

		System.out.println("Enter the Address of Patient");
		padd = sc.next();
		Patient p = new Patient(pid, pname, pgen, page, pcon, padd);
		pat.add(p);
		System.out.println(p);
		System.out.println("Patient details added Succesfully");
	}

}
