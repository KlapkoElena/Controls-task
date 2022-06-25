public class Payments {

    public static void main(String[] args) {

        // Способ оплаты
        String payment = "card";

        // Цена товара
        double priceProduct = 1520.50;

        // Сумма к оплате
        double priceWithCommission;


        switch (payment.trim()) {
            case "cash" -> // оплата наличными
                    System.out.printf("You pay in cash. Your commission is 0. To pay USD %.2f", priceProduct);

            case "card" -> { // оплата картой
                priceWithCommission = priceProduct + (priceProduct * 2 / 100);
                System.out.printf("You pay by card. Your commission is 2 percent. To pay USD %.2f",
                        priceWithCommission);
            }
            case "invoice" -> { // оплата по счету
                priceWithCommission = priceProduct + (priceProduct * 5 / 100);
                System.out.printf("You pay by invoice. Your commission is 5 percent. To pay USD %.2f",
                        priceWithCommission);
            }
            default ->
                    System.out.println("Choose your payment method: cash, card or invoice");
        }
    }
}
