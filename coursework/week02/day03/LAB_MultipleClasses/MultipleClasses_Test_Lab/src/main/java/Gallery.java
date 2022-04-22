import java.util.ArrayList;
import java.util.List;

public class Gallery {
    private String name;
    private int till;
    private List<Artwork>  artworks;

    public Gallery(String name, int till) {
        this.name = name;
        this.till = till;
        this.artworks = new ArrayList<Artwork>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public List<Artwork> getArtworks() {
        return artworks;
    }

    public void setArtworks(List<Artwork> artworks) {
        this.artworks = artworks;
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    public void soldArtwork(Gallery gallery){
        for(Artwork artworks: gallery.getArtworks()){
            this.till += artworks.getPrice();
        }
    }
}
