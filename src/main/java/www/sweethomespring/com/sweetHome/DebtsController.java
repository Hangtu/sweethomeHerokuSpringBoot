package www.sweethomespring.com.sweetHome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DebtsController {

	@RequestMapping(value = "/test", method = RequestMethod.GET, produces="text/plain")
    @ResponseBody
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello World";
    }
}