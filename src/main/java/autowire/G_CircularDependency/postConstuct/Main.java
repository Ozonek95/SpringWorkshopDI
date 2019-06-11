package autowire.G_CircularDependency.postConstuct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Instrukcja w package-info.
 *
 * @author Jakub Czajka
 */
@Configuration
@ComponentScan(basePackages = {"autowire.G_CircularDependency.postConstuct"})
class Main {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(
        Main.class);
    ZiarnoA ziarnoA = context.getBean(
        ZiarnoA.class);
    ZiarnoB ziarnoB = context.getBean(
        ZiarnoB.class);
    ziarnoA.hello();
    ziarnoB.hello();

  }
}
