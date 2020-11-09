/**
 * 
 */
package br.tec.marco.travelapplication.audit;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author marcoyf
 *
 */
@Component
@Aspect
public class LoggingAspect {
	
	static Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	@Before("execution(* br.tec.marco.travelapplication.booking.BookingService.book(..))")
	public void logBookingRequest(JoinPoint joinPoint) {
		logger.info("before booking request with arguments: " + Arrays.toString(joinPoint.getArgs()));
	}

}
