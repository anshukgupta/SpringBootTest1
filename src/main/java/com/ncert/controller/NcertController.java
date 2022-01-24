package com.ncert.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncert.entities.MasterScheduler;
import com.ncert.entities.NotificationGateway;
import com.ncert.entities.SurveyorRespondent;
import com.ncert.service.MasterSchedulerService;
import com.ncert.service.NotificationService;
import com.ncert.service.SurveyorRespondentService;


@Controller
public class NcertController {
	
	@Autowired
	MasterSchedulerService service;
	
	@Autowired
	NotificationService nService;
	
	@Autowired
	SurveyorRespondentService sRService;
	
	@RequestMapping("/getData")
	public String getMasterDetails(ModelMap modelMap)
	{
		List<MasterScheduler> master = service.getAll();
		modelMap.addAttribute("master", master);
		return "masterScheduler";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("schedulerId")int schedulerId, ModelMap modelMap)
	{
		MasterScheduler master = service.getMasterSchedulerId(schedulerId);
		modelMap.addAttribute("master", master);
		System.out.println("At line no 34==>>"+schedulerId);
		return "updateMasterScheduler"; //updatemasterScheduler.jsp
	}
	
	@RequestMapping("/updateMaster")
	public String updateMaster(@ModelAttribute("master")MasterScheduler master,ModelMap modelMap)
	{
		service.updateMaster(master);
		return "success";
	}
	
	
	
	@RequestMapping("/getnotification")
	public String getNotificationDetails(ModelMap modelMap)
	{
		List<NotificationGateway> notification = nService.getAll();
		modelMap.addAttribute("notification", notification);
		return "notification";
	}
	
	@RequestMapping("/showNotiUpdate")
	public String showNotiUpdate(@RequestParam("id")int id, ModelMap modelMap)
	{
		nService.getNotificationId(id);
		NotificationGateway notification = nService.getNotificationId(id);
		modelMap.addAttribute("notification", notification);
		return "updateNotification";
	}
	
	@RequestMapping("/updateNotification")
	public String updateNotification(@ModelAttribute("notification")NotificationGateway notification,ModelMap modelMap)
	{
		System.out.println("At 114==>>"+notification.getId()+" "+notification.getEmailStatus()+" "+notification.getSmsStatus());
		nService.updateNotification(notification);
		return "success";
	}
	
	
	@RequestMapping("/getRespondentDetails")
	public String getSurveyorRespondentDetails(ModelMap modelMap)
	{
		List<SurveyorRespondent> respondent = sRService.getAll();
		modelMap.addAttribute("surveyorRespondent", respondent);
		return "surveyorRespondent";
	}

}
