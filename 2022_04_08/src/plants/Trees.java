package plants;

import static plants.Season.SPRING;
import static plants.Season.SUMMER;

public class Trees extends Plants{

    public Trees(String name, double height, int age) {
        super(name, height, age, new Season[]{SPRING, SUMMER});
    }


    @Override
    void grow() {
        setHeight(getHeight()+5) ;
    }
}
