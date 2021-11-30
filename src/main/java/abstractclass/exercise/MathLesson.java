package abstractclass.exercise;

public class MathLesson {
    public static void main(String[] args) {
        MathExercise add = new Adder();
        MathExercise subtract = new Subtracter();
        MathExercise multiply = new Multiplier();
        MathExercise divide = new Diviser();

        System.out.println(add.getSolution(7, 3));
        System.out.println(subtract.getSolution(7, 3));
        System.out.println(multiply.getSolution(7, 3));
        System.out.println(divide.getSolution(7, 3));
    }
}
