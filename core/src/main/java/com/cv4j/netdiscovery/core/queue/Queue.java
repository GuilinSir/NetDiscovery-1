package com.cv4j.netdiscovery.core.queue;

import com.cv4j.netdiscovery.core.http.Request;

/**
 * Created by tony on 2018/1/1.
 */
public interface Queue {

    /**
     * add a url to fetch
     *
     * @param request request
     */
    void push(Request request,String spiderName);

    /**
     * get an url to crawl
     *
     * @return the url to spider
     */
    Request poll(String spiderName);
}
