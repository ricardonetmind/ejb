package com.netmind.ejbs;

import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.netmind.beans.Greeter;

/**
 * Session Bean implementation class CallerImpl
 */
@Stateless
public class CallerImpl implements LocalAccessToCaller {
	final static Logger logger = Logger.getLogger("CallerImpl");
	
	@EJB(mappedName = "ejb:/GreeterEJB//GreeterBean!com.netmind.beans.Greeter")
	private Greeter greeter;

	@Override
	public void triggerRemoteCall() {
		logger.info("triggering remote call..............");
		String result = greeter.greet("Juana");
        logger.info("result: " + result);
	}
	
    

}
