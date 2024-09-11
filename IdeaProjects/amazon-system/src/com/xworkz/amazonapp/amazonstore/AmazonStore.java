package com.xworkz.amazonapp.amazonstore;

import com.xworkz.amazonapp.product.Product;

public interface AmazonStore {
    boolean addProduct(Product product);
    boolean getProduct();
    boolean updateProductPrice(double newPrice);
    boolean deleteProduct();

}
