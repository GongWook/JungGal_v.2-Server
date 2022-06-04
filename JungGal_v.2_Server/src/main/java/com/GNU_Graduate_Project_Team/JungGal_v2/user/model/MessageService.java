package com.GNU_Graduate_Project_Team.JungGal_v2.user.model;

import java.util.HashMap;
import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;


/**
 * @class ExampleSend
 * @brief This sample code demonstrate how to send sms through CoolSMS Rest API PHP
 */

public class MessageService {
	
	    private static String api_key = "NCSY4FGQPY6V3ZRN";
	    private static String api_secret = "W9EIISFFEGBQMS3FMXJZWS7Y6V51CGKN";
	    private static String phone_num = "07045130104";
	    Message coolsms = new Message(api_key, api_secret);

	    public void sendMessage(String toNumber, String randomNumber)
	    {
	    	// 4 params(to, from, type, text) are mandatory. must be filled
		    HashMap<String, String> params = new HashMap<String, String>();
		    
		    params.put("to", toNumber);
		    params.put("from", phone_num);
		    params.put("type", "SMS");
		    params.put("text", "[����] ������ȣ : "+randomNumber+" �Դϴ�.\n ��Ȯ�� �Է��� �ּ���.");
		    params.put("app_version", "test app 1.2"); // application name and version

		    try {
		      JSONObject obj = (JSONObject) coolsms.send(params);
		      System.out.println(obj.toString());
		    } catch (CoolsmsException e) {
		      System.out.println(e.getMessage());
		      System.out.println(e.getCode());
		    }
	    }
	    
}
