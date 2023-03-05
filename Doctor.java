package miniProject;

public class Doctor {
	public int doc_id;
	public String doc_name;
	public String doc_gen;
	public String doc_deg;
	public long doc_contact;
	public String doc_add;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(int doc_id, String doc_name, String doc_gen, String doc_deg, long doc_contact, String doc_add) {
		super();
		this.doc_id = doc_id;
		this.doc_name = doc_name;
		this.doc_gen = doc_gen;
		this.doc_deg = doc_deg;
		this.doc_contact = doc_contact;
		this.doc_add = doc_add;
	}

	public int getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}

	public String getDoc_name() {
		return doc_name;
	}

	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}

	public String getDoc_gen() {
		return doc_gen;
	}

	public void setDoc_gen(String doc_gen) {
		this.doc_gen = doc_gen;
	}

	public String getDoc_deg() {
		return doc_deg;
	}

	public void setDoc_deg(String doc_deg) {
		this.doc_deg = doc_deg;
	}

	public long getDoc_contact() {
		return doc_contact;
	}

	public void setDoc_contact(long doc_contact) {
		this.doc_contact = doc_contact;
	}

	public String getDoc_add() {
		return doc_add;
	}

	public void setDoc_add(String doc_add) {
		this.doc_add = doc_add;
	}

	@Override
	public String toString() {
		return "Doctor Id= " + doc_id + ", Docter Name = " + doc_name + ", Gender = " + doc_gen + ", Degree in "
				+ doc_deg + ", Contact No. = " + doc_contact + ", Address = " + doc_add;
	}

}
