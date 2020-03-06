package com.casting.service.impl;

import com.casting.common.pojo.EasyUiDataGridResult;
import com.casting.mapper.TbItemMapper;
import com.casting.pojo.TbItem;
import com.casting.pojo.TbItemExample;
import com.casting.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        return tbItemMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public EasyUiDataGridResult page(int pageNum, int pageSize) {
        //设置分页信息
        PageHelper.startPage(pageNum,pageSize);
        //执行查询
        List<TbItem> tbItems = tbItemMapper.selectByExample(new TbItemExample());
        //取分页信息
        PageInfo<TbItem> tbItemPageInfo = new PageInfo<>(tbItems);
        //可以通过pageInfo获取总条数

        return new EasyUiDataGridResult(tbItemPageInfo.getTotal(),tbItems);
    }
}
