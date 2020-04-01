package BehavioralModel.Strategy;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        CashContext cashContext = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入打折方式（1/2/3）:");
        String type = "";
        int in = sc.nextInt();
        switch (in){
            case 1:
                cashContext = new CashContext(new CashNormal());
                type += "正常收费";
                break;
            case 2:
                cashContext = new CashContext(new CashReturn(300,100));
                type += "满300返100";
                break;
            case 3:
                cashContext = new CashContext(new CashRebate(0.9));
                type +="打9折";
                break;
            default:
                System.out.println("请输出1/2/3");
                break;
        }

        System.out.println("请输入单价：");
        double price = sc.nextDouble();
        System.out.println("请输入数量：");
        double num = sc.nextDouble();
        double totalPrices = cashContext.getResult(price*num);
        System.out.println("单价：" + price + "，数量：" + num + "，类型：" + type + "，合计：" + totalPrices);
    }
}
