package com.Anivers.Patform.Websocket.Dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class LastChatRead {
	
	private String chatId;
	private String userId;
	private String messageId;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime lastTime;
	
    // ✅ 기본 생성자, getter/setter
    public LastChatRead() {}
    
    public void setLastTime(LocalDateTime lastTime) {
    	this.lastTime = lastTime;
    }
    
    public LocalDateTime getLastTime() {
    	return lastTime;
    }
    
    public void setMessageId(String messageId) {
    	this.messageId = messageId;
    }
    
    public String getMessageId() {
    	return messageId;
    }
    
    public void setUserId(String userId) {
    	this.userId = userId;
    }
    
    public String getUserId() {
    	return userId;
    }
    
    public void setChatId(String chatId) {
    	this.chatId = chatId;
    }
    
    public String getChatId() {
    	return chatId;
    }


}
