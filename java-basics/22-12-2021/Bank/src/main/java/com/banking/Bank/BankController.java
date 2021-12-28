package com.banking.Bank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;


@Controller
public class BankController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @RequestMapping("/Details")
    public String showDetails(Model model, HttpServletRequest request){
        Map<String, ArrayList<String>> accountMap=new HashMap<>();
        ArrayList<String> setDetails;
        String accountNumber=null;
        String name=null;
        String balance=null;
        String mobileNumber=null;
        String branch=null;
        ArrayList<String> details1=new ArrayList<>(List.of("123456","265487144996","Kokila","9525454511","Tekkali","2000"));
        accountMap.put("Kokila",details1);
        ArrayList<String> details2=new ArrayList<>(List.of("123456","246157889156","Deepika","9745165817","Visakhapatnam","1500"));
        accountMap.put("Deepika",details1);

        String userName=request.getParameter("username");
        String password=request.getParameter("password");

        if(accountMap.containsKey(userName)){
            for(Map.Entry<String,ArrayList<String>> accountList:accountMap.entrySet()){
                if(Objects.equals(accountList.getKey(),userName) && accountList.getValue().contains(password)){
                    setDetails=accountList.getValue();
                    int j=1;
                    while (j< setDetails.size()){
                        if(j==1){
                            accountNumber= setDetails.get(j);
                        }
                        if(j==2){
                            name=setDetails.get(j);
                        }
                        if(j==3){
                            mobileNumber=setDetails.get(j);
                        }
                        if(j==4){
                            branch=setDetails.get(j);
                        }
                        if(j==5){
                            balance=setDetails.get(j);
                        }
                        j++;
                    }
                }
            }
            model.addAttribute("customerName",name);
            model.addAttribute("accountNumber",accountNumber);
            model.addAttribute("mobileNumber",mobileNumber);
            model.addAttribute("branch",branch);
            model.addAttribute("balance",balance);
        }
        return "details";
    }
}
