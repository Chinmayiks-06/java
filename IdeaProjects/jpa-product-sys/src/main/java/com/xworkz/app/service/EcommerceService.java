package com.xworkz.app.service;

import com.xworkz.app.dto.ProductDto;

public interface EcommerceService {

    boolean validateAndSaveProduct(ProductDto dto);
}
