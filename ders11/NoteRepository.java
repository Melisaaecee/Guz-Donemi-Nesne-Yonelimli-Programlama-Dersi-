package ders11;

import java.util.List;

public interface NoteRepository {
    void saveAll(List<Note> notes);

    void append(Note note);

    List<Note> findAll();
}
