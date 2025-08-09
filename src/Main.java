import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 1100;
        int x = 100;
        if (replenishment >= 1000) {
            int bonus = (replenishment / x);
            System.out.println(balance + replenishment);
            System.out.println(bonus);
        }
        if (replenishment < 1000) {
            System.out.println(balance + replenishment);
        }
    }
}