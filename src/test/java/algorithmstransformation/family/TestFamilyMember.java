package algorithmstransformation.family;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFamilyMember {
    @BeforeEach
    void init() {
        List<FamilyMember> familyMemberList = new ArrayList<>();
        Family family = new Family(familyMemberList);
        //family.addFamilyMember(new FamilyMember("Zoli", 60));
    }

    @Test
    void TestAddFamilyMember() {
        List<FamilyMember> familyMemberList = new ArrayList<>();
        Family family = new Family(familyMemberList);
        family.addFamilyMember(new FamilyMember("Zoli", 60));
        assertEquals(1, familyMemberList.size());
    }

}
