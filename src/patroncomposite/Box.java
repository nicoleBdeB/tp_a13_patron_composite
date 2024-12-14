package patroncomposite;

import java.util.ArrayList;
import java.util.List;

//Le composite qui contient une liste de produit et/ou de composite
public class Box implements IProduct
{
    List<IProduct> products;

    public Box(){ this.products = new ArrayList<IProduct>(); }

    public void addProduct(IProduct product){ this.products.add(product); }
    public void removeProduct(IProduct product){ this.products.remove(product); }

    @Override
    public double getWeight() {
        double totalWeight = 0;
        for (IProduct item : products)
        {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    @Override
    public double getSize() {
        double totalSize = 0;
        for (IProduct item : products)
        {
            totalSize += item.getSize();
        }
        return totalSize;
    }

    @Override
    public String toString() {
        return "Box:"+products;
    }
}
