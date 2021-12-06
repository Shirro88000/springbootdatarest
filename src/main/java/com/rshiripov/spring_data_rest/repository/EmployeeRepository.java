package com.rshiripov.spring_data_rest.repository;



import com.rshiripov.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// @Repository  - можно прописать, но не обязательно
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { // тип Entity, primary key
    // как формируется url: Employee -> employees (Первая буква строчка, + s на конце)


    //public List<Employee> findAllByName(String name);

    // test changes

}
