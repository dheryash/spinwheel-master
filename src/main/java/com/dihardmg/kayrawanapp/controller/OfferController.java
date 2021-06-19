package com.dihardmg.kayrawanapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.dihardmg.kayrawanapp.dao.OfferDao;
import com.dihardmg.kayrawanapp.entity.Offer;

/**
 * @author : Otorus
 * @since : 1/4/18
 */
@Controller
public class OfferController {
	
    @Autowired
    private OfferDao offerDao;


    @GetMapping("/offer/list")
    public ModelMap karyawan(@PageableDefault(size = 5) Pageable pageable, @RequestParam(name = "value", required = false) String value, Model model){
        if (value != null) {
            model.addAttribute("key", value);
            return new ModelMap().addAttribute("offer", offerDao.findByOfferIdContainingIgnoreCase(value, pageable));
        } else {
            return new ModelMap().addAttribute("offer", offerDao.findAll(pageable));
        }
    }



    @GetMapping("/offer/form")
    public ModelMap tampilkanForm(@RequestParam(value = "id", required = false) Offer offer ) {
        if (offer == null) {
            offer = new Offer();
        }
        return new ModelMap("offer", offer);
    }




    @PostMapping("/offer/form")
    public String simpan(@Valid @ModelAttribute("offer") Offer offer , BindingResult errors, SessionStatus status) {
        if (errors.hasErrors()) {
            return "offer/form";
        }
        offerDao.save(offer);
        status.setComplete();
        return "redirect:/offer/list";
    }




    @GetMapping("/offer/delete")
    public ModelMap deleteConfirm(@RequestParam(value = "id", required = true) Offer offer ) {
        return new ModelMap("offer", offer);
    }




    @PostMapping("/offer/delete")
    public Object delete(@ModelAttribute Offer offer , SessionStatus status) {
        try{
            offerDao.delete(offer);
        } catch (DataIntegrityViolationException exception) {
            status.setComplete();
            return new ModelAndView("error/errorHapus")
//                    .addObject("entityId", karyawan.getNama())
                    .addObject("entityName", "Offer")
                    .addObject("errorCause", exception.getRootCause().getMessage())
                    .addObject("backLink","/offer/list");
        }
        status.setComplete();
        return "redirect:/offer/list";
    }
}


