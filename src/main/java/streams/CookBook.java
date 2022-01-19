package streams;

import java.util.List;
import java.util.stream.Collectors;

public class CookBook {

    private List<Cake> cakes;

    public List<Cake> getCakes() {
        return cakes;
    }

    public CookBook(List<Cake> cakes) {
        this.cakes = cakes;
    }

    public List<String> listCakeNamesWithGivenIngredient(String ingredient) {
        List<String> result = cakes.stream().
                filter(cake -> cake.getIngredients().contains(ingredient)).
                map(cake -> cake.getName()).
                collect(Collectors.toList());
        return result;
    }

    public List<String> listCakeNamesWithMaxIngredients(int max) {
        List<String> result = cakes.stream().
                filter(cook ->cook.getIngredients().size() <= max).
                map(cook -> cook.getName()).
                collect(Collectors.toList());
        return result;
    }


}
