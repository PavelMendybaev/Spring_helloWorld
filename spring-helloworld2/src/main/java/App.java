import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean_helloworld =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean_helloworld2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat bean_cat = (Cat) applicationContext.getBean("Cat");
        Cat bean_cat2 = (Cat) applicationContext.getBean("Cat");


        System.out.println(bean_helloworld);
        System.out.println(bean_helloworld2);
        System.out.println("Сылки Hello_world равны ? " + Boolean.toString(bean_helloworld == bean_helloworld2));
        System.out.println();
        System.out.println(bean_cat);
        System.out.println(bean_cat2);
        System.out.println("Сылки Cat равны ? " + Boolean.toString(bean_cat == bean_cat2));
    }
}