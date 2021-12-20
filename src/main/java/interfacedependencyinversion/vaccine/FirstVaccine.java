package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements  Vaccine{

    List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        addPregnantsToList(registrated);
        addElderlyToList(registrated);
        addOthersToList(registrated);
    }

    private void addPregnantsToList(List<Person> persons) {
        for(Person p: persons) {
            if (p.getPregnant().equals(Pregnancy.YES)) {
                vaccinationList.add(p);
            }
        }
    }

    private void addElderlyToList(List<Person> persons) {
        for(Person p: persons) {
            if (p.getAge() > 65) {
                vaccinationList.add(p);
            }
        }
    }

    private void addOthersToList(List<Person> persons) {
        for(Person p: persons) {
                if (!p.getPregnant().equals(Pregnancy.YES) && !(p.getAge() > 65)) {
                vaccinationList.add(p);
            }
        }
    }
}
