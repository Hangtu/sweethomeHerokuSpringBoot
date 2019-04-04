package www.sweethomespring.com.sweetHome.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/getTopics")
	public List <Topic> getTopics (){
		return topicService.getTopics();
	}
	
	@RequestMapping("getTopic/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value="/addTopic", method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(value="/topic/{id}", method = RequestMethod.PUT)
	public void addTopic(@PathVariable int id, @RequestBody Topic topic) {
		topicService.updateTopic(id, topic);
	}
	
}
