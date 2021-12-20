package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {

    List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        addYoungerToList(registrated);
        addElderlyToList(registrated);
    }

    private void addYoungerToList(List<Person> persons) {
        for ( Person p : persons) {
            if (p.getAge() < 65 && p.getPregnant() ==Pregnancy.NO && p.getChronic() == ChronicDisease.NO) {
                vaccinationList.add(p);
            }
        }
    }

    private void addElderlyToList(List<Person> persons) {
        for ( Person p : persons) {
            if ( p.getAge() >= 65 && p.getPregnant() ==Pregnancy.NO  && p.getChronic() == ChronicDisease.NO) {
                vaccinationList.add(p);
            }
        }
    }
}
