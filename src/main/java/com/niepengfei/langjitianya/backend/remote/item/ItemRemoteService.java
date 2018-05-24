package com.niepengfei.langjitianya.backend.remote.item;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "langjitianya-itemservice")
public interface ItemRemoteService {

    @GetMapping(value = "/item/get.json")
    Object getItem(@RequestParam(value = "id") Long id);

}
