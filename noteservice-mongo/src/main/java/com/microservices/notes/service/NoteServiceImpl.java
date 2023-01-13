package com.microservices.notes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.notes.dao.NotesDao;
import com.microservices.notes.entity.Notes;


@Service
public class NoteServiceImpl implements NoteService {
	
	@Autowired
	NotesDao dao;

	@Override
	public List<Notes> getAllNotes() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Notes addNotes(Notes notes) {
		// TODO Auto-generated method stub
		return dao.save(notes);
	}

	@Override
	public Optional<Notes> findNotesByPid(String pid) {
		// TODO Auto-generated method stub
		return dao.findById(pid);
	}

}
