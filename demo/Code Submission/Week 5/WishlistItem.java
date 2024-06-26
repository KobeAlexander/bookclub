package com.bookclub.model;

//import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

public class WishlistItem {

    @NotNull
    //@NotEmpty(message = "ISBN is a required field.")
    private String isbn;

    @Id
    private String id;

    @NotNull
   // @NotEmpty(message = "Title is a required field.")
    private String title;

    public WishlistItem() {}

    public WishlistItem(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getId() {
        return id;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("WishlistItem{isbn=%s, title=%s}", isbn, title);
    }
}
