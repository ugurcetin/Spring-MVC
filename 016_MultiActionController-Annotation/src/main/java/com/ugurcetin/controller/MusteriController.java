package com.ugurcetin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


@Controller
@RequestMapping("/musteri")
public class MusteriController extends MultiActionController {

	@RequestMapping("/ekle.izmit")
	public ModelAndView ekle(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		String mesaj = "Müşteri sınıfındaki ekle metodu çağırıldı.";
		
		System.out.println(mesaj);
		
		//ModelAndView modelAndView = new ModelAndView("MusteriView");
		
		//modelAndView.addObject("modelNesnesi", mesaj);
		
		//return modelAndView;
		
		return new ModelAndView("MusteriView", "musteriModelNesnesi", mesaj);
	}
	
	@RequestMapping("/sil.izmit")
	public ModelAndView sil(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		String mesaj = "Müşteri sınıfındaki sil metodu çağırıldı.";
		
		System.out.println(mesaj);
		
		return new ModelAndView("MusteriView", "musteriModelNesnesi", mesaj);
	}
	
	@RequestMapping("/duzenle.izmit")
	public ModelAndView duzenle(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		String mesaj = "Müşteri sınıfındaki düzenle metodu çağırıldı.";
		
		System.out.println(mesaj);
		
		return new ModelAndView("MusteriView", "musteriModelNesnesi", mesaj);
	}
}
