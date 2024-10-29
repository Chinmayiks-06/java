package com.xworkz.app.service;

import com.xworkz.app.dao.EcommerceDao;
import com.xworkz.app.dao.EcommerceDaoImpl;
import com.xworkz.app.dto.ProductDto;

public class EcommerceServiceImpl implements  EcommerceService{
    EcommerceDao ecommerceDao=new EcommerceDaoImpl();
    @Override
    public boolean validateAndSaveProduct(ProductDto dto) {
        boolean productStored=false;
        boolean productNamevalid=false;
        boolean productCategoryValid=false;
        if(dto != null){
            if (dto.getProductName()!= null && !dto.getProductName().isEmpty()){
                System.out.println("Product Name validated!!!");
                productNamevalid = true;
            }
            if (dto.getProductName()!= null && !dto.getProductName().isEmpty()){
                System.out.println("Product Category validated!!!");
                productCategoryValid = true;
            }
        }
        if (productNamevalid == true && productCategoryValid==true)
            productStored = ecommerceDao.addProduct(dto);
        return productStored;
    }
}
