package jana60.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("/home")
	public String saluta() {
		return "home";
	}

	@GetMapping("/ora")
	public String orario(Model model) {

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formatDateTime = now.format(formatter);
		model.addAttribute("Orario", formatDateTime);

		return "ora";

	}
}