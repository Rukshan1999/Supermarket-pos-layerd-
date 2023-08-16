/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarket.pos.layerd.dao.custom;

import supermarket.pos.layerd.dao.SuperDao;
import supermarket.pos.layerd.entity.CustomerEntity;

/**
 *
 * @author thari
 */
public interface CustomerDao extends SuperDao{
    Boolean addCustomer(CustomerEntity customerEntity)throws Exception;
}
