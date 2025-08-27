package MJ.missingAnimalInfo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DotEnvConfig {

  @Bean
  public DotEnv dotenv() {
    return Dotenv.configure().directory("./")
        .ignoreIfMissing()
        .load();
  }
}
