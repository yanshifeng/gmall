package com.al312.gmall.service.impl;

import com.al312.gmall.mapper.UmsMemberReceiveAddressMapper;
import com.al312.gmall.mapper.UserMapper;
import com.al312.gmall.pojo.UmsMember;
import com.al312.gmall.pojo.UmsMemberReceiveAddress;
import com.al312.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: Zafir Yan
 * @Date: 2020/4/28 11:18
 * @version: V1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllInfo() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getMemberReceiveAddressById(String memberId) {
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId", memberId);
        return umsMemberReceiveAddressMapper.selectByExample(example);
    }
}
