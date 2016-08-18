package com.emusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by dinesh on 8/11/16.
 */

@Controller
@RequestMapping("/cart")
public class CartController {

    @RequestMapping
    public String get (HttpServletRequest request) {
        return "redirect:/cart/" + request.getSession(true).getId();
    }
}
