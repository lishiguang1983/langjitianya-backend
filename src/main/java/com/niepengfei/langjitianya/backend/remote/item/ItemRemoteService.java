package com.niepengfei.langjitianya.backend.remote.item;

import com.niepengfei.langjitianya.itemservice.share.service.item.ItemShareService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author Jack
 */
@FeignClient(value= "langjitianya-itemservice")
public interface ItemRemoteService extends ItemShareService {


}
