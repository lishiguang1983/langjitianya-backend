package com.niepengfei.langjitianya.backend.utils.item;

import com.niepengfei.langjitianya.backend.vo.item.ItemVO;
import com.niepengfei.langjitianya.itemservice.share.bo.item.ItemBO;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author Jack on May 19, 2018 7:47:59 PM
 */
public class ItemVoConvertUtils {

    /**
     * 转换ItemBO为ItemVO
     * @param itemBo  ItemBO
     * @return Item
     */
    public static ItemVO convertToVo(ItemBO itemBo){
        if (Objects.isNull(itemBo)) {
            return null;
        }
        ItemVO item = new ItemVO();
        item.setId(itemBo.getId());
        item.setTitle(itemBo.getTitle());
        item.setSellPoint(itemBo.getSellPoint());
        item.setPrice(itemBo.getPrice());
        item.setNum(itemBo.getNum());
        item.setBarcode(itemBo.getBarcode());
        item.setImage(itemBo.getImage());
        item.setCid(itemBo.getCid());
        item.setStatus(itemBo.getStatus());
        item.setCreated(itemBo.getCreated());
        item.setUpdated(itemBo.getUpdated());
        return item;
    }

    /**
     * 转换ItemVO为ItemBO
     * @param itemVo     ItemVO
     * @return ItemDTO
     */
    public static ItemBO convertToBo(ItemVO itemVo){
        if (Objects.isNull(itemVo)) {
            return null;
        }
        ItemBO itemBo = new ItemBO();
        itemBo.setId(itemVo.getId());
        itemBo.setTitle(itemVo.getTitle());
        itemBo.setSellPoint(itemVo.getSellPoint());
        itemBo.setPrice(itemVo.getPrice());
        itemBo.setNum(itemVo.getNum());
        itemBo.setBarcode(itemVo.getBarcode());
        itemBo.setImage(itemVo.getImage());
        itemBo.setCid(itemVo.getCid());
        itemBo.setStatus(itemVo.getStatus());
        itemBo.setCreated(itemVo.getCreated());
        itemBo.setUpdated(itemVo.getUpdated());
        return itemBo;
    }
    
    /**
     * 转换list
     */
    public static List<ItemVO> convertListToVo(List<ItemBO> list) {
        if (CollectionUtils.isEmpty(list)) {
            return Collections.emptyList();
        }
        List<ItemVO> listVo = new ArrayList<>(list.size());
        list.forEach(item -> {
            listVo.add(convertToVo(item));
        });
        return listVo;
     }

    /**
     * 转换list
     */
    public static List<ItemBO> convertListToBo(List<ItemVO> list) {
        if (CollectionUtils.isEmpty(list)) {
            return Collections.emptyList();
        }
        List<ItemBO> listBo = new ArrayList<>(list.size());
        list.forEach(itemBo -> {
            listBo.add(convertToBo(itemBo));
        });
        return listBo;
    }
}
