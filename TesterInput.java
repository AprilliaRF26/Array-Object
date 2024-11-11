package Toko;

import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        Product[] p = new Product[5];
        Scanner in = new Scanner(System.in);

        System.out.println("CD/DVD?");
        String pilihan = in.nextLine();

        if (pilihan.equalsIgnoreCase("Product")) {
            
        System.out.println("Name; ");
        String name = in.nextLine();
        System.out.println("Number");
        int number = in.nextInt();
        System.out.println("Quantity: ");
        int quantity = in.nextInt();
        System.out.println("Price: ");
        double price = in.nextDouble();
        in.nextLine();//reset Scanner
        p[0]=new Product(number, name, quantity, price);
        p[0].print();
        
    }else if (pilihan.equalsIgnoreCase("CD")){
        System.out.println("Name; ");
        String name = in.nextLine();
        System.out.println("Number");
        int number = in.nextInt();
        System.out.println("Quantity: ");
        int quantity = in.nextInt();
        System.out.println("Price: ");
        double price = in.nextDouble();
        System.out.println("Artist: ");
        String artist = in.nextLine();
        System.out.println("Label: ");
        String label = in.nextLine();
        System.out.println("Total Song: ");
        int numSong = in.nextInt();
        in.nextLine();
        p[1]=new CD(number, name, quantity, price, artist, numSong, label);
        p[1].print();
            // CD c1 = new CD(number, name, quantity, price, artist, numSong, label);
            // c1.print();

        }else if(pilihan.equalsIgnoreCase("DVD")){
        System.out.println("Name; ");
        String name = in.nextLine();
        System.out.println("Number");
        int number = in.nextInt();
        System.out.println("Quantity: ");
        int quantity = in.nextInt();
        System.out.println("Price: ");
        double price = in.nextDouble();
        System.out.println("Studio: ");
        String studio = in.nextLine();
        System.out.println("Rating: ");
        String rating = in.nextLine();
        System.out.println("Length: ");
        int length = in.nextInt();
        in.nextLine();
        p[2]=new DVD(number, name, quantity, price, length, rating, studio);
        // DVD c2 = new DVD(number, name, quantity, price, length, rating, studio);
        // c2.print();
        }
        in.close();
    }
    
}
