public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int addFundsAcc = 1100;
        int bonus;

        if (addFundsAcc > 1000) {
            bonus = addFundsAcc / 100;
            int totalSum = addFundsAcc + initialAccount;
            System.out.println("Бонусы: " + bonus);
            System.out.println("Итогова сумма на счёту: " + (totalSum + bonus));
        } else {
            //int total_sum = addFundsAcc + initialAccount;
            System.out.println("Итоговая сумма " + (addFundsAcc + initialAccount));
        }
    }
}
