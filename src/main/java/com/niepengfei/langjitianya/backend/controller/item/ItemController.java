package com.niepengfei.langjitianya.backend.controller.item;

import com.niepengfei.langjitianya.backend.remote.item.ItemRemoteService;
import com.niepengfei.langjitianya.backend.vo.item.ItemVO;
import com.niepengfei.langjitianya.common.easyui.EUDataGridResult;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Jack
 */
@RestController
public class ItemController {

   // @Autowired
    //private ItemRemoteService itemRemoteService;

    @GetMapping(value = "/item/get.json",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object getItem(@RequestParam(value = "id",required = true,defaultValue = "1") Long id){
       // Object itemDto = itemRemoteService.getItem(id);
        return null;
    }






    @GetMapping(value = "/item/list.json",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public EUDataGridResult getItemList(@RequestParam(value = "page",defaultValue = "1")Integer page,
                                               @RequestParam(value = "rows",defaultValue = "10")Integer rows) {
        List<ItemVO> itemVOList = new ArrayList<>();
        ItemVO itemVO = new ItemVO();
        itemVO.setBarcode("");
        itemVO.setCreated(new Date());
        itemVO.setUpdated(new Date());
        itemVO.setStatus(1);
        itemVO.setId(1L);
        itemVO.setImage("ww");
        itemVO.setTitle("你好");
        itemVO.setCid(1L);
        itemVO.setBarcode("wwwww");
        itemVO.setSellPoint("你好");
        itemVO.setNum(1);
        itemVO.setPrice(1L);
        itemVO.setTitle("你好");
        itemVOList.add(itemVO);

        EUDataGridResult gridResult = new EUDataGridResult();
        gridResult.setTotal(1L);
        gridResult.setRows(itemVOList);
        return gridResult;
    }
}
