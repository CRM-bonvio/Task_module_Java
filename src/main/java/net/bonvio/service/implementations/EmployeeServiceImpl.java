package net.bonvio.service.implementations;

import net.bonvio.model.Employee;
import net.bonvio.service.generic.GenericServiceImpl;
import net.bonvio.service.interfaces.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * Created by mil on 23.11.2015.
 * Banana
 */

@Service
public class EmployeeServiceImpl extends GenericServiceImpl<Employee> implements EmployeeService {}
