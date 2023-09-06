package sp1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class webpage2 {
	@PostMapping("/springok.do")
	public String product(HttpServletRequest req, Model model) {

		try {
			String name = req.getParameter("pname").intern();
			String code = req.getParameter("pcode").intern();
			model.addAttribute("pname", name);
			model.addAttribute("pcode", code);
		} catch (Exception e) {

		}
		return "WEB-INF/jsp/spring1ok";
	}

	@PostMapping("/spring2ok.do")
	public String agree(HttpServletRequest req, Model model) {
		try {
			// checkbox는 intern 사영금지
			String name = req.getParameter("mail");
			String ad = req.getParameter("ad");
			if (name == null || name == "") {
				name = "N";
			}
			model.addAttribute("agree", name);
			model.addAttribute("ad", ad);
		} catch (Exception e) {

		}
		return "WEB-INF/jsp/spring2ok";
	}

	@PostMapping("/spring3ok.do")
	public String user(HttpServletRequest req, Model model) {
		String name = req.getParameter("mnm");
		String id = req.getParameter("mid");
		userdata ud = new userdata(name, id);
		model.addAttribute("ud", ud.toString());
		return "WEB-INF/jsp/spring3ok";
	}

	@PostMapping("/spring4ok.do")
	public String customer(HttpServletRequest req, Model model) {
		String name = req.getParameter("a");
		String mail = req.getParameter("b");
		String subject = req.getParameter("c");
		String geul = req.getParameter("d");
		model.addAttribute("name",name);
		model.addAttribute("mail",mail);
		model.addAttribute("subject",subject);
		model.addAttribute("geul",geul);
		return "WEB-INF/jsp/spring4ok";
	}
}
