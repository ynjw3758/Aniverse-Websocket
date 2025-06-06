package com.Anivers.Patform.Websocket.dispatcher;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.Anivers.Patform.Websocket.Services.Noti_Service;

@Service
public class Noti_dispatcher {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private Noti_Service Noti;
	
	public Noti_dispatcher(Noti_Service Noti) {
		this.Noti = Noti;
	}
	
	public void SaveNoti(Map<String, Object> info) {
		Noti.SaveNoti(info);
	}

}
