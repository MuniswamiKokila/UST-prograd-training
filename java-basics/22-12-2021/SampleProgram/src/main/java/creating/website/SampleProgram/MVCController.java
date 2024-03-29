package creating.website.SampleProgram;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MVCController {
    @RequestMapping("/")
    public String index(){
        return "HomePage";
    }
    @RequestMapping("/addition")
    public String addition(){
        return "addition";
    }
    @RequestMapping("/result")
    public String result(Model model, HttpServletRequest request){
        int num1=Integer.parseInt(request.getParameter("num1"));
        int num2=Integer.parseInt(request.getParameter("num2"));
        int res=num1+num2;
        model.addAttribute("res",res);
        return "result";
    }
}
