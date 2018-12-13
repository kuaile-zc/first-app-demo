package com.zc.firstappdemo.config;

import com.zc.firstappdemo.domain.User;
import com.zc.firstappdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.Collection;

/**
 * 路由函数，配置
 */
@Configuration
public class RouterFunctionConfiguration {

    /**
     *Servlet
     * 请求接口： ServletRequest 或者 HttpServletRequest
     * 响应接口： ServletResponse 或者 HttpServletResponse
     * spring 5.0 重新定义服务请求和响应接口：
     * 请求接口： ServletRequest
     * 响应接口： ServletResponse
     * 即可以支持Servlet规范 ,也可以支持自定义 ， 比如 Netty(Web Server)
     *
     * 定义GET
     */
    @Bean
    @Autowired
    public RouterFunction<ServerResponse> personFindAll(UserRepository userRepository){
        Collection<User> users= userRepository.findAll();

//        RouterFunctions.route(RequestPredicates.GET("/person/find/all"),

//                );
        return null;
    }
}
