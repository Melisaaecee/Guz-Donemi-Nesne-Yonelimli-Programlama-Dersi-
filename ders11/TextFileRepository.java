package ders11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class TextFileRepository implements NoteRepository {
    private Path path;

    public TextFileRepository(Path path) {
        this.path = path;
    }

    // dosyaya notları kaydettiğimiz kısım
    @Override
    public void saveAll(List<Note> notes) {
        
        try (BufferedWriter w = Files.newBufferedWriter(path)) {

            for (Note n : notes) {
                w.write(n.toLine());
                w.newLine();
            }
        } catch (IOException e) {
            throw new DataAccessException("Dosyaya yazılamadı!", e);

        }
    }

    // dosyaya yeni satır ekleme
    @Override
    public void append(Note note) {
        try (BufferedWriter w =  Files.newBufferedWriter(path,StandardOpenOption.CREATE,StandardOpenOption.APPEND)) {

            w.write(note.toLine());
            w.newLine();

        } catch (IOException e) {
            throw new DataAccessException("Dosyaya yazılamadı!", e);

        }

    }

    // dosyadaki satırları okuyup listeye ekleme
    @Override
    public List<Note> findAll() {
        List<Note> notes = new ArrayList<>();

        try (BufferedReader r =  Files.newBufferedReader(path)) {
            String line;
            while ((line = r.readLine()) != null) {
                notes.add(Note.fromLine(line));
            }
        } catch (IOException e) {
            throw new DataAccessException("Dosya okunamadı", e);
        }

        return notes;

    }

}
