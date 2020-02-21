package com.enigma.mandiri.config;

import com.enigma.mandiri.service.BloodService;
import com.enigma.mandiri.service.DonorService;
import com.enigma.mandiri.service.OrderService;
import com.enigma.mandiri.service.ReceptionService;
import com.enigma.mandiri.service.impl.BloodServiceImpl;
import com.enigma.mandiri.service.impl.DonorServiceImpl;
import com.enigma.mandiri.service.impl.OrderServiceImpl;
import com.enigma.mandiri.service.impl.ReceptionServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {

    @Bean
    public BloodService bloodService(){
        return new BloodServiceImpl();
    }

    @Bean
    public DonorService donorService(){
        return new DonorServiceImpl();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl();
    }

    @Bean
    public ReceptionService receptionService(){
        return new ReceptionServiceImpl();
    }
}
