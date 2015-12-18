package net.bonvio.service.implementations;

import net.bonvio.service.generic.implementations.GenericServiceImpl;
import net.bonvio.model.Position;
import net.bonvio.service.interfaces.PositionService;
import org.springframework.stereotype.Service;


/**
 * Created by igorjan on 18.12.15.
 * Banana
*/

@Service

public class PositionServiceImpl extends GenericServiceImpl<Position> implements PositionService {}
