package com.starter.countroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.starter.Entities.CrimeReport;
import com.starter.dao.CrimeRepository;
import com.starter.dao.UserRepository;

@Controller
@RequestMapping("/reports")
public class CrimeController {

    @Autowired
    private CrimeRepository repository;
    @Autowired
   private UserRepository repository1;
    @GetMapping
    public String viewDashboard(Model model) {
        model.addAttribute("reports", repository.findAllByOrderByReportedAtDesc());
        return "dashboard";
    }

    @GetMapping("/new")
    public String showReportForm(Model model) {
        model.addAttribute("report", new CrimeReport());
        return "report-form";
    }

    @PostMapping("/save")
    public String saveReport(@ModelAttribute("report") CrimeReport report) {
        repository.save(report);
        return "redirect:/reports";
    }
    
    

}
