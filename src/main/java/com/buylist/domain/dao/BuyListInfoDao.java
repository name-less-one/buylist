package com.buylist.domain.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.buylist.domain.entity.BuyListInfo;

@ConfigAutowireable
@Dao
public interface BuyListInfoDao {

    @Insert
    public int Insert(BuyListInfo entity);
    
    @Select
    public List<BuyListInfo> search(String userId);
}
