package Lab1.app;

import Lab1.Draw.Circle;
import Lab1.Draw.Point;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Circle circle=context.getBean("circle", Circle.class);
        circle.draw();
        context.close();
        ClassPathXmlApplicationContext context1 =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Point point=context1.getBean("point", Point.class);
        point.draw();
        context.close();

    }
}
