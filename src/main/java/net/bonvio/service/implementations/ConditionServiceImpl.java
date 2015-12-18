package net.bonvio.service.implementations;

import net.bonvio.service.generic.implementations.GenericServiceImpl;
import net.bonvio.model.Condition;
import net.bonvio.service.interfaces.ConditionService;
import org.springframework.stereotype.Service;


/**
 * Created by igorjan on 18.12.15.
 * Banana
*/

@Service

public class ConditionServiceImpl extends GenericServiceImpl<Condition> implements ConditionService {}
