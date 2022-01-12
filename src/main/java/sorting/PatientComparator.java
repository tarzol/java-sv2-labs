package sorting;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient patient1, Patient patient2) {
        return patient1.getTimeOfMeetingGP().compareTo(patient2.getTimeOfMeetingGP());
    }
}
