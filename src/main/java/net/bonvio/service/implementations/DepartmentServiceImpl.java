package net.bonvio.service.implementations;

import net.bonvio.service.generic.implementations.GenericServiceImpl;
import net.bonvio.model.Department;
import net.bonvio.service.interfaces.DepartmentService;
import org.springframework.stereotype.Service;


/**
 * Created by igorjan on 18.12.15.
 * Banana
*/

@Service

public class DepartmentServiceImpl extends GenericServiceImpl<Department> implements DepartmentService {}
