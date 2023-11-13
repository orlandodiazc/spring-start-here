package org.ditod;

import org.ditod.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
         var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
         Parrot p = new Parrot();
         p.setName("pedro");

        Supplier<Parrot> parrotSupplier = () -> p;
        context.registerBean("parrot", Parrot.class, parrotSupplier);

        Parrot x = context.getBean(Parrot.class);
        System.out.println(x.getName());
    }
}
