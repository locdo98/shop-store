package com.dovanloc.springboot.config;

import com.dovanloc.springboot.Crud.RoleInterface;
import com.dovanloc.springboot.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Appinit implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    public RoleInterface roleInterface;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Role adminRole=new Role();
        adminRole.setId(1);
        adminRole.setName("ROLE_ADMIN");

        Role customerRole=new Role();
        customerRole.setId(2);
        customerRole.setName("ROLE_USER");

        try{
            roleInterface.save(adminRole);
            roleInterface.save(customerRole);
        }catch (Exception ex){
            System.out.println("role da ton tai: "+ex.getMessage());
        }
    }
}
