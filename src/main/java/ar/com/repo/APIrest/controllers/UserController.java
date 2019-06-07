  package ar.com.repo.APIrest.controllers;


  import ar.com.repo.APIrest.DTO.DtoUser;
  import ar.com.repo.APIrest.model.User;
  import ar.com.repo.APIrest.service.UserService;
  import io.swagger.annotations.Api;
  import io.swagger.annotations.ApiOperation;
  import io.swagger.annotations.ApiResponse;
  import io.swagger.annotations.ApiResponses;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.http.MediaType;
  import org.springframework.web.bind.annotation.*;

  import java.util.List;

  @RestController
  @RequestMapping(path = "api/user")
  @Api(value="LoanControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
  public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET, path = "/")
    private List<User> getAllUsers( ) {
      return  userService.list();
    }


    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    @ApiOperation("Get the User con Id especifico")
    @ApiResponses(value = {@ApiResponse( code = 200, message = "Ok", response = DtoUser.class) })
    public DtoUser setearUsuario(@PathVariable Integer id) {
        return  userService.get(id);
    }


    @RequestMapping(value = "/", method=RequestMethod.POST)
    public User create(@RequestBody DtoUser dtoUser) {
      User user = new User();
      user.setUserFirstName(dtoUser.getUserFirstName());
      user.setUserLastName(dtoUser.getUserLastName());
      user.setEmail(dtoUser.getUser_email());
      user.setLoanList(dtoUser.getUserLoans());

      return userService.create(user);
    }




  }
