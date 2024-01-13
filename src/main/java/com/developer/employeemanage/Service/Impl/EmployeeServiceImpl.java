package com.developer.employeemanage.Service.Impl;

import com.developer.employeemanage.Service.EmployeeService;
import com.developer.employeemanage.model.EmployeeEntity;
import com.developer.employeemanage.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    //InOrder to link serviceImpl to repository We call repository here
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
         return employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);

    }
}
