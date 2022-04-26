package com.bnta;

import java.util.ArrayList;
import java.util.List;

public class Artist {
   private String name;
   private List<Artwork> hisArtworks;

   public Artist(String name){
       this.name = name;
       this.hisArtworks = new ArrayList<Artwork>();
   }

   public List<Artwork> getArtistArtworks(){
       return hisArtworks;
   }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", hisArtworks=" + hisArtworks +
                '}';
    }

    public List<Artwork> getHisArtworks(Gallery gallery){
       for(int i = 0; i < gallery.getAllArtworks().size(); i++){
           if(name.equalsIgnoreCase(gallery.getAllArtworks().get(i).getArtist())){
               hisArtworks.add(gallery.getAllArtworks().get(i));
           }
       }
       return hisArtworks;
    }
}
