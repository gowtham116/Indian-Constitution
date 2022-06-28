package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/index")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/home")
	public String viewHome1Page() {
		return "home";
	}
	
	@GetMapping("/english")
	public String viewEnglish() {
		return "eng";
	}
	
	@GetMapping("/hindi")
	public String viewHindi() {
		return "hindi";
	}
	
	@GetMapping("/Elections")
	public String viewElections() {
		return "Elections";
	}
	@GetMapping("/telugu")
	public String viewTelugu() {
		return "telugu";
	}
	@GetMapping("/tamil")
	public String viewTamil() {
		return "tamil";
	} 
	@GetMapping("/Constituent Assembly Members")
	public String viewConstituentAssemblyMembers() {
		return "Constituent Assembly Members";
	}
	
	@GetMapping("/PREAMBLE")
	public String viewpreamble() {
		return "PREAMBLE";
	}
	@GetMapping("/Constitution Making Process")
	public String viewConstitutionProcess() {
		return "Constitution Making Process";
	} 
	
	@GetMapping("/Constitution of India, 1950")
	public String viewConstitution1950() {
		return "Constitution of India, 1950";
	} 
	
	
	
	@GetMapping("/fundamental")
	public String viewPage() {
		return "fundamental";
	} 
	
	@GetMapping("/Emergency Provisions")
	public String viewEmergencyProvisions() {
		return "Emergency Provisions";
	} 
	 
	@GetMapping("/book")
	public String viewBook() {
		return "book";
	}
	
	@GetMapping("/movie")
	public String viewMovie() {
		return "movie";
	}

	@GetMapping("/fundamental duties")
	public String viewFundut() {
		return "fundamentalduties";
	}
	
	@GetMapping("/Parliament")
	public String viewParliament() {
		return "parliament";
	}
	@GetMapping("/p1")
	public String viewp1() {
		return "p1";
	}
	@GetMapping("/p2")
	public String viewp2() {
		return "p2";
	}
	@GetMapping("/p3")
	public String viewp3() {
		return "p3";
	}
	@GetMapping("/p4")
	public String viewp4() {
		return "p4";
	}
	@GetMapping("/p5")
	public String viewp5() {
		return "p5";
	}
	@GetMapping("/p6")
	public String viewp6() {
		return "p6";
	}
	@GetMapping("/p7")
	public String viewp7() {
		return "p7";
	}
	@GetMapping("/p8")
	public String viewp8() {
		return "p8";
	}
	
	@GetMapping("/e1")
	public String viewe1() {
		return "e1";
	}
	@GetMapping("/e2")
	public String viewe2() {
		return "e2";
	}
	@GetMapping("/e3")
	public String viewe3() {
		return "e3";
	}
	@GetMapping("/e4")
	public String viewe4() {
		return "e4";
	}
	@GetMapping("/e5")
	public String viewe5() {
		return "e5";
	}
	@GetMapping("/e6")
	public String viewe6() {
		return "e6";
	}
	 
	@GetMapping("/Official Language")
	public String viewOfficialLanguage() {
		return "Official Language";
	}
	@GetMapping("/o1")
	public String viewo1() {
		return "o1";
	}

	@GetMapping("/o2")
	public String viewo2() {
		return "o2";
	}

	@GetMapping("/o3")
	public String viewo3() {
		return "o3";
	}

	@GetMapping("/o4")
	public String viewo4() {
		return "o4";
	}

	@GetMapping("/o5")
	public String viewo5() {
		return "o5";
	}

	@GetMapping("/o6")
	public String viewo6() {
		return "o6";
	}

	@GetMapping("/o7")
	public String viewo7() {
		return "o7";
	}

	@GetMapping("/o8")
	public String viewo8() {
		return "o8";
	}

	@GetMapping("/o9")
	public String viewo9() {
		return "o9";
	}

	@GetMapping("/o10")
	public String view10() {
		return "o10";
	}

	@GetMapping("/o11")
	public String view11() {
		return "o11";
	}
	
	@GetMapping("/union")
	public String viewUnion() {
		return "union";
	}
	
	@GetMapping("/article1")
	public String viewarc1() {
		return "Article-1";
	}
	@GetMapping("/article2")
	public String viewarc2() {
		return "Article 2";
	}
	@GetMapping("/article3")
	public String viewarc3() {
		return "Article 3";
	}
	@GetMapping("/article4")
	public String viewarc4() {
		return "Article 4";
	}
	
	
	@GetMapping("/contact")
	public String viewContact() {
		return "contact";
	}
	@GetMapping("/citizenship")
	public String viewcitizenship() {
		return "citizenship";
	}
	@GetMapping("/c1")
	public String viewc1() {
		return "c1";
	}
	@GetMapping("/c2")
	public String viewc2() {
		return "c2";
	}
	@GetMapping("/c3")
	public String viewc3() {
		return "c3";
	}
	@GetMapping("/c4")
	public String viewc4() {
		return "c4";
	}
	
	@GetMapping("/about")
	public String viewcAbout() {
		return "about";
	}
	 
	
	@GetMapping("/index1")
	public String viewusers() {
		return "users";
	}

	@GetMapping("/home1")
	public String viewHome1() {
		return "home1";
	}
	 
	@GetMapping("/chat")
	public String viewChat() {
		return "chat";
	}
	 
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		return "register_success";
	}
	
	 
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return "users";
	}
	
	 
	
	
	
	
	 
}
