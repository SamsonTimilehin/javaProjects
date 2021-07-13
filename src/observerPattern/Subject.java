package observerPattern;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(Share price);

    void changeSharePrice(int newPrice);
}
