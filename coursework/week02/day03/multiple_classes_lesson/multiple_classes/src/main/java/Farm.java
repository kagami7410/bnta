import java.util.ArrayList;
import java.util.List;

public class Farm {
    private String name;
    private int eggsForSale;
    private List<Chicken> chickens = new ArrayList<>();



    public Farm(String name, List<Chicken> chickens, int eggForSale){
        this.name = name;
        this.eggsForSale = 0;
        this.chickens = chickens;
    }

    public int getEggsForSale(){
        return eggsForSale;
    }

    public void setEggsForSale(int eggsForSale) {
        this.eggsForSale = eggsForSale;
    }

    public String getName(){
        return name;
    }

    public List<Chicken> getChickens(){
        return chickens;
    }

    public void addChicken(Chicken chicken){
        chickens.add(chicken);
    }
}
