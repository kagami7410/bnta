public class Farmer {
    private String name;
    private int collectedEggs;

    public Farmer(String name){
        this.name = name;
        this.collectedEggs = collectedEggs;
    }

    public String getName(){
        return name;
    }
    public int getCollectedEggs(){
        return collectedEggs;
    }

    public void collectEggs(Farm farm){
        int totalEggs = 0;
        for (Chicken chicken: farm.getChickens()){
            totalEggs += chicken.getEggs();
            chicken.setEggs(0);
        }
        collectedEggs = totalEggs;
    }
}
