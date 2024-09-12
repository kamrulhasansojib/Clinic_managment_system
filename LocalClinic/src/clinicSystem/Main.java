
package clinicSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();

        doctors.add(new Specialist("Kamrul Hasan", "Medicine", 0, "Sunday/Wednesday", "Monday"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. View Doctors");
            System.out.println("2. Register Patient");
            System.out.println("3. Book Appointment");
            System.out.println("4. View Appointments");
            System.out.println("5. Exit");

            int select = scanner.nextInt();
            scanner.nextLine(); 

            switch (select) {
                case 1:
                    for (Doctor doctor : doctors) {
                        doctor.doctorsAvailability();
                    }
                    break;

                case 2:
                    System.out.println("1. Register Patient");
                    System.out.println("2. View Patient Details");
                    int choice = scanner.nextInt();
                    scanner.nextLine(); 

                    switch (choice) {
                        case 1:
                            System.out.println("Enter patient name: ");
                            String patientName = scanner.nextLine();

                            System.out.println("Enter patient age: ");
                            int patientAge = scanner.nextInt();
                            scanner.nextLine(); 
                            System.out.println("Enter patient gender: ");
                            String patientGender = scanner.nextLine();

                            System.out.println("Enter Doctor's Name for Appointment: ");
                            String doctorName = scanner.nextLine();

                            System.out.println("Enter Serial No: ");
                            int patientSerialNo = scanner.nextInt();
                            scanner.nextLine(); 
                            patients.add(new Patient(patientName, patientAge, patientGender, doctorName, patientSerialNo));
                            System.out.println(" Successful");
                            break;

                        case 2:
                            System.out.println("List of Patients:");
                            if (patients.isEmpty()) {
                                System.out.println("No patients registered.");
                            } else {
                                for (Patient patient : patients) {
                                    System.out.println(patient.getPatientDetails());
                                }
                            }
                            break;

                        default:
                            System.out.println("Invalid ");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Enter patient name: ");
                    String patientNameForAppointment = scanner.nextLine();

                    Patient patientForAppointment = null;
                    for (Patient p : patients) {
                        if (p.getName().equalsIgnoreCase(patientNameForAppointment)) {
                            patientForAppointment = p;
                            break;
                        }
                    }
                    if (patientForAppointment == null) {
                        System.out.println("Patient not found!");
                        break;
                    }

                    System.out.println("Enter doctor name: ");
                    String doctorNameForBooking = scanner.nextLine();

                    Doctor doctorForBooking = null;
                    for (Doctor d : doctors) {
                        if (d.getName().equalsIgnoreCase(doctorNameForBooking)) {
                            doctorForBooking = d;
                            break;
                        }
                    }
                    if (doctorForBooking == null) {
                        System.out.println("Doctor not found!");
                        break;
                    }

                    System.out.println("Enter appointment time: ");
                    String time = scanner.nextLine();

                    appointments.add(new Appointment(doctorForBooking, patientForAppointment, time));
                    System.out.println(" Successfull.");
                    break;

                case 4:
                    System.out.println("List of Appointments:");
                    if (appointments.isEmpty()) {
                        System.out.println("No scheduled.");
                    } else {
                        for (Appointment appointment : appointments) {
                            appointment.displayAppointmentDetails();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exit");
                    return; 

                default:
                    System.out.println("Invalid ");
                    break;
            }
        }
    }
}
