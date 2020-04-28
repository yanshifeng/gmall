package com.al312.gmall.user.controller;

import com.al312.gmall.pojo.UmsMember;
import com.al312.gmall.pojo.UmsMemberReceiveAddress;
import com.al312.gmall.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: Zafir Yan
 * @Date: 2020/4/28 11:15
 * @version: V1.0.0
 */
@Controller
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/getAllInfo")
    @ResponseBody
    public List<UmsMember> getAllInfo() {
        return userService.getAllInfo();
    }

    @RequestMapping("/getUmsMemberReceiveAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddress(String memberId) {
        return userService.getMemberReceiveAddressById(memberId);
    }
}
