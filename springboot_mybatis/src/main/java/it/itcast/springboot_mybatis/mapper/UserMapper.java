package it.itcast.springboot_mybatis.mapper;

import it.itcast.springboot_mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper  {
    public List<User> queryUserList();
}
