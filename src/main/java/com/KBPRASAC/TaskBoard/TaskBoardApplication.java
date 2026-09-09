package com.KBPRASAC.TaskBoard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
		"com.KBPRASAC.TaskBoard",
		"com.corebackend"
})
@EntityScan(basePackages = {
		"com.KBPRASAC.TaskBoard",
		"com.corebackend.entity"
})
@EnableJpaRepositories(basePackages = {
		"com.KBPRASAC.TaskBoard",
		"com.corebackend.repository"
})
public class TaskBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskBoardApplication.class, args);
	}
}