package com.example.jarek.notebook;

/**
 * Created by jarek on 28.09.2016.
 */

public class Note {
    private String title, message;
    private long noteId, dateCreatedMili;
    private Category category;

    public enum Category {PERSONAL, TECHNICAL, QUOTE, FINANCE};

    public Note(String title, String message, Category category){
        this.title = title;
        this.message = message;
        this.category = category;
        this.noteId = 0;
        this.dateCreatedMili = 0;
    }

    public Note(String title, String message, Category category, long noteId, long dateCreatedMili){
        this.title = title;
        this.message = message;
        this.category = category;
        this.noteId = noteId;
        this.dateCreatedMili = dateCreatedMili;
    }

    public String getTitle() {return title;}

    public String getMessage() {return message;}

    public Category getCategory() {return category;}

    public long getNoteId() {return noteId;}

    public long getDateCreatedMili() {return dateCreatedMili;}

    public String toString() {
        return "ID" + noteId + " Title" + title + " Message" + message + " IconID" + category.name()
                + " Date: ";
    }

    public int getAssociatedDrawable() {
        return categoryToDrawable(category);
    }

    public static int categoryToDrawable(Category noteCategory) {
        switch(noteCategory) {
            case PERSONAL:
                return R.drawable.pp;
            case TECHNICAL:
                return R.drawable.tt;
            case FINANCE:
                return R.drawable.ff;
            case QUOTE:
                return R.drawable.qq;
        }

        return R.drawable.pp;
    }
}
