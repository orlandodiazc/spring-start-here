package aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import services.CommentService;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    @AfterReturning(value = "@annotation(ToLog)", returning = "returnedValue")
    public void log(Object returnedValue) {
        logger.info("Method executed and returned::" + returnedValue);
    }
}
