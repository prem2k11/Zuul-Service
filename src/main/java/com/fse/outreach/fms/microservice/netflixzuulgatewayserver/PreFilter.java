package com.fse.outreach.fms.microservice.netflixzuulgatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
 
public class PreFilter extends ZuulFilter {
 
	private Logger logger = LoggerFactory.getLogger(this.getClass());
  @Override
  public String filterType() {
    return "pre";
  }
 
  @Override
  public int filterOrder() {
    return 1;
  }
 
  @Override
  public boolean shouldFilter() {
    return true;
  }
 
  @Override
  public Object run() {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest request = ctx.getRequest();
    logger.info("Request Method 111: " + request.getMethod());
    logger.info("Request URL 222: " + request.getRequestURL().toString());
    System.out.println("Request Method 11221: " + request.getMethod());
    System.out.println("Request Method 11221: " + request.getMethod());
    return null;
  }
}