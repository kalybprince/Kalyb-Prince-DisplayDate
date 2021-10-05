package com.kalyb.codingdojo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
// New import needed!
import org.springframework.ui.Model;
@Controller
public class DisplayDateController {
	@RequestMapping("/")
	public String index(Model model) {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String time(Model model) {
		Date date = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
	    String strDate = formatter.format(date);  
	    strDate = formatter.format(date);
		model.addAttribute("dateString", strDate);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String date(Model model) {
		LocalTime localTime = LocalTime.now();
		DateTimeFormatter timeFormatter4 = DateTimeFormatter.ofPattern("KK:mm a");
		String myTime = localTime.format(timeFormatter4);
		model.addAttribute("myTime", myTime);
		return "time.jsp";
	}
}