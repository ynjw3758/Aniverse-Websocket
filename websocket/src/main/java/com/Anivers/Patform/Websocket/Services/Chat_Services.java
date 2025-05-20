package com.Anivers.Patform.Websocket.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service("chat_Services")
public class Chat_Services {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	

	
	public List<Map<String, Object>> getParticiList(String ChatId){
		List<Map<String, Object>> parti_list = new ArrayList<>();
		
		return parti_list;
	}
	public void SendChat(Map<String, Object> info) {
		
	}
	
	

}
