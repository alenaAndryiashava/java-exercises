package plants;

import java.util.Arrays;

public abstract class  Plants {
    private String name;
    private int height;
    private int age;


    public Plants(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Plants: " +
                "name: " + name + '\'' +
                ", height = " + height +
                ", age = " + age;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addYearToAge(){
        this.age++;
    }

    public abstract int getGrowPerSeason();

    public void doSpring(){
        addYearToAge();
        setHeight(getHeight()+getGrowPerSeason());
        System.out.println(getName() + " has grow in Spring, " + getHeight());
    }

    public abstract void doSummer();

    public abstract void doAutumn();

    public void doWinter(){
        System.out.println(getName() + " is not growing in Winter, " + getHeight());
    }
}
