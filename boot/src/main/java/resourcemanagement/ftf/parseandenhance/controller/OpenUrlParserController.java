package resourcemanagement.ftf.parseandenhance.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import resourcemanagement.ftf.parseandenhance.resource.OpenUrlParserResponse;
import resourcemanagement.ftf.parseandenhance.service.OpenUrlParserService;

import java.util.Map;


@Controller
@EnableAutoConfiguration
public class OpenUrlParserController {
    private OpenUrlParserService openUrlParser = new OpenUrlParserService();


/*    @RequestMapping(value = {"/openurl"}, method = RequestMethod.GET)
    @ResponseBody
    public String parse(
            @RequestParam(value="name") String name) {
        return name;
    }
*/
    @RequestMapping(value = {"/openurl"}, method = RequestMethod.GET)
    @ResponseBody
    public OpenUrlParserResponse parse(
            @RequestParam Map<String, String> openUrl) {
        return openUrlParser.parse(openUrl);
    }

}
