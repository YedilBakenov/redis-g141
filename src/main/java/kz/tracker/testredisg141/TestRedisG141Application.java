package kz.tracker.testredisg141;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
public class TestRedisG141Application {

    public static void main(String[] args) {
        SpringApplication.run(TestRedisG141Application.class, args);
    }

}
