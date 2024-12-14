package patroncomposite;

//un produit générique qui implémente l'interface et que des produits spécifique pourront hériter
public abstract class Product implements IProduct {
    private double weight;
    private double size;
    private String name;

    public Product(double weight, double size, String name) {
        this.weight = weight;
        this.size = size;
        this.name = name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "";
    }
}
