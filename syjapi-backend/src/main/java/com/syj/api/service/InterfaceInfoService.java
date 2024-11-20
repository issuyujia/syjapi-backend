package com.syj.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.syj.api.model.entity.InterfaceInfo;
import com.syj.api.model.entity.Post;

/**
* @author 山兮
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-11-17 14:34:46
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param InterfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo InterfaceInfo, boolean add);
}
