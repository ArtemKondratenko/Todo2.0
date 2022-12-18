public class Main {
    public static void main(String[] args) {
        int initial_account = 100;
        int add_funds_acc = 1100;
        int bonus;

        if (add_funds_acc > 1000) {
            bonus = add_funds_acc / 100;
            int total_sum = add_funds_acc + initial_account;
            System.out.println("Бонусы: " + bonus);
            System.out.println("Итогова сумма на счёту: " + (total_sum + bonus));
        } else {
            //int total_sum = add_funds_acc + initial_account;
            System.out.println("Итоговая сумма " + (add_funds_acc + initial_account));
        }
    }
}
