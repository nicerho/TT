package sp1;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
		// 실제 메일 API 서버 정보 입력 필요

		String host = "smtp.naver.com";
		String pw = "";
		String user = "nicehoh@naver.com";
		String to_mail = "nicehoh@naver.com";
		String name = req.getParameter("a");
		String mail = req.getParameter("b");
		String subject = req.getParameter("c");
		String geul = req.getParameter("d");
		// API 포트번호 및 TLS 정보 세팅
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", 587);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.debug", "true");
		props.put("mail.smtp.socketFactory", 587);
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");
		// SMTP 서버 로그인
		Session session = Session.getDefaultInstance(props, new Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(user, pw);
			}
		});
		try {
			// MimeMessage : id pw port 모두 맞을 경우 okcall
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(mail, name));// 보낸이
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to_mail));// 받는이
			msg.setSubject(subject);// 이메일제목
			msg.setText(geul);// 이메일내용
			Transport.send(msg);// 발송
			System.out.println("success");
		} catch (Exception e) {
			System.out.println("통신오류");
		}
		return null;
	}

	// controller에서 jsp에 배열 즉시 출력
	@GetMapping("/spring5ok.do")
	public String datalist(HttpServletRequest req, Model model) {
		String data[] = { "ㅇㅅㅅ", "ㅎㄱㄷ", "ㅇㄱㅅ", "ㄱㄱㅊ", "ㅎㅅㅂ" };
		List<String> list = new ArrayList<>(Arrays.asList(data));
		// req.setAttribute("person_list",list);
		model.addAttribute("person_list", list);
		model.addAttribute("person_delete","10");
		return "WEB-INF/jsp/spring5_2ok";
		// return "WEB-INF/jsp/spring5ok";
	}

}
