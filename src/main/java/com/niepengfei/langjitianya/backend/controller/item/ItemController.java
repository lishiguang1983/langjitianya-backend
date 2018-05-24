package com.niepengfei.langjitianya.backend.controller.item;

import com.niepengfei.langjitianya.backend.remote.item.ItemRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jack
 */
@RestController
public class ItemController {

    @Autowired
    private ItemRemoteService itemRemoteService;

    @GetMapping(value = "/item/get.json",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object getItem(@RequestParam(value = "id",required = true,defaultValue = "1") Long id){
        Object itemDto = itemRemoteService.getItem(id);
        return itemDto;
    }
}
