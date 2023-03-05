package miniProject;

import java.util.*;

public class Authority extends Doctor {


	HashSet<Doctor> doc = new HashSet<>();
	Doctor d1 = new Doctor(101, "Dr. Pathan", "Male", "MBBBS", 7546882555L, "Mumbai");
	Doctor d2 = new Doctor(102, "Dr. Patil", "Male", "BHMS", 9425684685L, "Mumbai");
	Doctor d3 = new Doctor(103, "Dr. Sagar", "Male", " BDS(Dentist)", 546845468L, "Mumbai");
	Doctor d4 = new Doctor(104, "Dr. Thale", "Male", "Neurologist", 8458468912L, "Mumbai");
	Doctor d5 = new Doctor(105, "Dr. Nandni", "Female", "M.D.(Psychiatrist)", 8354625849L, "Mumbai");

	public Authority() {
		doc.add(d1);
		doc.add(d2);
		doc.add(d3);
		doc.add(d4);
		doc.add(d5);

	}

	Scanner sc = new Scanner(System.in);
	boolean found = false;

	public void alldoclist() {
		{
			if (doc.isEmpty()) {
				System.out.println("Sorry ,No record is present at movement");
			} else {
				for (Doctor d : doc) {
					System.out.println(d);
				}
			}
		}
	}

	public void searchdoc() {
		System.out.println("Enter the Id of a Doctor that you want to check");
		doc_id = sc.nextInt();
		for (Doctor d : doc) {
			if (d.getDoc_id() == doc_id) {
				System.out.println(d);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Theres no such Id is present.");
		}
	}

	public void deletedoc() {
		System.out.println("Enter the Id of Doctor which needs to be deleted");
		doc_id = sc.nextInt();
		boolean found = false;
		Doctor docdelete = null;
		for (Doctor d : doc) {
			if (d.getDoc_id() == doc_id) {
				docdelete = d;
				found = true;

			}
		}
		if (!found) {
			System.out.println("No such doctor is present");
		} else {
			doc.remove(docdelete);
			System.out.println("Patient with Id" + docdelete + " had been deleted Succesfully");
		}
	}
		public void addDoc() {
		    System.out.println("Enter the Id for Doctor");
		    doc_id = sc.nextInt();
		    sc.nextLine(); 

		    System.out.println("Enter the Name of Doctor");
		    doc_name = sc.nextLine();

		    System.out.println("Enter the Gender");
		    doc_gen = sc.nextLine();

		    System.out.println("Enter the Degree of Doctor");
		    doc_deg = sc.nextLine();

		    System.out.println("Enter the Contact Details ");
		    doc_contact = sc.nextLong();
		    sc.nextLine(); 

		    System.out.println("Enter the Address");
		    doc_add = sc.nextLine();

		    Doctor d = new Doctor(doc_id, "Dr."+doc_name, doc_gen, doc_deg, doc_contact, doc_add);
		    doc.add(d);
		    System.out.println(d);
		    System.out.println("Doctor details added Succesfully");
		}


	}


