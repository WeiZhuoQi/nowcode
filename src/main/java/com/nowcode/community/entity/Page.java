package com.nowcode.community.entity;

import lombok.Data;

/**
 * 封装分页相关信息
 */
public class Page {
    //页面返回当前页码
    private int current=1;
    //页面返回显示上限
    private int limit=10;
    //返回给页面数据总数（用于计算总页数）
    private int rows;
    //返回给页面查询路径(用于复用分页链接）
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current>=1){
            this.current = current;
        }

    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit>=1&&limit<=100){
            this.limit = limit;
        }

    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows>=0){
            this.rows=rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    //数据库不需要当前页的页码，需要的是当前页的起始行
    //需要根据当前页的页码算出起始行
    public int getOffset(){
        return (current-1)*limit;
    }
    //显示总页数，页码范围不能超过总共出现的页数
    public int getTotal(){
        if(rows%limit==0){
            return rows/limit;
        }else {
            return rows/limit+1;
        }
    }
    //获取起始页码 当前页前面最近的两个页码
    public int getFrom(){
        int from=current-2;
        return from<1?1:from;
    }
    //获取结束页码 当前页后面最近的两个页码
    public int getTo(){
        int to=current+2;
        int total=getTotal();
        return to>total?total:to;
    }
}
