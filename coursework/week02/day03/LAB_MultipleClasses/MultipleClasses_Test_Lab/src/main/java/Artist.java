import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private List<Artwork> hisArtworks;

    private List<Artwork> allArtworks;


    public Artist(String name, List<Artwork> hisArtworks) {
        this.name = name;
        this.allArtworks = new ArrayList<Artwork>();
        this.hisArtworks = hisArtworks;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Artwork getArtistArtwork() {
//        for (int i = 0; i < allArtworks.size(); i++) {
//            if (allArtworks.get(i).getArtist() == name) {
//                hisArtworks.add(allArtworks.get(i));
//                return allArtworks.get(i);
//            }
//
//        }
//        return null;
//  }

    public List<Artwork> getHisArtworks(){
        return hisArtworks;
    }

    public void setArtworks(List<Artwork> allArtworks) {
        this.allArtworks = allArtworks;
    }

    public void addArtwork(Artwork artwork){
        allArtworks.add(artwork);

    }
}
