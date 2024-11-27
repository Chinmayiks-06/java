package com.xworkz.app.dao;

import com.xworkz.app.dto.AeroplaneDto;
import com.xworkz.app.util.SessionFactoryUtil;
import org.hibernate.Session;

public class AeroplaneDaoImpl implements AeroplaneDao{
    @Override
    public boolean addBookDetails(AeroplaneDto aeroplaneDto) {


        Session session= SessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(aeroplaneDto);
        session.getTransaction().commit();
        session.close();
        SessionFactoryUtil.closeSessionFactory();
        return true;
    }

    @Override
    public AeroplaneDto getDetailsById(int id) {
        return null;
    }
}
