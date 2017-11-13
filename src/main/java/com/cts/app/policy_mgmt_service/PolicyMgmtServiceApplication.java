package com.cts.app.policy_mgmt_service;

import com.cts.app.policy_mgmt_service.service.PolicyMgmtService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.cts.app.policy_mgmt_service.repository", "com.cts.app.policy_mgmt_service.resource"
                                        ,"com.cts.app.policy_mgmt_service.service"})
@SpringBootApplication
public class PolicyMgmtServiceApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =  SpringApplication.run(PolicyMgmtServiceApplication.class, args);

		PolicyMgmtService policyMgmtService = context.getBean("policyMgmtService",PolicyMgmtService.class);
	}
}
