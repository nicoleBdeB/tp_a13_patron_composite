package patroncomposite;

//une classe concrète qui hérite de la classe Product
public class Scissor extends Product {
    private String type;

    public Scissor(double weight, double size, String name, String type) {
        super(weight, size, name);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Scissor{" +
                "type=" + type +
                "} ";
    }
}
