package com.xworkz.amazonapp.amazonstore.impl;

import com.xworkz.amazonapp.amazonstore.AmazonStore;
import com.xworkz.amazonapp.product.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AmazonStoreImpl implements AmazonStore {

    private Product product;

    @Override
    public boolean addProduct(Product product) {
        boolean isAdded = false;
        if (product != null) {
            if (product.getProductId() > 0) {
                this.product = product;
                isAdded = true;
            }
        }
        return isAdded;
    }

    @Override
    public boolean getProduct() {
        return true;
    }

    @Override
    public boolean updateProductPrice(double newPrice) {
        if (this.product != null && newPrice > 0) {
            this.product.setProductPrice(newPrice);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteProduct() {
        if (this.product != null) {
            this.product = null;
            return true;
        }
        return false;
    }
}
