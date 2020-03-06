package com.casting.controller;

import com.casting.common.pojo.EasyUiDataGridResult;
import com.casting.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/list")
    @ResponseBody
    public EasyUiDataGridResult page(Integer page,Integer rows){
        return itemService.page(page,rows);
    }

    /*@RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable long itemId){
        System.out.println(itemId);
        System.out.println(itemService);

        TbItem itemById = itemService.getItemById(itemId);
        System.out.println(itemById);
        return itemById;
    }*/

}
