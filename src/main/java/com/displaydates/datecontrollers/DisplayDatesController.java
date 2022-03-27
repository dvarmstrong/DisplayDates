package com.displaydates.datecontrollers;
import org.springframework.stereotype.Controller;
import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.Date;





@Controller
public class DisplayDatesController {
	
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat dayOfWeek = new SimpleDateFormat("EEEEE ");
		SimpleDateFormat dayofMonth = new SimpleDateFormat("d");
		SimpleDateFormat month = new SimpleDateFormat("MMMMM");
		SimpleDateFormat year = new SimpleDateFormat("yyyy");
		
		Date date = new Date();
		
		String weekday = dayOfWeek.format(date);
		String monthNum = dayofMonth.format(date);
		String monthNow = month.format(date);
		String yearNow  = year.format(date);
		
		String dateString = weekday + ", " + "the " + monthNum + " of " + monthNow  + "," + yearNow;
		
		model.addAttribute("dateString", dateString);
		
		return "date.jsp";
		
	
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat time  = new SimpleDateFormat("h:mm a ");
		
		Date date = new Date(); 
		String currentTime = time.format(date);
		
		model.addAttribute("currentTime", currentTime);
		
		
		return "time.jsp";
	}



}
