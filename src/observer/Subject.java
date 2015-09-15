package observer;

/**
 * Created by Margo on 15.09.2015.
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
