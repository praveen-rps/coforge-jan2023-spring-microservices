package com.microservices.notes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.notes.entity.Notes;
import com.microservices.notes.service.NoteService;
@RestController
@RequestMapping("/notes")
public class NotesController {

	@Autowired
	NoteService service;
	
	@GetMapping("/test")
	public String test(){
		return "hello";
	}
	
	
	@GetMapping("/display")
	public ResponseEntity<List<Notes>> returnAllNotes(){
		return new ResponseEntity(service.getAllNotes(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Notes> addNotes(@RequestBody Notes notes){
		return new ResponseEntity(service.addNotes(notes), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/find/{pid}")
	public ResponseEntity<Optional<Notes>> searchNotes(@PathVariable("pid") String pid){
		return new ResponseEntity(service.findNotesByPid(pid), HttpStatus.OK);
	}
	
}
