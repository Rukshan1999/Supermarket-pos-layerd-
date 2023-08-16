/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.pos.layerd.service.custom.impl;

import supermarket.pos.layerd.dao.DaoFactory;
import supermarket.pos.layerd.dao.custom.CustomerDao;
import supermarket.pos.layerd.dto.CustomerDto;
import supermarket.pos.layerd.entity.CustomerEntity;
import supermarket.pos.layerd.service.custom.CustomerService;

/**
 *
 * @author thari
 */
public class CustomerServiceImpl implements CustomerService{
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    public String addCustomer(CustomerDto dto) throws Exception {
        
        CustomerEntity ce = new CustomerEntity(
                dto.getId(), 
                dto.getTitle(), 
                dto.getName(), 
                dto.getDob(), 
                dto.getSalary(), 
                dto.getAddress(), 
                dto.getCity(), 
                dto.getProvince(), 
                dto.getZip());
        
        if (customerDao.addCustomer(ce)) {
            return "Sucessfully Added";
        }else{
            return "Fail";
        }

    }
    
}
