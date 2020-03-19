package com.djzhao.mybatis.mapper;

import com.djzhao.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户mapper
 *
 * @author djzhao
 * @date 20/03/19 15:51
 * @email djzhao627@gmail.com
 */
@Mapper
@Repository
public interface UserMapper {

    List<User> list();

    User getById(int id);

    int add(User user);

    int update(User user);

    int delete(int id);

}
