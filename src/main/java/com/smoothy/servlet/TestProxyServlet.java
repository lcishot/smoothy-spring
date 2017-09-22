package com.smoothy.servlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import org.mitre.dsmiley.httpproxy.ProxyServlet;

/**
 * Created by smoothy on 17/9/22.
 */

@WebServlet(urlPatterns = {"/testProxyServlet"}, initParams = {
    @WebInitParam(name = "targetUri", value = "https://www.baidu.com/s?ie=UTF-8&wd=123"),
    @WebInitParam(name = ProxyServlet.P_LOG, value = "true")})
public class TestProxyServlet extends ProxyServlet {

}
