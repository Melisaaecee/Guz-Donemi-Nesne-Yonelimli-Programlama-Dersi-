package ders11;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        try {
            Path path = Path.of("notes.txt");

            NoteRepository repository = new TextFileRepository(path);
            NoteService service = new NoteService(repository);

            Note n1 = new Note(1, "satır", "Hello");
            Note n2 = new Note(2, "satır", "merhaba");

            service.addNote(n1);
            System.out.println("Yeni not eklendi.");

            service.addNote(n2);
            System.out.println("Yeni not eklendi.");

            List<Note> notlar = new ArrayList<>();
            notlar.add(new Note(3, "Java", "Dosya işlemleri ")); // dosyadaki notlar silinip yeni not eklendi
            notlar.add(new Note(4, "OOP", "Katmanlı mimari "));

            service.saveNotes(notlar);

            System.out.println("İlk notlar kaydedildi.");

            System.out.println("\n--- Dosyadaki Notlar ---");

            List<Note> notes = service.listNotes();

            for (Note n : notes) { // burada sadce son eklediğimiz kısım gözükür
                System.out.println(n.getId() + " " + n.getTitle() + " " + n.getText());
            }

        } catch (DataAccessException e) {
            System.err.println("HATA: " + e.getMessage());
        }
    }
}
