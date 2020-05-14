package com.codeflix.stock.dbservice.model;

import javax.persistence.*;

@Entity
@Table(name = "quotes", catalog = "stockQuotes")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "ID")
    private int id;


    public Quote(){
    }

    public Quote(String username, String quote) {
        this.username = username;
        this.quote = quote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Column(name= "User_Name")
    private String username;

    @Column(name= "Quote")
    private String quote;
}
