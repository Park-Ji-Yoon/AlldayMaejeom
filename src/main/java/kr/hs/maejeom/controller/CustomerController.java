package kr.hs.maejeom.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


//import kr.hs.maejeom.model.dto.CustomerDTO;
//import kr.hs.maejeom.service.CustomerService;
//import kr.hs.maejeom.service.CustomerServiceImpl;


@Controller
public class CustomerController {
	
	/*
	 * @Autowired CustomerService customerService;
	 * 
	 * // ȸ������ ��
	 * 
	 * @GetMapping("/signup_form") public String signup_form() { return
	 * "maejeom/signup_form"; }
	 * 
	 * // ȸ������
	 * 
	 * @PostMapping("/signup") public String signup(CustomerDTO dto) {
	 * if(customerService.duplicate(dto.getUserid())) { customerService.signup(dto);
	 * }else { System.out.println("���̵� �ߺ���"); } return "maejeom/signup"; }
	 * 
	 * // �α��� ��
	 * 
	 * @GetMapping("/login_form") public String login_form() { return
	 * "maejeom/login_form"; }
	 * 
	 * // �α���
	 * 
	 * @PostMapping("/login") public String login(@RequestParam String userid,
	 * String passwd) { boolean result = customerService.login(userid, passwd);
	 * if(result) { System.out.println("�α��� ����"); }else {
	 * System.out.println("�α��� ����"); } return "maejeom/login"; }
	 */
	
}