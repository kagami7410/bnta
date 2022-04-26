package interfaces;

public interface ISubject {
    void callObservers(String message);
    void addObservers(IObserver observer);

}
