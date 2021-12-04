import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;

public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;
    ArrayList<Visit> visits =  new ArrayList<Visit>();

    /**
     * Medical Record Adapter constructor assigns the current record.
     * @param record
     */
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    /**
     * 
     */
    public String getFirstName() {
        String parts[] = record.getName().split(" ");
        return parts[0];
    }

    /**
     * 
     */
    public String getLastName() {
        String parts[] = record.getName().split(" ");
        return parts[1];
    }

    /**
     * 
     */
    public Date getBirthday() {
        return record.getBirthdate();
    }

    /**
     * 
     */
    public Gender getGender() {
        Gender gender = Enum.valueOf(Gender.class, record.getGender());
        return gender;
    }

    /**
     * 
     */
    public void addVisit(Date date, boolean well, String description) {
        visits.add(new Visit(date, well, description));
    
    }
    
    /**
     * 
     */
    public ArrayList<Visit> getVisitHistory() {
        return visits;
    }

    /**
     * 
     */
    public String toString() {
        String result = record.toString();
         return result;
    }

    
}