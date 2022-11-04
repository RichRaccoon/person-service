package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.service.api.UserService;
import liga.medical.personservice.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SecurityController {
    private final UserService userService;
    private final UserValidator userValidator;

    public SecurityController(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

    @GetMapping("/success")
    public String getSuccessPage() {
        return "success";
    }

    @GetMapping("/registration")
    public String userForm(Model model) {
        model.addAttribute("user", new UserDto());
        return "registration";
    }

    @PostMapping("/registration")
    public String insertUser(@ModelAttribute UserDto userDto, BindingResult bindingResult, Model model) {
        userValidator.validate(userDto, bindingResult);

        if (bindingResult.hasErrors()) {
            List<FieldError> errorList = bindingResult.getFieldErrors();
            model.addAttribute("errors", errorList);
            model.addAttribute("user", userDto);
            return "registration";
        }

        userService.insertUser(userDto);
        return "login";
    }

}
