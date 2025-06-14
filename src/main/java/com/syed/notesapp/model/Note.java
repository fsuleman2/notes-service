package com.syed.notesapp.model;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Component
@Entity
public class Note {
	@Id
	private String noteId;
	private String title;
	private String content;
	private Date addedDate;
	private boolean live = false;
	
	public Note() {}
	public String getNoteId() {
		return noteId;
	}

	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	public Note(String noteId, String title, String content, Date addedDate, boolean live) {
		super();
		this.noteId = noteId;
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
		this.live = live;
	}

	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", title=" + title + ", content=" + content + ", addedDate=" + addedDate
				+ ", live=" + live + "]";
	}
	
}
