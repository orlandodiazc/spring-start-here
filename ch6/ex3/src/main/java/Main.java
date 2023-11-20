import config.ProjectConfig;
import models.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var s = context.getBean(CommentService.class);
        Comment comment = new Comment("hello", "pedro");
        String value = s.publishComment(comment);
        logger.info(value);
    }
}
