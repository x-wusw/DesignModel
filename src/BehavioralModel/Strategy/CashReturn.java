package BehavioralModel.Strategy;

/**
 * 返利活动，输入返利条件和返利值，比如满300返100，moneyCoditation为300，moneyReturn为100。
 */
public class CashReturn extends CashSuper {
    private double moneyCondition = 0.0;//返利条件
    private double moneyReturn = 0.0;   //返回值
    public CashReturn(double moneyCondition,double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
    @Override
    public double acceptCash(double money) {
        double result = 0;
        if(money > moneyCondition){
            return money - Math.floor(money/moneyCondition)*moneyReturn;
        }
        return result;
    }
}
