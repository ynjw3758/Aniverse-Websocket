package com.Anivers.Patform.Websocket.Services;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.Anivers.Patform.Websocket.Kafka.Produce;

@Service
public class Noti_Service {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private Produce kafka_producer;
	
	public Noti_Service(Produce kafka_producer) {
		
		this.kafka_producer = kafka_producer;
	}
	
	@Async
	public void SaveNoti(Map<String, Object> info) {
		logger.info(" 채팅 Noti 저장 :" + info);
		kafka_producer.SaveNoti(info);
	}

}
