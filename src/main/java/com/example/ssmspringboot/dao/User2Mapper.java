package com.example.ssmspringboot.dao;

import com.example.ssmspringboot.domain.User2;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper     //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface User2Mapper {
    User2 selectUserByName(String name);
}
