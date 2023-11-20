import config.ProjectConfig;
import models.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var s = context.getBean(CommentService.class);
        Comment comment = new Comment("hello", "pedro");
        String value = s.publishComment(comment);
        System.out.println(value);
    }
}
