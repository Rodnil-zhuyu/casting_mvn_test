package com.casting.service;

import com.casting.common.pojo.EasyUiDataGridResult;
import com.casting.pojo.TbItem;

public interface ItemService {
    /**
     * 根据商品id查询商品表
     * @param itemId
     * @return
     */
    public TbItem getItemById(long itemId);

    /**
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    public EasyUiDataGridResult page(int pageNum,int pageSize);
}
