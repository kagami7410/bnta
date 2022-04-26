import com.bnta.NewsFeed;
import interfaces.IObserver;

public class Main {
    public static void main(String[] args) {
     IObserver scrapper = new IObserver() {
         @Override
         public void update(String message) {
             System.out.println("from scrapper "+ message);
         }
     };

     IObserver aggregator = new IObserver() {
         @Override
         public void update(String message) {
             System.out.println("from aggregator "+ message);
         }
     };

     IObserver sportsNews = new IObserver() {
         @Override
         public void update(String message) {
             System.out.println("Sports news : "+ message
             );
         }
     };

        NewsFeed nf = new NewsFeed();
        nf.addObservers(scrapper);
        nf.callObservers("our first bit of news");
        nf.addObservers(sportsNews);

    }
}