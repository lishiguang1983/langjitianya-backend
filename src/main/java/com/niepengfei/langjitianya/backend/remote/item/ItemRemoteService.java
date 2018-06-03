package com.niepengfei.langjitianya.backend.remote.item;

import com.niepengfei.langjitianya.common.easyui.EUDataGridResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "langjitianya-itemservice")
public interface ItemRemoteService {

    @GetMapping(value = "/item/get.json")
    Object getItem(@RequestParam(value = "id") Long id);

    @GetMapping(value = "/item/list.json",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    EUDataGridResult getItemList(@RequestParam(value = "page",defaultValue = "1")Integer page, @RequestParam(value = "rows",defaultValue = "10")Integer rows);

}
