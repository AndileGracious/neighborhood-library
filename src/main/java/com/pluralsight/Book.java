package com.pluralsight;

public class Book {
   private int id;
   private String isbn;
   private String title;
   private boolean isCheckedout;
   private String checkedOutTo;

   public Book(int id, String isbn, String title){
       this.id = id;
       this.isbn = isbn;
       this.title = title;
       this.isCheckedout = false;
       this.checkedOutTo = "";
   }
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedout() {
        return isCheckedout;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCheckedout(boolean checkedout) {
        isCheckedout = checkedout;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
    public void checkOut(String name){
       this.checkedOutTo = name;
       this.isCheckedout = true;

    }
    public void checkIn(){
       this.checkedOutTo = "";
       this.isCheckedout = false;


    }
}



