package Modul15.Grocery.Products;

import Modul15.Grocery.Products.Interfaces.Expireable;
import java.util.UUID;

/**
 *
 * @author Aleksander Henriksen
 */
public abstract class Product implements Expireable {

    private final UUID serial;
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.serial = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public UUID getSerial() {
        return serial;
    }

    @Override
    public boolean isExpired() {
        throw new UnsupportedOperationException("Product does not support this operation.");
    }
}
