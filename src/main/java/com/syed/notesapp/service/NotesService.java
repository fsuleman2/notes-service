package com.syed.notesapp.service;

import java.util.List;

import com.syed.notesapp.model.Note;

public interface NotesService {
public Note createNote(Note note);
public Note getNoteById(String id);
public List<Note> getAllNotes();
public List<Note> getAllNotesPage(int pageNumber, int pageSize);
public Note updateNote(String id, Note note);
public void deleteNote(String id);

}
