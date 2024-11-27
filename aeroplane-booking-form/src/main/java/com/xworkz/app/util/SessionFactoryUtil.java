package com.xworkz.app.util;

import com.xworkz.app.dto.AeroplaneDto;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil{
private  static SessionFactory factory=null;

public static SessionFactory getSessionFactory(){
return factory;
}
static {
    Configuration configuration=new Configuration();
configuration.configure();
configuration.addAnnotatedClass(AeroplaneDto.class);
factory=configuration.buildSessionFactory();
}
    public static void closeSessionFactory() {
        factory.close();

    }
}
