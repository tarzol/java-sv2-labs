package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Family {
    List<FamilyMember> familyMemberList = new ArrayList<>();

    public Family(List<FamilyMember> familyMemberList) {
        this.familyMemberList = familyMemberList;
    }


    public List<FamilyMember> getFamilyMemberList() {
        return familyMemberList;
    }

    public void addFamilyMember(FamilyMember familyMember) {
        familyMemberList.add(familyMember);
    }

    public List<FamilyMember> filteringNames(String name) {
        List<FamilyMember> filteredNames = new ArrayList<>();
        for ( FamilyMember member : familyMemberList) {
            if (member.getName().equals(name)) {
                filteredNames.add(member);
            }
        }
        return filteredNames;
    }

    public static void main(String[] args) {
        FamilyMember familyMember1 = new FamilyMember("Zoli", 60);
        FamilyMember familyMember2 = new FamilyMember("Kati", 38);
        FamilyMember familyMember3 = new FamilyMember("Peti", 25);
        FamilyMember familyMember4 = new FamilyMember("Zoli",40);

        List<FamilyMember> family1 = new ArrayList<>();
        Family family = new Family(family1);
        family.addFamilyMember(familyMember1);
        family.addFamilyMember(familyMember2);
        family.addFamilyMember(familyMember3);
        family.addFamilyMember(familyMember4);

        List<FamilyMember> filteredNames = family.filteringNames("Zoli");
        for (FamilyMember member : filteredNames) {
            System.out.println(member.getName()+" "+member.getAge());
        }
      }
}
