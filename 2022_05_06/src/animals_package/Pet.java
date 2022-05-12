package animals_package;

public class Pet extends Animal{
    private String owner;

    public Pet(String name, int weight, String colour, String owner) {
        super(name, weight, colour);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
