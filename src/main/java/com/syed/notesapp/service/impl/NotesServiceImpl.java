package com.syed.notesapp.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.syed.notesapp.model.Note;
import com.syed.notesapp.repository.NotesRepository;
import com.syed.notesapp.service.NotesService;

@Service
public class NotesServiceImpl implements NotesService {
	private NotesRepository repository;
	private Note note = null;

	public NotesServiceImpl(NotesRepository repository) {
		this.repository = repository;
	}

	@Override
	public Note createNote(Note note) {
		note.setNoteId(UUID.randomUUID().toString());
		return repository.save(note);
	}

	@Override
	public Note getNoteById(String id) {
		Optional<Note> optional = repository.findById(id);
		if (optional.isPresent()) {
			note = optional.get();
		}
		return note;
	}

	@Override
	public List<Note> getAllNotes() {
		List<Note> notes = repository.findAll();
		return notes;
	}

//	Pageable example
	@Override
	public List<Note> getAllNotesPage(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		Page<Note> pageData = repository.findAll(pageable);
		List<Note> notes = pageData.getContent();
		return notes;
	}

	@Override
	public Note updateNote(String id, Note note) {
		Note newNote = repository.findById(id).orElseThrow(() -> new RuntimeException("No Note Found"));
		newNote.setTitle(note.getTitle());
		newNote.setContent(note.getContent());
		newNote.setLive(note.isLive());
		newNote.setAddedDate(note.getAddedDate());
		return repository.save(newNote);

	}

	@Override
	public void deleteNote(String id) {
		Note note = repository.findById(id).orElseThrow(() -> new RuntimeException("No id found so cannot delete"));
		repository.delete(note);
	}

}
