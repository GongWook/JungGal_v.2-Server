package com.GNU_Graduate_Project_Team.JungGal_v2.user.phonerepository;

import com.GNU_Graduate_Project_Team.JungGal_v2.user.model.PhoneVO;

public interface IUserPhoneAuthMapper {

	//�޴��� ���� ��ȣ TMP ����
	void phone_auth(PhoneVO phone_info);

	//�޴��� ������ȣ select
	String phone_auth_pass(PhoneVO phone_info);
	
}
