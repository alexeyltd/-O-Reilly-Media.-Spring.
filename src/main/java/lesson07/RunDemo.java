package lesson07;

import lesson07.entities.Game;
import lesson07.entities.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.NumberFormat;

public class RunDemo {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		final NumberFormat numberFormat = context.getBean(NumberFormat.class);

//		double number = 123123;

//		System.out.println(numberFormat.format(number));

//		Team royals = context.getBean("royals", Team.class);

		Game game1 = context.getBean("game", Game.class);
		System.out.println(game1);

//		context.close();

//		Game game2 = context.getBean("game", Game.class);

//		game2.setAwayTeam(royals);
//		System.out.println(game2);

//		System.out.println(game1);

//		System.out.println("There are " + context.getBeanDefinitionCount() + " beans");
//
//		for (String name : context.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}

	}
}
