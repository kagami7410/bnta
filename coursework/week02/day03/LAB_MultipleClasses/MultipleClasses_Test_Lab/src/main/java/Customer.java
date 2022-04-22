public class Customer {
    private String name;
    private int wallet;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void boughtArtwork(Gallery gallery){
        for(Artwork artworks: gallery.getArtworks()){
            this.wallet -= artworks.getPrice();
        }
    }
}
