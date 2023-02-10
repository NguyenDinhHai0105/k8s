package io.learnk8s.knotejava.controller;

import io.learnk8s.knotejava.entity.Note;
import io.learnk8s.knotejava.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("")
class KNoteController {

    @Autowired
    private NotesRepository notesRepository;

    @GetMapping("/note")
    private List<Note> getAllNotes() {
        List<Note> notes = notesRepository.findAll();
        return notes;
    }

    @PostMapping("/note")
    private void saveNote(Note note) {
        notesRepository.save(note);
    }
}