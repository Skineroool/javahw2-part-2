import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1100;
        int rubles = 100; // Количество рублей для зачисления одного бонуса
        if (replenishment >= 1000) {
            int bonus = (replenishment / rubles);
            System.out.println(balance + replenishment);
            System.out.println(bonus);
        } else {
            System.out.println(balance + replenishment);
        }

    }
    }