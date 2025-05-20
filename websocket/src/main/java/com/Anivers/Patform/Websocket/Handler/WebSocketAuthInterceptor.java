package com.Anivers.Patform.Websocket.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.http.server.ServletServerHttpRequest;
import java.util.Map;


@Component
public class WebSocketAuthInterceptor implements HandshakeInterceptor{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response,
                                   WebSocketHandler wsHandler, Map<String, Object> attributes) {
        if (request instanceof ServletServerHttpRequest servletRequest) {
            HttpServletRequest req = servletRequest.getServletRequest();
            logger.info("req 파라미터 :" + req.getParameter("userid"));
            String userId = req.getParameter("userid");  // ex) ws://...?userId=cavlar
            if (userId != null) {
                attributes.put("userId", userId);       // Principal로 넘기기 위한 준비
            }
        }
        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response,
                               WebSocketHandler wsHandler, Exception exception) {}
}
