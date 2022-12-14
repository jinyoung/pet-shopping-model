
package shopping.model.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="order", url="http://order:8080")
public interface OrderService {

    @RequestMapping(method= RequestMethod., path="/orders")
    public void supporting(@RequestBody Order order);

}