package com.manoeljunior.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoeljunior.workshopmongo.domain.User;
import com.manoeljunior.workshopmongo.repository.UserRepository;
import com.manoeljunior.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired //Instancia o objeto
	private UserRepository repo; //Mecanismo de injeção de dependência automática do spring
	
	public List<User> findAll(){
		return repo.findAll();		
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
