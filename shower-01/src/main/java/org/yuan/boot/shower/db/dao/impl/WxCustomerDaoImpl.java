package org.yuan.boot.shower.db.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.shower.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.shower.db.dao.WxCustomerDao;
import org.yuan.boot.shower.db.mapper.WxCustomerMapper;
import org.yuan.boot.shower.db.pojo.WxCustomer;
import org.yuan.boot.shower.db.pojo.WxCustomerExample;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:14
 */
@Component
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class, propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class WxCustomerDaoImpl extends BaseDaoImpl<WxCustomer, WxCustomerMapper> implements WxCustomerDao {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveWxCustomer(WxCustomer wxCustomer) {
        String unionId = wxCustomer.getUnionId();
        if (checkWxCustomer(unionId)) {
            baseMapper().updateByPrimaryKeySelective(wxCustomer);
        } else {
            baseMapper().insertSelective(wxCustomer);
        }
    }

    @Override
    public boolean checkWxCustomer(String unionId) {
        WxCustomerExample example = new WxCustomerExample();
        example.or().andUnionIdEqualTo(unionId);
        return baseMapper().countByExample(example) > 0;
    }


}