package com.al312.gmall.service;

import com.al312.gmall.pojo.UmsMember;
import com.al312.gmall.pojo.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author: Zafir Yan
 * @Date: 2020/4/28 11:06
 * @version: V1.0.0
 */
public interface UserService {
    List<UmsMember> getAllInfo();

    List<UmsMemberReceiveAddress> getMemberReceiveAddressById(String memberId);
}
