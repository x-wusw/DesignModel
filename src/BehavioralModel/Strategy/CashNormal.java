package BehavioralModel.Strategy;
    //正常收费
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
