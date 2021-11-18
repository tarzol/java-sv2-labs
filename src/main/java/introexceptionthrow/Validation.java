package introexceptionthrow;

public class Validation {
    public void validateName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("A név megadása nem megfelelő!");
        }
    }
    public void validateAge(String ageString) {
        if (ageString.equals("")) {
            throw new IllegalArgumentException("A megadott adat üres!");
        }

        /*if ( Integer.parseInt(ageString) == false) {
            throw new IllegalArgumentException("A megadott adat üres!");
        }*/
        if (Integer.parseInt(ageString) <0 || Integer.parseInt(ageString) > 120 ) {
            throw new IllegalArgumentException("A megadott kor nem megfelelő!");
        }
    }

}
