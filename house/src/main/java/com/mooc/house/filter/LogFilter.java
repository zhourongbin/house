package com.mooc.house.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class LogFilter implements Filter {

    int i  = 0 ;
    private Logger logger = LoggerFactory.getLogger(LogFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("init excute");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,FilterChain chain)
            throws IOException, ServletException {

        logger.info("Request coming "+i);
        i++;
        chain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        logger.info("destroy excute");

    }
}
