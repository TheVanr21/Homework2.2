public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int balance = 100;
        int payment = 1200;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (payment > 1000) {
            int bonus = payment / 100;
            balance = balance + payment + bonus;
            System.out.println("Количество начисленных бонусных рублей: " + bonus);
        } else {
            balance = balance + payment;
        }
        System.out.println("Баланс пополнен. Ваш баланс: " + balance);
    }
}