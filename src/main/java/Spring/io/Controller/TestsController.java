package Spring.io.Controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import Test.jario.JarsCla;

@Controller
public class TestsController extends HttpServlet{

	private static String asVar;
	
	@ModelAttribute
	TestVo testMap(){
		System.out.println("testtest를 지나갑니다.");
		TestVo vo = new TestVo();
		vo.setName("Dark Knight Message");
		return vo;
	}
	
	@RequestMapping("/test{id}")
	public ModelAndView test(@PathVariable String id, @ModelAttribute TestVo vo, HttpServletRequest req){
		JarsCla jt = new JarsCla();
		jt.callMessage();
		System.out.println("시작 : "+asVar);
		System.out.println("테스트 입니다 : "+ id);
		asVar = id;
//		ApplicationContext context = (ApplicationContext)getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
//		TestVo voa = context.getBean(TestVo.class);
//		System.out.println(voa.callTest());
//		System.out.println("종료 : "+asVar);
	    ModelAndView mv = new ModelAndView();
		mv.addObject("message", vo.getName());
		mv.setViewName("test");
		return mv;
	}
}
