package clinicSystem;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String time;
    
    public Appointment(Doctor doctor, Patient patient, String time) {
        this.doctor = doctor;
        this.patient = patient;
        this.time = time;
    }
    
    public Doctor getDoctor() {
        return doctor;
    }
    
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String getTime() {
        return time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    
    public void displayAppointmentDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Time: " + time);
    }
}
