package com.buylist.domain.web;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.buylist.domain.entity.BuyListInfo;
import com.buylist.domain.service.BuyListService;

@Controller
public class BuyListController {

    final static Logger log = LogManager.getLogger(BuyListController.class);
    
    BuyListService service;
    
    public BuyListController(BuyListService service) {
        this.service = service;
    }

    @GetMapping(value = "/index")
    public String index(BuyListForm form, Model model) {
        return "index";
    }

    @PostMapping(value = "/list")
    public String confirm(@Validated @ModelAttribute BuyListForm form, BindingResult result, Model model) {

        List<BuyListInfo> buyList = service.getBuyList(form.getUserId());
        model.addAttribute("buyList", buyList);
        return "list";
    }
}
