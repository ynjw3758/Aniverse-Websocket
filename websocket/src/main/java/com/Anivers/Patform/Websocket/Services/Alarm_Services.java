package com.Anivers.Patform.Websocket.Services;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Anivers.Patform.Websocket.Redis.Query;

@Service("Alarm_Services")
public class Alarm_Services {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Query Redis;
	
	public void SubAlarm(Map<String, Object> infos) {
		boolean isParti = false;
		isParti = Redis.login_state(infos.get("UserId").toString());
        logger.info("현재 로그인 상태 :" + isParti);
	}

}
