/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package fr.grin.zackstp1customerapp.session;

import fr.grin.zackstp1customerapp.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Zaki
 */
@Stateless
public class CustomerManager {
    @PersistenceContext(unitName = "customerPU")
private EntityManager em;
    public List<Customer> getAllCustomers() {
       Query query = em.createNamedQuery("Customer.findAll");
       return query.getResultList();
    }
    
    public Customer update(Customer customer) {
      return em.merge(customer);  
    }   

public void persist(Customer customer) {
  em.persist(customer);
}
     
        
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
