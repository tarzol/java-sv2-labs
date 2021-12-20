package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {

    static PrimarySchoolChild of(int age) {
        if( age >= 6 && age <11) {
            return new LowerClassSchoolChild(age);
        } else if ( age >= 11 && age <=14) {
            return new UpperClassSchoolChild(age);
        } else {
            throw new IllegalArgumentException("A megadott személy nem az adott korosztályú.");
        }
    }

    public static void main(String[] args) {
        PrimarySchoolChild child1 = new LowerClassSchoolChild(8);
        PrimarySchoolChild child2 = new LowerClassSchoolChild(12);
        PrimarySchoolChild child21 = new LowerClassSchoolChild("Tibi");

        PrimarySchoolChild child3 = new UpperClassSchoolChild(8);
    }
}
