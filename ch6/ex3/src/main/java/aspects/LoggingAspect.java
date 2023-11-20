package aspects;

import models.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import services.CommentService;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        logger.info("Method " + methodName + " with parameters " + Arrays.asList(args) + " will execute");
        Comment comment = new Comment("Some other text", null);
        Object[] newArguments = {comment};


        Object returned = joinPoint.proceed(newArguments);
        logger.info("Method executed and returned: " + returned);
        return "FAILED";
    }
}
