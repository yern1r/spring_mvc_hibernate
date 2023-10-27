package com.yernaryelemess.spring.mvc_hibernate_aop.dao;

import com.yernaryelemess.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import org.hibernate.query.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;



    @Override
    public List<Employee> getAllEmployees() {

        Session session = sessionFactory.getCurrentSession();

    //        List<Employee> allEmployee = session.createNamedQuery("from Employee",
    //                        Employee.class).getResultList();

        Query<Employee> query = session.createQuery("from Employee"
                , Employee.class);

        List<Employee> allEmployees = query.getResultList();


        return allEmployees;
    }
}
