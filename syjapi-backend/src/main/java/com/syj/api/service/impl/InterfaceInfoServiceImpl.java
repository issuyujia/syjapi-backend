package com.syj.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.syj.api.common.ErrorCode;
import com.syj.api.exception.BusinessException;
import com.syj.api.exception.ThrowUtils;
import com.syj.api.mapper.InterfaceInfoMapper;
import com.syj.api.model.entity.InterfaceInfo;
import com.syj.api.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * @author 山兮
 * @description 针对表【interface_info(接口信息)】的数据库操作Service实现
 * @createDate 2024-11-17 14:34:46
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
        implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();

        // 创建时，参数不能为空
        if (add) {
            ThrowUtils.throwIf(StringUtils.isAnyBlank(name), ErrorCode.PARAMS_ERROR);
        }
        // 有参数则校验
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
}




