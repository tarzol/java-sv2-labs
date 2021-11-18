package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Winner {
    List<String> names = new ArrayList<>();

    public void addNames(String name) {
        names.add(name);
    }

    public String getWinner() {
        Random random = new Random();
        int randomNumber = random.nextInt(names.size());
        String randomName = names.get(randomNumber).toUpperCase();
        return randomName;
    }
}




