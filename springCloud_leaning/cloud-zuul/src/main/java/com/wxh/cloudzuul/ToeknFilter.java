package com.wxh.cloudzuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;


/**
 * created by wuxiaohong on 2018/3/27
 */
public class ToeknFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(ToeknFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        logger.info("--->>> TokenFilter {},{}", request.getMethod(), request.getRequestURL().toString());

        String token = request.getParameter("token");
        if (StringUtils.isNotBlank(token)){
            currentContext.setSendZuulResponse(true);
            currentContext.setResponseStatusCode(200);
            currentContext.set("isSuccess",true);
        }else {
            currentContext.setSendZuulResponse(false); //不对其进行路由
            currentContext.setResponseStatusCode(400);
            currentContext.setResponseBody("token is empty");
            currentContext.set("isSuccess", false);
        }

        return null;
    }
}
