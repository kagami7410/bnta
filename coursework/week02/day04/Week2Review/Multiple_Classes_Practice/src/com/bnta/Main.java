package com.bnta;

import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public List<Artwork> allArtworks;

    public static void main(String[] args) {


        Gallery gallery1 = new Gallery("London Gallery", 35000);
        Artwork artwork1 = new Artwork("Picasso", "Da Vinci", 1800, 263223);
        Artwork artwork2 = new Artwork("Loreli", "Goldsworth", 230, 4387573);
        Artwork artwork3 = new Artwork("Amphani", "Andy", 1200, 40897573);
        Artwork artwork4 = new Artwork("The Great Art", "Da Vinci", 2000, 3435424 );

        Artist Da_Vinci = new Artist("Da Vinci");
        Customer customer_sujan = new Customer(2000);

        System.out.println("Till: £"+ gallery1.getTill());


        gallery1.addArtworkToGallery(artwork1);
        gallery1.addArtworkToGallery(artwork2);
        gallery1.addArtworkToGallery(artwork3);
        gallery1.addArtworkToGallery(artwork4);
//
//        System.out.println(gallery1.getAllArtworks());
//        System.out.println(customer_sujan.getWallet());
//
//        customer_sujan.buyArtwork(gallery1, artwork1);
//        customer_sujan.buyArtwork(gallery1, artwork2);
//
//        System.out.println(customer_sujan.getWallet());
//        System.out.println("Bought Artworks = "+ customer_sujan.getAllArtworks());
//        System.out.println(gallery1.getAllArtworks());
//        System.out.println("Till: £"+ gallery1.getTill());

        System.out.println("Da Vinci's Artworks: " + Da_Vinci.getHisArtworks(gallery1));
        System.out.println("Gallery's value is: "+ gallery1.gallerysValue(gallery1));






    }

}