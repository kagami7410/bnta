package com.bnta;

import java.util.ArrayList;
import java.util.List;

public class Gallery {
    private String name;
    private int till;
    public List<Artwork> allArtworks;

    public Gallery(String name, int till){
        this.name = name;
        this.till = till;
        this.allArtworks = new ArrayList<Artwork>();
    }

    public String getName(){
        return name;
    }

    public int getTill(){
        return till;
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "name='" + name + '\'' +
                ", till=" + till +
                ", allArtworks=" + allArtworks +
                '}';
    }

    public List<Artwork> getAllArtworks(){
        return allArtworks;

    }

    public void setAllArtworks(List<Artwork> allArtworks) {
        this.allArtworks = allArtworks;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public void addArtworkToGallery(Artwork artwork){
        allArtworks.add(artwork);
    }

    public void removeArtwork(Artwork artwork){
        for(int i = 0; i < allArtworks.size(); i++) {
            if (allArtworks.get(i).equals(artwork)) {
                allArtworks.remove(artwork);
            }
        }

    }

    public boolean checkArtworksNft(Gallery gallery, int new_nft){
        for(int i = 0; i < gallery.getAllArtworks().size(); i++) {
            if (gallery.getAllArtworks().get(i).getNft() == new_nft) {
                return true;
            }
        }
        return false;
    }

    public int gallerysValue(Gallery gallery){
        int totalVal = 0;

        for(int i = 0; i < gallery.getAllArtworks().size(); i++){
            totalVal += gallery.getAllArtworks().get(i).getPrice();
        }
        return totalVal;
    }
}
