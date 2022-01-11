package collectionslist;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodSore {
    private List<Food> foods = new LinkedList<>();

    public void addFood(Food food) {
        foods.add(food);
    }

    public void sellFirst(Food food) {
        if (LocalDate.now().equals(food.getLocaldate()) ) {
            foods.add(0, food);
        }
        else {
            foods.add(foods.size(), food);
        }
    }

    public List<Food> getFoods() {
        return foods;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Food actual : foods) {
            sb.append(actual.getName()+" "+actual.getLocaldate()+" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        FoodSore store = new FoodSore();

        System.out.println(store.toString());
        store.sellFirst(new Food("liszt", LocalDate.of(2022, 01, 02)));
        System.out.println(store.toString());
        store.sellFirst(new Food("cukor", LocalDate.of(2022, 01, 07)));
        System.out.println(store.toString());
        store.sellFirst(new Food("sör", LocalDate.now()));
        System.out.println(store.toString());
        store.sellFirst(new Food("bor", LocalDate.of(2022, 02, 02)));
        System.out.println(store.toString());

    }
}
