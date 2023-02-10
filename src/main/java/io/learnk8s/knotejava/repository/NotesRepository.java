package io.learnk8s.knotejava.repository;

import io.learnk8s.knotejava.entity.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends MongoRepository<Note, String> {

}