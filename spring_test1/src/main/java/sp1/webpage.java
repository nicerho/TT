package sp1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class webpage {

	// login
	@PostMapping("/login.do")
	public String loginok(HttpServletRequest req, HttpServletResponse res, Model model) {
		String mid = req.getParameter("mid");
		String mpw = req.getParameter("mpw");
		model.addAttribute("id", mid);
		model.addAttribute("pw", mpw);
		return "WEB-INF/viewpage/loginok";
	}

	// 상품검색
	@GetMapping("/search.do")
	public String search(HttpServletRequest req, HttpServletResponse res, Model model) {
		String pd = req.getParameter("product");
		model.addAttribute("pd",pd);
		return "WEB-INF/viewpage/product";
	}
	//아디분실
	//리턴타입이 void일 경우 HttpServletResponse를 빼고 아래와 같이 메서드를 작성하도록 한다
	@PostMapping("/idsearch.do")
	public void idsearch(HttpServletRequest req,  Model model) {
		String name = req.getParameter("name");
		model.addAttribute("name",name);
		
	}
	
}
