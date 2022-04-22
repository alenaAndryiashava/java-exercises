package plants;
/**
 * Садовод-любитель
 * Выращиваем растения в течение нескольких лет и смотрим что будет
 * Задача: выращиваем деревья и цветы. Каждый из этих видов имеет следующие характеристики
 * -name, height, age.  Каждый из видов растений вырастает за сезон на разную высоту, одинаковую для всех деревьев
 * и всех цветов
 *
 * Каждый сезон состоит из четырех времен года, в которые цветы и деревья ведут
 * себя не всегда одинаково.
 * Сезон для цветов и деревьев начинается весной
 * Цветы: зимой не растут, летом тоже не растут, а цветут, осенью их срезают
 * Деревья: зимой не растут, летом растут, осенью не растут, весной растут
 * В классе Garden создать по одному цветку и дереву и создать метод growPlants,
 * в котором происходи процесс роста этих двух растений в течение нескольких лет.
 * */
public class Garden {
    public static void main(String[] args) {
        Plants flower = new Flowers("Rose", 0, 1);
        Plants tree = new Trees("Pine", 100, 1);
        Plants[] plants = {flower,tree};
        int yearsToGrow = 2;

        System.out.println("Growing plants for "+yearsToGrow+ " years");
        growPlantsForNumberOfYears(plants,yearsToGrow);
        System.out.println("Tree has height: "+tree.getHeight()+" and is "+tree.getAge()+ " years old");
        System.out.println("Flower has height: "+flower.getHeight()+" and is "+flower.getAge()+ " years old");

    }

     public static void growPlantsForNumberOfYears(Plants[] plants, int numbersOfYears){
         for (int i = 0; i < numbersOfYears; i++) {
             for (Plants plant: plants) {
                 plant.doSpring();
                 plant.doSummer();
                 plant.doAutumn();
                 plant.doWinter();

             }


         }

    }
}



