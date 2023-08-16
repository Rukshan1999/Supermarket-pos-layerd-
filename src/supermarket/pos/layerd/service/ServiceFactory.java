/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.pos.layerd.service;

import supermarket.pos.layerd.service.custom.impl.CustomerServiceImpl;

/**
 *
 * @author thari
 */
public class ServiceFactory {
    
    private static ServiceFactory serviceFactory;
    

    private ServiceFactory() {
        
    }
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
            
        }
        return serviceFactory;
        
    }
    
    public SuperService getService(ServiceType type){
        switch (type) {
            case CUSTOMER:                
                return new CustomerServiceImpl();
                
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        CUSTOMER
    }
    
    
    
    
}
