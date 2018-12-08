package cloud.dalston.eureka.feignconsumer.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="provider1")
public interface CalculateClient {
	@RequestMapping(value = "/discovery/calculate",method=RequestMethod.GET)
    String calculate(@RequestParam("a") int a,@RequestParam("b") int b);
}
