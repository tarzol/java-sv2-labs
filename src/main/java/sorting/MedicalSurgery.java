package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedicalSurgery {

    List<Patient> patients = new ArrayList<>();

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> patientOrderedList = new ArrayList<>(patients);
        Collections.sort(patientOrderedList, new PatientComparator());
        return patientOrderedList;
    }
}
