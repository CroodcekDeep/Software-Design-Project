package Products;

import Products.Snack;

public class Nacho extends Snack {
    public Nacho() {
        this.nombre = "Products.Nacho";
    }

    @Override
    public double getPrecio() {
        return 3.95;
    }
}
