package com.nowcode.community.service;

import com.nowcode.community.dao.DiscussPostMapper;
import com.nowcode.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 魏卓其
 * @create 2022-08-22 10:47
 */
@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;
    public List<DiscussPost> findDiscussPosts(int userId,int offset,int limit){
        return discussPostMapper.selectDissPosts(userId, offset, limit);
    }
    public int findDiscussPostRow(int userId){
        return discussPostMapper.selectDiscussPostsRows(userId);
    }
    //需要注意的点是查询时属性userId,但是我们希望显示的是用户名字
    //两种方法：（1）写sql是关联查询用户（2）得到数据后对每个DiscussPost单独查询一下user在将user和DiscussPost组合在一起返回给页面
}
