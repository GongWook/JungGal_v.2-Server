package com.GNU_Graduate_Project_Team.JungGal_v2.user.service;

import com.GNU_Graduate_Project_Team.JungGal_v2.user.model.PhoneVO;
import com.GNU_Graduate_Project_Team.JungGal_v2.user.model.UserVO;

public interface IUserService {

	//ȸ�� ���� ���
	void user_regist(UserVO user);
	
	//ȸ������ ��ȸ �� �α��� ���
	UserVO selectOne(UserVO checkuser);
	
	//id �ߺ� Ȯ��
	Integer checkId(String id);
	
	//����� �޴��� ����
	void phone_auth(String phone_number);
	
	//�޴��� ������ȣ Ȯ��
	PhoneVO phone_auth_pass(PhoneVO phone_info);
	
}
