package plants;

import static plants.Season.SPRING;

public class Flowers extends Plants{

    public Flowers(String name, double height, int age) {
        super(name, height, age, new Season[]{SPRING});
    }

    @Override
    void grow() {
        setHeight(getHeight()+2);
    }


}
