package com.bnta;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int wallet;
    private Gallery gallery;
    public List<Artwork> allArtworks;
    private List<Artwork> boughtArtworks;
    private String name;
    private int till;


    public Customer(int wallet){
        this.wallet = wallet;
        this.boughtArtworks = new ArrayList<Artwork>();

    }

    public int getWallet(){
        return wallet;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "wallet=" + wallet +
                ", boughtArtworks=" + boughtArtworks +
                '}';
    }

  public void buyArtwork(Gallery gallery, Artwork artwork) {
        int tillVal;
        for(int i = 0; i < gallery.getAllArtworks().size(); i++){
          if (artwork.equals(gallery.allArtworks.get(i)) ) {
              wallet -= artwork.getPrice();
              gallery.removeArtwork(artwork);
              boughtArtworks.add(artwork);
              tillVal = gallery.getTill() + artwork.getPrice();
              gallery.setTill(tillVal);
          }

      }
 }

    public List<Artwork> getAllArtworks(){
        return boughtArtworks;
    }


}


