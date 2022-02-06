package net.javaguides.springbootbackend.controller;

import net.javaguides.springbootbackend.entity.Entry;
import net.javaguides.springbootbackend.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        return this.entryRepository.findAll();
    }

    @DeleteMapping("/entries/{entryId}")
    public void deleteEntry(@PathVariable("entryId") long entryId) {
        this.entryRepository.deleteById(entryId);
    }

    @PatchMapping ("/entries/{entryId}")
    public void patchEntry(@PathVariable("entryId") long entryId, @RequestBody Entry patchedEntry) {

       this.entryRepository.findById(entryId)
               .map(entry -> {
                   entry.setHeadline(patchedEntry.getHeadline());
                   entry.setEntry(patchedEntry.getEntry());
                   return this.entryRepository.save(entry);
               });
    }

    @PostMapping("/entries")
    public void postEntry(@RequestBody Entry newEntry) {
        this.entryRepository.save(new Entry(
                newEntry.getHeadline(),
                newEntry.getEntry()
        ));
    }
}
