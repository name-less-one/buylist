package com.buylist.domain.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.buylist.domain.dao.BuyListInfoDao;
import com.buylist.domain.entity.BuyListInfo;

@Service
public class BuyListService {

    final static Logger log = LogManager.getLogger(BuyListService.class);

    private BuyListInfoDao buyListInfoDao;
    
    public BuyListService(BuyListInfoDao buyListInfoDao) {
        this.buyListInfoDao = buyListInfoDao;
    }
    
    public List<BuyListInfo> getBuyList(String userId) {
        // DBから検索する
        List<BuyListInfo> userInfoList = buyListInfoDao.search(userId);
        
        return userInfoList;
    }
}
