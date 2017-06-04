package controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Event;

@Controller
public class EventController {

		@RequestMapping("/event")
		public String event(Model model){
			Random rand = new Random();
			int value = rand.nextInt(50);
			Event ev = new Event();
			ev.setDescription("Event Descripion");
			ev.setMessage("Message");
			ev.setEventid(value);
			model.addAttribute("event", ev);
			return "eventview";
		}
		
		@ResponseBody
		@RequestMapping("/")
		String entry(){
			return "My Spring Boot App";
		}
}
