package miniProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		int choice = 0, ch1 = 0, ch2 = 0;
		Scanner scan = new Scanner(System.in);
		Patientop pt = new Patientop();
		Authority at = new Authority();
		do {
		System.out.println("***************************");
		System.out.println("Welcom To We Care Hospital ");
		System.out.println("Please Enter Identify Yourself\n1.Authority \t 2.Doctor \t3.Patient \t4.Exit");
		Scanner scan2 = new Scanner(System.in);
		 try {
		        ch1 = scan.nextInt();
		    } catch (InputMismatchException e) {
		        System.out.println("Invalid input. Please enter a valid integer.");
		        scan.next(); 
		        continue; 
		    }
		System.out.println("***************************");
		
			if (ch1 == 1)

				// Authority area
				do {
					System.out.println("*****Welcome Sir*****");
					System.out.println(
							"1.View Doctors \t 2.View Patients \t 3.Add Doctor \t 4.Remove Doctor\t5.Search Doctor\t6.Exit");
					ch2 = scan.nextInt();
					switch (ch2) {
					case 1:
						System.out.println("***************************");
						System.out.println("**List of Doctor in Hospital**");
						at.alldoclist();
						System.out.println("***************************");
						break;
					case 2:
						System.out.println("***************************");
						System.out.println("**List of Patients in Hospital**");
						pt.allpatlist();
						System.out.println("***************************");
						break;
					case 3:
						System.out.println("***************************");
						System.out.println("Enter the Details of Doctor");
						at.addDoc();
						System.out.println("***************************");
						break;
					case 4:
						System.out.println("***************************");
						System.out.println("Enter the Doctor Details");
						at.deletedoc();
						System.out.println("***************************");
						break;
					case 5:
						System.out.println("***************************");
						System.out.println("Enter the Details of Doctor as follws ");
						at.searchdoc();
						System.out.println("***************************");
						break;
					case 6:
						System.out.println("***************************");
						System.out.println("^_^ Have a Good Day Sir! Thank you! ^_^");
						System.out.println("---------------------------");
						break;
					default:
						System.out.println("**Not Valid Sorry Please Enter Valid Choice Sir**");
						break;
					}
				} while (ch2 != 6);

			else if (ch1 == 2) {
				// Doctor area
				do {

					System.out.println("***Welcome Doctor***");
					System.out.println(
							"1.View Patients \t 2.Add Patient \t 3.Remove Patient \t 4.Search Patient \t 5.View Doctors \t 6.Exit");
				    try {
				        ch2 = scan.nextInt();
				    } catch (InputMismatchException e) {
				        System.out.println("Invalid input. Please enter a valid integer.");
				        scan.next(); 
				        continue; 
				    }
					switch (ch2) {
					case 1:
						System.out.println("***************************");
						System.out.println("**Here the List of Patients in Hospital**");
						pt.allpatlist();
						System.out.println("***************************");
						break;
					case 2:
						System.out.println("***************************");
						System.out.println("Add Patient Details");
						pt.addpat();
						System.out.println("***************************");
						break;
					case 3:
						System.out.println("***************************");
						System.out.println("Enter the Patient Details");
						pt.deletepat();
						System.out.println("***************************");
						break;
					case 4:
						System.out.println("***************************");
						System.out.println("Enter The Paitent Details For Search");
						pt.searchpat();
						System.out.println("***************************");
						break;
					case 5:
						System.out.println("***************************");
						System.out.println("**List of Doctor in Hospital**");
						at.alldoclist();
						System.out.println("***************************");
						break;
					case 6:
						System.out.println("***************************");
						System.out.println("^_^ Have a Good Day Doctor! Thank you! ^_^");
						System.out.println("---------------------------");	
						break;
					default:
						System.out.println(" Not valid for the System ");
						break;

					}
				} while (ch2 != 6);
			} 
			else if (ch1 == 3) {
				// Patient area
				do {
					System.out.println("****Welcome to Our Hospital****");
					System.out.println("*-*-*Hope you are having good health and well-being*-*-*");
					System.out.println("---How can I help You? Enter your Choice---");
					System.out.println(
							"1.Create Appointment for Patient \t 2.Search for Patient \t 3.View Doctors in Hospital \t 4.Exit");
					 try {
					       choice = scan.nextInt();
					    } catch (InputMismatchException e) {
					        System.out.println("Invalid input. Please enter a valid integer.");
					        scan.next(); 
					        continue; 
					    }
					switch (choice) {
					case 1:
						System.out.println("***************************");
						System.out.println("Enter Patient Details for an Appointment");
						pt.addpat();
						System.out.println("***************************");
						break;
					case 2:
						System.out.println("***************************");
						System.out.println("Enter The Paitent Details For Search");
						pt.searchpat();
						System.out.println("***************************");
						break;
					case 3:
						System.out.println("***************************");
						System.out.println("**List of Doctor in our Hospital**");
						at.alldoclist();
						System.out.println("***************************");
						break;
					case 4:
						System.out.println("***************************");
						System.out.println("^_^ Have a Good Day! Thank you for Visiting! ^_^");
						System.out.println("---------------------------");
						break;
					default:
						System.out.println(" ##Please enter the valid Choice## ");
						break;

					}

				} while (choice != 4);
			}
			else if(ch1==4) {
				System.out.println("Thank you!");
				System.exit(0);
			}			
		} while (ch1 != 4);
	}
}