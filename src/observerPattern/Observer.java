package observerPattern;

public interface Observer {
    void update(Share share);
    void addShareToSell(String name);
    void addShareToBuy(String name);
    void sell();
    void buy();
}
