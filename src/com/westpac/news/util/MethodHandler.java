package com.westpac.news.util;

/**
 * Method Handler interface
 * After image loading , we will call a callback implements this interface
 * 
 * @author Song Wang
 * 
 */
public interface MethodHandler<P> {
    public void process(P para);
}
