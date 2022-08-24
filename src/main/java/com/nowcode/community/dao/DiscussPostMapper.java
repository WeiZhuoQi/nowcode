package com.nowcode.community.dao;

import com.nowcode.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 魏卓其
 * @create 2022-08-22 10:10
 */
@Mapper
public interface DiscussPostMapper {
    //userId是为了后续开发而写，后续查看自己发的帖子需要
    //当前开发不用userId，则将userId置为0，需要时在置为相应的数，这就需要编写动态sql
    //offset是为了完成分页，每页起始行的行号；limit是每页最多显示多少条数据
    List<DiscussPost> selectDissPosts(int userId,int offset,int limit);
    //查询一共有多少数据即帖子行数
    int selectDiscussPostsRows(@Param("userId") int userId);

}
