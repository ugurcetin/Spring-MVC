package com.ugurcetin.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/market")
public class AnasayfaController {
	
	@RequestMapping(value = "/gida/{turu}/{indirimOrani}")
	public ModelAndView gidaReyonu(@PathVariable("turu") String turu,
									@PathVariable("indirimOrani") String indirimOrani

			//@PathVariable Map <String, String> pathVars
			) { 
		
		//String turu = pathVars.get("turu").toString();
		//String indirimOrani = pathVars.get("indirimOrani").toString();
		
		ModelAndView modelAndView = new ModelAndView("AnasayfaView");
		
		if(sayiDenetimi(indirimOrani)) {
			
			indirimOrani = "0";
		}
		
		String duyuruMesaji;
		
		if(0 < Integer.valueOf(indirimOrani)) {

			duyuruMesaji = "<br /> <b> Türü :</b>  "  + turu.toUpperCase() + 
					       "<br /> <b> İndirim Oranı :</b>  %"  + indirimOrani;

		}else{
			duyuruMesaji = "<br /> <b> Türü :</b>  "  + turu.toUpperCase() + 
				           "<br /> <b style = background-color:#F6CECE> Henüz bir indirim yok.</b> ";

		}
		
		modelAndView.addObject("duyuruMesaji", duyuruMesaji);
		
		return modelAndView;
	}

	public static boolean sayiDenetimi(String gelenDeger) {
		
		for(char ch: gelenDeger.toCharArray()){
	
		if (Character.isDigit(ch)) {
				
			return false;
			
			}
		}	
	
		return true;
	}
	
}

