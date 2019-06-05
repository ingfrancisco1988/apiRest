package ar.com.repo.APIrest.controllers;

import ar.com.repo.APIrest.DTOUser.DtoUser;
import ar.com.repo.APIrest.model.User;
import ar.com.repo.APIrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
  @RequestMapping("/")
  @ResponseBody
  public String home() {
    return "Hello World!";
  }
  @Autowired
  UserService userService;

  @RequestMapping(value = "/persona", method=RequestMethod.POST)
  public User create(@RequestBody User user) {
   user = userService.create(user);
   return user;
  }

  @RequestMapping(method = RequestMethod.GET, path = "/user")
  private List<User> getAllUsers( ) {

    return  userService.list();
  }


  @RequestMapping(method = RequestMethod.GET, path = "/user/{id}")
  public DtoUser setearUsuario(@PathVariable Long id) {

      return  userService.get(id);
  }


}
