package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> toDoList = new ArrayList<>();
        String toDo = null;

        while (toDo != "X") {
            System.out.println("Tennivalók: ");
            toDo = scanner.nextLine();
            toDoList.add(toDo);
            System.out.println(toDoList);
        }
        try {
            Files.write(Paths.get("todos.txt"), toDoList);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
