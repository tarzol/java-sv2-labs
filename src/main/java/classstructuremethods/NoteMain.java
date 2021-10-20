package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {

        Note note = new Note();
        note.setName("Newton");
        System.out.println("Jegyzetelő neve:  "+note.getName());

        note.setTopic("Vásárlás");
        System.out.println("Téma:  "+note.getTopic());

        note.setText("cukor, liszt");
        System.out.println("Jegyzet:  "+note.getText());

        //System.out.println(getNoteText());

    }
}
