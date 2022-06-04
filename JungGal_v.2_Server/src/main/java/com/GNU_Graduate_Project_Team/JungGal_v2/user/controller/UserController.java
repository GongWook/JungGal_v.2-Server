package com.GNU_Graduate_Project_Team.JungGal_v2.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.GNU_Graduate_Project_Team.JungGal_v2.user.model.PhoneVO;
import com.GNU_Graduate_Project_Team.JungGal_v2.user.model.UserVO;
import com.GNU_Graduate_Project_Team.JungGal_v2.user.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService service;
	
	/*
	 ***** Json �������� ��� *****
	 *
	 *
	@PostMapping("/register")
	public UserVO register( UserVO user)
	{
		Integer flag = 0;
		
		System.out.println("/user/ POST ��û �߻�!");
		System.out.println("param : " + user);
		
		
		flag = service.checkId(user.getId());
		
		if(flag==0)
		{
			service.user_regist(user);
		}
		else
		{
			user.setId("null");
		}
		
		
		return user;
		
	}
	 */
	
	
	// multipart/form-data �������� ���
	@PostMapping("/register")
	public UserVO register( UserVO user)
	{
		Integer flag = 0;
		
		System.out.println("/user/register POST ��û �߻�!");
		System.out.println("param : " + user);
		
		//���Ե� ID���� Checking 
		flag = service.checkId(user.getId());
		
		
		if(flag==0)
		{
			service.user_regist(user);
		}
		else
		{
			user.setId("null");
		}
				
		return new UserVO(user.getId());
		
	}
	
	@PostMapping("/login")
	public UserVO login(@RequestBody UserVO checkuser)
	{
		System.out.println("/user/lgoinCheck ��û! : POST");
		System.out.println("Parameter : " + checkuser);
		
		UserVO user = service.selectOne(checkuser);
		
		return user;
		
	}
	
	@PostMapping("/auth")
	public PhoneVO phone_auth(@RequestBody PhoneVO phone_info)
	{
		System.out.println("������ ���̳� : �޴��� ���� Controller ȣ�� !!");
		System.out.println("/user/phone_auth ��û! : POST");
		System.out.println("Parameter : " + phone_info.getPhone_number());
		
		service.phone_auth(phone_info.getPhone_number());
		
		return phone_info;
	}
	
	@PostMapping("/authPass")
	public PhoneVO phone_auth_pass(@RequestBody PhoneVO phone_info)
	{
		System.out.println("/user/phone_auth_pass ��û! : POST");
		System.out.println("Parameter : " + phone_info.getAuth_number());
		
		return service.phone_auth_pass(phone_info);
		
	}
	
}
