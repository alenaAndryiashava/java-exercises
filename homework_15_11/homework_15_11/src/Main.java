public class Main {
    public static void main(String[] args) {

        System.out.println("-------Task 1---------");
        Person ivan = new Person();
        Person anna = new Person("Anna Ivanova",22);
        Person ben = new Person("Ben Staff", 28);
        anna.talk();
        ivan.move();
        ben.talk();

        System.out.println("-------Task 2---------");

        Phone iphone14_ProMax = new Phone(123,"iPhone_14_Pro_Max", 240);
        Phone iphone14_Pro = new Phone(456,"iPhone_14_Pro", 204);
        Phone iphone14_Plus = new Phone(789,"iPhone_14_Plus", 228);
        System.out.println(iphone14_ProMax);
        System.out.println(iphone14_Pro);
        System.out.println(iphone14_Plus);

        iphone14_Plus.receiveCall(anna);
        System.out.println(iphone14_Plus.getNumber());
        iphone14_Pro.receiveCall(ivan);
        System.out.println(iphone14_Pro.getNumber());
        iphone14_ProMax.receiveCall(ben);
        System.out.println(iphone14_ProMax.getNumber());
    }
}