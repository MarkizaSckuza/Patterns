package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Margo on 15.09.2015.
 */
public class NationalBank implements Subject {

    private float dollarExchangeRate;
    private List<Observer> observers;

    public NationalBank() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(dollarExchangeRate);
        }
    }

    public void setDollarExchangeRate(float dollarExchangeRate) {
        this.dollarExchangeRate = dollarExchangeRate;
        notifyObservers();
    }
}
