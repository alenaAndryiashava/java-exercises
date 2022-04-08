package plants;

import java.util.Arrays;

public abstract class  Plants {
    private String name;
    private double height;
    private int age;
    private Season[] growSeasons;

    public Plants(String name, double height, int age, Season[] growSeasons) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.growSeasons = growSeasons;
    }

    @Override
    public String toString() {
        return "Plants: " +
                "name: " + name + '\'' +
                ", height = " + height +
                ", age = " + age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isGrowSeason(Season season) {
        for (int i = 0; i <growSeasons.length-1; i++) {
            if(growSeasons[i]==(season)){
                return true;
            }
        }
        return false;
    }

    abstract void grow();
}
