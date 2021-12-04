import java.util.ArrayList;
import java.util.Date;

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
     * getFirstName method gets the first name of the paitent.
     * @return firstname
     */
    public String getFirstName() {
        String parts[] = record.getName().split(" ");
        return parts[0];
    }

    /**
     *  getLasttName method gets the last name of the paitent.
     * @return lastname 
     */
    public String getLastName() {
        String parts[] = record.getName().split(" ");
        return parts[1];
    }

    /**
     *  getBirthday method gets the birthday of the paitent. 
     *  @return birthday
     */
    public Date getBirthday() {
        return record.getBirthdate();
    }

    /**
     * getGender method gets the gender of the paitent.
     * @return gender
     */
    public Gender getGender() {
        Gender gender = Enum.valueOf(Gender.class, record.getGender());
        return gender;
    }

    /**
     * addVisit method adds the visits of the paitent to the record book.
     */
    public void addVisit(Date date, boolean well, String description) {
        visits.add(new Visit(date, well, description));
    }
    
    /**
     * The getvisithistory gets the visits of the paitent.
     * @return visits
     */
    public ArrayList<Visit> getVisitHistory() {
        return visits;
    }

    /**
     * The tostring method sets the string in a format.
     * @return result
     */
    public String toString() {
        String result = record.toString();
         return result;
    }
}