package com.netcracker.book;

public class Book {

    private String name;
    private Author [] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString(){
        StringBuilder authorData = new StringBuilder();
        for(int i=0; i<authors.length; i++){
            authorData.append(authors[i].toString());
            if(authors.length-i>1){
                authorData.append(",");
            }
        }
        return "Book[name=" + name +
                ",authors={" + authorData.toString() +
                "},price=" + price +
                ",qty=" + qty + "]";
    }

    public String getAuthorNames(){
        StringBuilder authorNames = new StringBuilder();
        authorNames.append(authors[0].getName());
        if (authors.length>1){
            for(int i=1; i<authors.length;i++){
                authorNames.append("," + authors[i].getName());
            }
        }
        return authorNames.toString();
    }
}
