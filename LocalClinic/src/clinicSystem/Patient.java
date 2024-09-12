package clinicSystem;

public class Patient {
    private String Name;
    private int Age;
    private String Gender;
    private String pAppointment;
    private int SerialNo;
   
    public Patient(String name, int age, String Gender, String pAppointment, int SerialNo) {
        this.Name = name;
        this.Age = age;
        this.Gender = Gender;
        this.pAppointment = pAppointment;
        this.SerialNo = SerialNo;
    }
    
    public String getName() {
        return Name;
    }
    
    public void setName(String name) {
        this.Name = name;
    }
    
    public int getAge() {
        return Age;
    }
    
    public void setAge(int age) {
        this.Age = age;
    }

    public String getGender() {
        return Gender;
    }
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getpAppointment() {
        return pAppointment;
    }
    public void setpAppointment(String pAppointment) {
        this.pAppointment =pAppointment;
    }

    public int getSerialNo() {
        return SerialNo;
    }
    
    public void setSerialNo(int SerialNo) {
        this.SerialNo = SerialNo;
    }

    public String getPatientDetails() {
        return "Name: " + Name + ", Age: " + Age + ", Gender: " + Gender + ", Appoint at : Dr. " + pAppointment  + ", Serial No: " + SerialNo;
    }
}

