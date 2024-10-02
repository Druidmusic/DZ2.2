public class Main {
    public static void main(String[] args) {
        // Исходные данные
        int initialBalance = 70; // Начальный баланс клиента в рублях
        int topUpAmount = 1001;   // Сумма пополнения баланса клиента в рублях

        // Расчет бонуса
        int bonus = 0;
        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100; // 1 рубль за каждые полные 100 рублей
        }

        // Итоговый баланс
        int finalBalance = initialBalance + topUpAmount + bonus;

        // Вывод результатов
        System.out.println("Начальный баланс Клиента: " + initialBalance + " руб.");
        System.out.println("Сумма пополнения баланса Клиента: " + topUpAmount + " руб.");
        System.out.println("Бонусный баланс Клиента: " + bonus + " руб.");
        System.out.println("Итоговый баланс Клиента: " + finalBalance + " руб.");
    }
}