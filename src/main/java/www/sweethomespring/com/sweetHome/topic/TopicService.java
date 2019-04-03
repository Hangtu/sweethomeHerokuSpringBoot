package www.sweethomespring.com.sweetHome.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Hang", 25), new Topic("Alma", 28)));

	public List<Topic> getTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		try {
		  return topics.stream().filter(x -> x.getName().equalsIgnoreCase(id)).findFirst().get();
		}catch(NoSuchElementException ex) {
		   System.out.println(ex.getMessage());
		   return new Topic("",0);
		}
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
