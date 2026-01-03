package ders11;

import java.util.List;

public class NoteService {

    private NoteRepository repo;

    NoteService(NoteRepository repo) {
        this.repo = repo;
    }

    void saveNotes(List<Note> notes) {
        repo.saveAll(notes);
    }

    void addNote(Note note) {
        repo.append(note);
    }

    List<Note> listNotes() {
        return repo.findAll();
    }

}
