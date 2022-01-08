package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.entity.Entry;
import net.javaguides.springbootbackend.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EntryController {


    @Autowired
    private EntryRepository entryRepository;

    @GetMapping("/entries")
    public List<Entry> fetchEntries() {
        return entryRepository.findAll();
    }

    @DeleteMapping("/entries/{entryId}")
    public void deleteEntry(@PathVariable("entryId") long entryId){
        this.entryRepository.deleteById(entryId);
    }



}
