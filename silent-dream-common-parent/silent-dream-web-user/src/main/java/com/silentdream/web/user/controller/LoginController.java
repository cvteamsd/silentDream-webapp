package com.silentdream.web.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.silentdream.common.page.PageBean;
import com.silentdream.facade.user.entity.User;
import com.silentdream.facade.user.service.UserFacade;

@Controller
public class LoginController {

    @Autowired
    @Qualifier("userFacade")
    private UserFacade userFacade;

    @RequestMapping("/login")
    public String index(Model model) {

        // 指定当前需要显示的页码（currentPage），页面列表长度（pageSize）
        PageHelper.startPage(1, 10);

        model.addAttribute("page", new PageBean<User>((List<User>) userFacade.findUserByUserNo("")));
        return "index";
    }

}
