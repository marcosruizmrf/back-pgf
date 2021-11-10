package com.marcos.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.todo.domain.Todo;
import com.marcos.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;
 
	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Aruela Especial", "Cliente X. Obs: Ag Têmpera", sdf.parse("25/03/2022"), false);
		Todo t2 = new Todo(null, "Biela Simétrica", "Cliente Y. Obs: Ag Têmpera", sdf.parse("22/03/2021"), true);

		todoRepository.saveAll(Arrays.asList(t1, t2));
	} 
	
}