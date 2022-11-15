/*2. Класс Phone.
        Создайте класс Phone, который содержит переменные number, model и weight.
        Создайте три экземпляра этого класса.
        Выведите на консоль значения их переменных.
        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
        Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
        Вызвать эти методы для каждого из объектов.
 */
public class Phone {
    private final int number;
    private final String model;
    private final int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }
    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }
    void receiveCall(Person person){
        System.out.println("Звонит " + person.getFullName());
    }

    @Override
    public String toString() {
        return (getModel() +
                ": number = " + number +
                ", model = " + model +
                ", weight = " + weight);
    }
}
