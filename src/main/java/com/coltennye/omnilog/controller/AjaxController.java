package com.coltennye.omnilog.controller;

import com.coltennye.omnilog.data.TestGroups;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Random;

/**
 * Created by Colten on 3/16/2016.
 */

@Controller
public class AjaxController {
    @RequestMapping("/ajax")
    public ModelAndView helloAjaxTest(){
        return new ModelAndView("ajx", "message", "Hello!");
    }

    @RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
    public @ResponseBody
    String getTime() {
        TestGroups tg = new TestGroups();

        Gson gson = new Gson();
        String result = gson.toJson(tg.getGroups().get(0));
        return result;
    }

}
