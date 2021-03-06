import java.util.ArrayList;
import java.util.List;

public class Artwork {
    private String title;
    private String artist;
    private int price;
    private int nft;

    private ArrayList<Artwork> allArtworks;



    public Artwork(String title, String artist, int price, int nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
        this.allArtworks = new ArrayList<Artwork>();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getPrice() {
        return price;
    }

    public int getNft() {
        return nft;
    }



    public ArrayList<Artwork> getAllArtworks(){
        return allArtworks;
    }
}