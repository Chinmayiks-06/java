package com.xworkz.app.dao;

import com.xworkz.app.dto.ProductDto;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class EcommerceDaoImpl implements  EcommerceDao{
    @Override
    public boolean addProduct(ProductDto dto) {
        Configuration configuration=new Configuration();
        SessionFactory factory=configuration.buildSessionFactory();
        factory.openSession();

        return true;
    }
}
