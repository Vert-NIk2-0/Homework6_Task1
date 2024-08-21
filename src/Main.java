public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375331234567", "Samsung", 150);
        Phone phone2 = new Phone("+375292345678", "iPhone", 160);
        Phone phone3 = new Phone("+375443456789", "Xiaomi", 170);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println();

        phone1.receiveCall("Никита");
        System.out.println(phone1.getNumber() + '\n');

        phone2.receiveCall("Максим");
        System.out.println(phone2.getNumber() + '\n');

        phone3.receiveCall("Марина");
        System.out.println(phone3.getNumber() + '\n');

        phone1.receiveCall("Никита", "+375331234567");
        phone2.receiveCall("Максим", "+375292345678");
        phone3.receiveCall("Марина", "+375443456789");

        phone1.sendMessage("+375292345678", "+375443456789");

    }
}