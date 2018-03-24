package asw.webService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import asw.restService.AgentsConnector;

@Controller
public class WebController {
	
	@Autowired
	AgentsConnector agentsConnector;
	
	@RequestMapping(value = "/")
	public String index() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String fillLogin() {
		return "login";
	}
	
	@RequestMapping(value = "/incident")
	public String getIncident() {
		return "incidentCreationForm";
	}
	
	@RequestMapping(value = "/create-incident")
	public String createIncident() {
		return "incidentCreationForm";
	}
}