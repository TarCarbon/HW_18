package com.example.service.impl;

import com.example.entity.Note;
import com.example.repository.NoteRepository;
import com.example.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NoteServiceImpl implements NoteService<Note> {
    private final NoteRepository noteRepository;


    @Override
    public List<Note> listAll() {
        return null;
    }

    @Override
    public void add(Note note) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(Note note) {

    }

    @Override
    public Note getById(Long id) {
        return null;
    }
}
