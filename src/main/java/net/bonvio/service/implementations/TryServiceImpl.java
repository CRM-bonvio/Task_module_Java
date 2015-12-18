package net.bonvio.service.implementations;

import net.bonvio.service.generic.implementations.GenericServiceImpl;
import net.bonvio.model.Try;
import net.bonvio.service.interfaces.TryService;
import org.springframework.stereotype.Service;


/**
 * Created by igorjan on 18.12.15.
 * Banana
*/

@Service

public class TryServiceImpl extends GenericServiceImpl<Try> implements TryService {}
