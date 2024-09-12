package clinicSystem;

public abstract class Doctor {
    private String name;
    private String specialization;
    private int Room_No;
    private String AvailableDays;
    private String WardVisit;


    public Doctor(String name,String specialization, int  Room_No, String AvailableDays, String WardVisit){
        this.name = name;
        this.specialization = specialization;
        this.Room_No =  Room_No;
        this.AvailableDays = AvailableDays;
        this.WardVisit = WardVisit;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getRoomNo() {
        return Room_No;
    }

    public void setRoom_No( int Room_No) {
        this. Room_No =  Room_No;
    }

    public void setAvailableDays( String AvailableDays) {
        this. AvailableDays = AvailableDays;
    }

    public String getAvailableDays() {
        return AvailableDays;
    }

    public String getWardVisit() {
        return WardVisit;
    }
    
    public void setWardVisit( String WardVisit) {
        this.WardVisit = WardVisit;
    }
    
    public abstract void doctorsAvailability();

    
}
