package sp1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class index implements Controller {
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = "zz";
		ModelAndView mv = new ModelAndView();
		//addObject("별명",데이터값)는 ${}, getAttribute 모두 사용 가능
		mv.addObject("name", name);
		mv.setViewName("/WEB-INF/viewpage/index");
		return mv;
	}
}
