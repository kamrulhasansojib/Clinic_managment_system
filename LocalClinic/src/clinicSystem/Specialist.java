package clinicSystem;

public class Specialist extends Doctor {
    
    
    public Specialist(String name, String specialization, int Room_No, String AvailableDays, String WardVisit) {
        super(name, specialization ,  Room_No, AvailableDays, WardVisit);
        
    }


    @Override
    public void doctorsAvailability() {
        System.out.println("Dr. " + getName() + " requires appointment confirmation.");
        System.out.println("Dr. " + getName()  +" Specialist on  " + getSpecialization() + " .");
        System.out.println("Chamber No: " + getRoomNo()  + " .");
        System.out.println("Available Days: " + getAvailableDays()  + " & Time: (4 PM - 9 PM).");
        System.out.println("Word Visit On: " + getWardVisit()  + " (9 AM - 10 AM).");
    }

    
}
