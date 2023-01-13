package com.microservices.notes.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservices.notes.entity.Notes;

@Repository
public interface NotesDao extends MongoRepository<Notes,String>{

}
