package com.microservices.notes.service;

import java.util.List;
import java.util.Optional;

import com.microservices.notes.entity.Notes;

public interface NoteService {
	
	public List<Notes> getAllNotes();
	public Notes addNotes(Notes notes);
	public Optional<Notes> findNotesByPid(String pid);

}
