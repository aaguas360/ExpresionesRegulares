package net.codejava;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  List<User> usuarios = new ArrayList<>();

  @GetMapping("/register")
  public String showForm(Model model) {
    User user = new User();
    model.addAttribute("user", user);
    return "register_form";
  }

  @PostMapping("/register")
  public String submitForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult,
      Model model) {
    usuarios.add(user);
    if (bindingResult.hasErrors()) {
      user.setError(0);
    } else {
      user.setError(1);
    }

    model.addAttribute("users", usuarios);
    return "register_form";
  }
  
  @RequestMapping("/eliminar")
  public String deleteAll() {
    usuarios.clear();
    return  "index";
  }
}
