package cloud.dalston.eureka.feignconsumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableDiscoveryClient /** 使用服务注册发现 */
@SpringBootApplication
public class FeignConsumerInitApplication {
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
//		SpringApplication.run(ConsumerInitApplication.class, args);
		new SpringApplicationBuilder(FeignConsumerInitApplication.class).web(true).run(args);
	}
}
