package lambdaoptional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Club {

    List<Member> members = new ArrayList<>();

    public Club(List<Member> members) {
        this.members = members;
    }

    public Optional<Member> findFirst(Predicate<Member> predicate) {
        for ( Member actual : members) {
            if (predicate.test(actual)) {
                return Optional.of(actual);
            }
        }
        return Optional.empty();
    }

    public Optional<Double> averageNumberOfSkills() {
        if (members.isEmpty()) {
            return Optional.empty();
        }
        int sum = 0;
        for (Member actual : members ) {
            sum += actual.getSkills().size();
        }

        return Optional.of(sum / (double)members.size());
    }

    public static void main(String[] args) {
        Club club1 = new Club(Arrays.asList(
                new Member("John Doe", Arrays.asList("Java", "OOP"), Gender.MALE),
                new Member("Jane Doe", Arrays.asList(".NET", "OOP"), Gender.FEMALE),
                new Member("James Doe", Arrays.asList("Python", "Java", "OOP"), Gender.MALE),
                new Member("Janet Doe", Arrays.asList("JavaScript", "scripting"), Gender.MALE)
        ));
        System.out.println(club1.findFirst(member -> member.getName().equals("John Doe")));
        System.out.println(club1.findFirst(member -> member.getName().equals("John Doe")).isPresent());
    }
}
