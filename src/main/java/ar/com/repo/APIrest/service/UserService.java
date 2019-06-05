package ar.com.repo.APIrest.service;

import ar.com.repo.APIrest.DTOUser.DtoUser;
import ar.com.repo.APIrest.model.User;
import ar.com.repo.APIrest.repository.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


  @Service

  public class UserService {

    @Autowired
    private UserRepository repository;

    public DtoUser get(long userId) {
      User user = repository.findAllById(userId);
      DtoUser dtoUser = new DtoUser();
      dtoUser.setUser_email(user.getEmail());
      dtoUser.setUserFirstName(user.getUserFirstName());
      dtoUser.setUserLastName(user.getUserLastName());
      dtoUser.setUserLoans(user.getLoans());
      dtoUser.setId(user.getId());
      return  (dtoUser);
    }

    public List<User> list() {
      List<User> listas = new ArrayList<User>();
       repository.findAll().forEach(listas::add);
      return (listas);
    }

    public User create(User user) {
      return repository.save(user);
    }


  }

