package lesson09.config;

import lesson09.entities.BaseballGame;
import lesson09.entities.Game;
import lesson09.entities.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.text.NumberFormat;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "lesson09")
@EnableAspectJAutoProxy
public class AppConfig {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private List<Team> teams;

	@Bean
	public NumberFormat numberFormat() {
		return NumberFormat.getCurrencyInstance();
	}

	@Bean
	@Scope("prototype")
	public Game game() {
		BaseballGame baseballGame = new BaseballGame(teams.get(0), teams.get(1));
		baseballGame.setDataSource(dataSource);
		return  baseballGame;
	}

}

