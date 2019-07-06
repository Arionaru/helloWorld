package ru.ariona.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        MessageRenderer renderer = ctx.getBean("renderer",MessageRenderer.class);
        renderer.render();
    }
}
