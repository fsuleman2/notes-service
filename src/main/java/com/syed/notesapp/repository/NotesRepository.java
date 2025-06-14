package com.syed.notesapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syed.notesapp.model.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, String>{

}
