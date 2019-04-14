package br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.Service.PrevisaoService;
import br.usjt.ccp3anmca.usjt_ccp3anmca_jpa_hibernate_entrega.model.Previsao;

@Controller
public class PrevisaoController {

	@Autowired
	PrevisaoService previsaoService;
	
	@GetMapping("/listar_previsoes")
	public ModelAndView listarPrevisoes() {

		ModelAndView mv = new ModelAndView("listar_previsoes");

		List<Previsao> previsoes = previsaoService.listar();

		mv.addObject("previsoes", previsoes);

		mv.addObject(new Previsao());

		return mv;
	}


}
