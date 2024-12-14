package patroncomposite;

//une classe concrète qui hérite de la classe Product
public class Pencil extends Product
{
    private String color;

    public Pencil(double weight, double size, String name, String color) {
        super(weight, size, name);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "color=" + color +
                "} ";
    }
}
