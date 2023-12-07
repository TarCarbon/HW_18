package com.example.controller;

import com.example.entity.Note;
import com.example.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
@RequestMapping("/note")
public class NoteController {

    private final NoteService<Note> noteService;

    @GetMapping("/list")
    public String getAllNotes(Model model) {
        model.addAttribute("nt", noteService.listAll());
        return "list";
    }

    @GetMapping("/delete")
    public String getDeleteById() {
        return "delete";
    }

    @PostMapping("/delete")
    public String postDeleteById(@RequestParam(name = "id", required = false) Long id) {
        noteService.deleteById(id);
        return "redirect:/note/list";
    }

    @GetMapping("/edit")
    public String getEditById(@RequestParam(name = "id") long id, Model model) {
        model.addAttribute("notes", noteService.getById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String postEdit(Note note) {
        noteService.update(note);
        return "redirect:/note/list";
    }

    @GetMapping("/add")
    public String getAddNote() {
        return "add";
    }

    @PostMapping("/add")
    public String postAddNote(Note note) {
        noteService.add(note);
        return "redirect:/note/list";
    }
}
