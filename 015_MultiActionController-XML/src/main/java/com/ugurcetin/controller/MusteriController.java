package com.ugurcetin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


@Controller
public class MusteriController extends MultiActionController {

	
	public ModelAndView ekle(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		String mesaj = "Müşteri sınıfındaki ekle metodu çağırıldı.";
		
		System.out.println(mesaj);
		
		//ModelAndView modelAndView = new ModelAndView("MusteriView");
		
		//modelAndView.addObject("modelNesnesi", mesaj);
		
		//return modelAndView;
		
		return new ModelAndView("MusteriView", "musteriModelNesnesi", mesaj);
	}
	
		
	public ModelAndView sil(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		String mesaj = "Müşteri sınıfındaki sil metodu çağırıldı.";
		
		System.out.println(mesaj);
		
		return new ModelAndView("MusteriView", "musteriModelNesnesi", mesaj);
	}
	
	public ModelAndView duzenle(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		String mesaj = "Müşteri sınıfındaki düzenle metodu çağırıldı.";
		
		System.out.println(mesaj);
		
		return new ModelAndView("MusteriView", "musteriModelNesnesi", mesaj);
	}
}
