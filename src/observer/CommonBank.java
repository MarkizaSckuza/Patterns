package observer;

/**
 * Created by Margo on 15.09.2015.
 */
public class CommonBank implements Observer {

    private float dollarExchangeRate;
    private Subject nationalBank;
    private String name;
    private float percent;

    public CommonBank(Subject nationalBank, String name, float percent) {
        this.nationalBank = nationalBank;
        this.name = name;
        this.percent = percent;
        nationalBank.registerObserver(this);
    }

    @Override
    public void update(float dollarExchangeRate) {
        this.dollarExchangeRate = dollarExchangeRate;
        countAmount();
        showInfo();
    }

    private void countAmount(){
        this.dollarExchangeRate = dollarExchangeRate + (percent * dollarExchangeRate) / 100;
    }

    public void showInfo(){
        System.out.println("I'm a " + name + "! The exchange rate has changed! Now it's " + dollarExchangeRate);
    }
}
