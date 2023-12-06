package com.example.service;

import com.example.entity.Note;

import java.util.List;

public interface NoteService<T> {
    public List<T> listAll();
    public void add(T t);
    public void deleteById(Long id);
    public void update (T t);
    public T getById(Long id);
}
