package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        Book[] inventory = new Book[20];
        inventory[0] = new Book(1,"001","How to make perfect smoothies");
        inventory[1] = new Book(2,"002","College Algebra");
        inventory[2] = new Book(3,"003","Daily Affirmations");
        inventory[3] = new Book(4,"004","Harry Potter");
        inventory[4] = new Book(5,"005","Matilda");
        inventory[5] = new Book(6,"006","Java for beginners");
        inventory[6] = new Book(7,"007","Charlie and the chocolate factory");
        inventory[7] = new Book(8,"008","Jack and the beanstalk");
        inventory[8] = new Book(9,"009","Eating Healthy");
        inventory[9] = new Book(10,"010","Diane becomes a big sister");
        inventory[10] = new Book(11,"011","How to grow flowers");
        inventory[11] = new Book(12,"012","Barbie and the 3 musketeers");
        inventory[12] = new Book(13,"013","Learn how to code");
        inventory[13] = new Book(14,"014","Introduction to SQL");
        inventory[14] = new Book(15,"015","Python for beginners");
        inventory[15] = new Book(16,"016","Food and Nutrition");
        inventory[16] = new Book(17,"017","Anatomy");
        inventory[17] = new Book(18,"018","Introduction to Chemistry");
        inventory[18] = new Book(19,"019","Heart Health");
        inventory[19] = new Book(20,"020","America History");

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = myScanner.nextLine();
        System.out.println("Choose from the following options: ");
        System.out.println("1. Show available books");
        System.out.println("2.Show checked out books");
        System.out.println("3. Exit");
        String choice = myScanner.nextLine();
        if (choice.equals("1") || choice.equals("2")){
            availableBooks(inventory);

        }
        else if (choice.equals("3")){
            System.out.println("Not available, You are now exiting.");
        }






        String title;
        String availableBooks;



    }
    public static void availableBooks(Book[] inventory){
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].isCheckedout () == false){
                System.out.println(inventory[i].getTitle());



            }


        }


    }
}




