package com.GNU_Graduate_Project_Team.JungGal_v2.user.repository;

import com.GNU_Graduate_Project_Team.JungGal_v2.user.model.UserVO;

public interface IUserMapper {
	
	//ȸ�� ���� ���
	void user_regist(UserVO user);
	
	//ȸ������ ��ȸ �� �α��� ���
	UserVO selectOne(String account);
	
	//id �ߺ� Ȯ��
	Integer checkId(String id);
}
