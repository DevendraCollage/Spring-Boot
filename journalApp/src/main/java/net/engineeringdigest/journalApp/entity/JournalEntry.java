package net.engineeringdigest.journalApp.entity;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "journal_entries")
@Getter
@Setter
public class JournalEntry { // * This is POJO (Plain old java objects)

    // ! This is Simple Entity Class for the given fields

    @Id
    private ObjectId id;

    private String title;

    private String content;

    private LocalDateTime date;

    // public ObjectId getId() {
    // return id;
    // }

    // public void setId(ObjectId id) {
    // this.id = id;
    // }

    // public String getTitle() {
    // return title;
    // }

    // public void setTitle(String title) {
    // this.title = title;
    // }

    // public String getContent() {
    // return content;
    // }

    // public void setContent(String content) {
    // this.content = content;
    // }

    // public LocalDateTime getDate() {
    // return date;
    // }

    // public void setDate(LocalDateTime date) {
    // this.date = date;
    // }
}
