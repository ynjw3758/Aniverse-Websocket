package com.Anivers.Patform.Websocket.Dto;

import java.util.List;

import lombok.Data;

@Data
public class ChatMessageDto {
    private String chatId;
    private String sendId;
    private String message;
    private String timestamp; // 필요시
    private String profile;
    private String nickname;
    private boolean first;
    private List<String> inviteIds;
    private int recount;

    // ✅ 기본 생성자, getter/setter
    public ChatMessageDto() {}
    
    public void setRecount(int recount) {
   	 this.recount = recount;
   }
   
   public int getRecount() {
   	return recount;
   }
    
    public void setNickname(String nickname) {
    	 this.nickname = nickname;
    }
    
    public String getNickname() {
    	return nickname;
    }
    
    public void setInviteIds(List<String> inviteIds) {
    	this.inviteIds = inviteIds;
    }
    
    public List<String> getInviteIds(){
    	return inviteIds;
    }
    
    public void setFirst(boolean first) {
    	this.first = first;
    }
    
    public boolean getFirst() {
    	return first;
    }
    
    public String getProfile() {
    	return profile;
    }
    
    public void setProfile(String profile) {
    	this.profile = profile;
    }

    public String getChatId() {
        return chatId;
    }
    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getSendId() {
        return sendId;
    }
    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
