/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarket.pos.layerd.service.custom;

import supermarket.pos.layerd.dto.CustomerDto;
import supermarket.pos.layerd.service.SuperService;

/**
 *
 * @author thari
 */
public interface CustomerService extends SuperService{
    String addCustomer(CustomerDto customerDto)throws Exception;
}
