package com.syed.notesapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.syed.notesapp.model.Note;
import com.syed.notesapp.service.NotesService;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api/v1/note")
public class NoteController {
	@Autowired
	private NotesService notesService;
	@PostMapping(path = "/")
	public ResponseEntity<Note> createNote(@RequestBody Note note) {
		return ResponseEntity.ok(notesService.createNote(note));
	}
	@GetMapping(path="/{noteId}")
	public ResponseEntity<Note> getNoteById(@PathVariable String noteId) {
		return ResponseEntity.ok(notesService.getNoteById(noteId));
	}
	@GetMapping
	public ResponseEntity<Note> getNoteByIdRequestParam(@RequestParam String noteId) {
		return ResponseEntity.ok(notesService.getNoteById(noteId));
	}
	@GetMapping(path="/")
	public ResponseEntity<List<Note>> getAllNotes() {
	    List<Note> listOfNotes = notesService.getAllNotes();
	    return ResponseEntity.ok(listOfNotes);
	}
	@GetMapping(path="/page")
	public ResponseEntity<List<Note>> getAllNotesPage(@RequestParam(defaultValue = "1") int pageNumber, @RequestParam int pageSize) {
		List<Note> listOfNotes = notesService.getAllNotesPage(pageNumber,pageSize);
		return ResponseEntity.ok(listOfNotes);
	}
	@PutMapping(path="/{id}")
	public ResponseEntity<Note> updateNote(@PathVariable String id, @RequestBody Note note) {
		return ResponseEntity.ok(notesService.updateNote(id, note));
	}
	@DeleteMapping(path="/{noteId}")
	@ResponseStatus(value = HttpStatus.OK)
	public void  deleteNote(@PathVariable String noteId){
		notesService.deleteNote(noteId);
//		return notesService.deleteNote(noteId) 
//		ApiResponse  apiResponse = new ApiResponse("Notes Deleted SuccessFully", noteId, true);
	
	}

}
