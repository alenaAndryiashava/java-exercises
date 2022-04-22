package plants;

import static plants.Season.SPRING;
import static plants.Season.SUMMER;

public class Trees extends Plants{
    private static int TREE_GROW_SEASON = 5;

    public Trees(String name, int height, int age) {
        super(name, height, age);
    }


    @Override
    public int getGrowPerSeason() {
        return TREE_GROW_SEASON;
    }

    @Override
    public void doSummer() {
        setHeight(getHeight()+getGrowPerSeason());
        System.out.println(getName()+ " has grown in Summer "+ getHeight());
    }

    @Override
    public void doAutumn() {
        System.out.println(getName() + " is not growing in Autumn " + getHeight());
    }
}
