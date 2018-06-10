package com.niepengfei.langjitianya.backend.controller.item;

import com.niepengfei.langjitianya.backend.remote.item.ItemRemoteService;
import com.niepengfei.langjitianya.backend.utils.item.ItemVoConvertUtils;
import com.niepengfei.langjitianya.backend.vo.item.ItemVO;
import com.niepengfei.langjitianya.common.easyui.EUDataGridResult;
import com.niepengfei.langjitianya.itemservice.share.bo.item.ItemBO;
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
    public ItemVO getItem(@RequestParam(value = "id",required = true,defaultValue = "1") Long id){
        ItemBO item = itemRemoteService.getItem(id);
        return ItemVoConvertUtils.convertToVo(item);
    }

    @GetMapping(value = "/item/list.json",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public EUDataGridResult getItemList(@RequestParam(value = "page",defaultValue = "1")Integer page, @RequestParam(value = "rows",defaultValue = "10")Integer rows) {
        EUDataGridResult gridResult = itemRemoteService.getItemList(page, rows);
        return gridResult;
    }
}
