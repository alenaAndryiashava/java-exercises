package Employee_package;
//4.есть класс Employee c полями id, name, age, salary.  Сделать его comparable по id.
//  Создать дополнительные возможности сортировки по: зарплате, возрасту, имени, а также возможность
//  сортировки по имени если возраст одинаковый.
//В решении использовать ArrayList. Написать тесты
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(getId(), other.getId());
    }
}
