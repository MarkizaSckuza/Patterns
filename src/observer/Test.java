package observer;

/**
 * Created by Margo on 15.09.2015.
 */
public class Test {

    public static void main(String[] args) {

        NationalBank nationalBank = new NationalBank();

        Observer commonBank1 = new CommonBank(nationalBank, "Super Bank", 11);
        Observer commonBank2 = new CommonBank(nationalBank, "Not super Bank", 30);

        nationalBank.setDollarExchangeRate(5.3f);
        nationalBank.setDollarExchangeRate(11.7f);
    }
}
