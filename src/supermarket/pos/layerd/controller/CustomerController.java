/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.pos.layerd.controller;

import javax.swing.JOptionPane;
import supermarket.pos.layerd.dto.CustomerDto;
import supermarket.pos.layerd.service.ServiceFactory;
import supermarket.pos.layerd.service.custom.CustomerService; 

/**
 *
 * @author thari
 */
public class CustomerController {
    
    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String addCustomer(CustomerDto customerDto) throws Exception {
        return customerService.addCustomer(customerDto);
    }
    
}
