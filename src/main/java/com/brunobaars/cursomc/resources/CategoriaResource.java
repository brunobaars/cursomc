package com.brunobaars.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brunobaars.cursomc.domain.Categoria;
import com.brunobaars.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

//Auto Instancia o objeto	
	@Autowired
	private CategoriaService service;
	
//informando que a requisição passará na URL depois do /categorias o número do id.
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	
//@PathVariable informa que o id virá na URL
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
