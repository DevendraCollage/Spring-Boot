package net.engineeringdigest.journalApp.controller;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/journal") // * This is endpoint also but this will allow at the whole class
public class JournalEntryController {
    // ? We will write the endpoint here

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping() // localhost:8080/health-check (Get method will redirect to this method)
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping() // localhost:8080/health-check (Post method will redirect ot this method)
    public boolean createEntry(@RequestBody JournalEntry myEntry) { // Request body says hey spring please take the data
                                                                    // from the request and turn it into a java
                                                                    // object
                                                                    // that
                                                                    // i can use in my code.
        journalEntries.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId) {
        return journalEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId) {
        return journalEntries.remove(myId);
    }

    @PutMapping("id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long id, @RequestBody JournalEntry myEntry) {
        return journalEntries.put(id, myEntry);
    }

}
