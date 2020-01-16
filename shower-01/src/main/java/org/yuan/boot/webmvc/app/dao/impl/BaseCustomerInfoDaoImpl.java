package org.yuan.boot.webmvc.app.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.webmvc.app.dao.BaseCustomerInfoDao;
import org.yuan.boot.webmvc.app.mapper.BaseCustomerInfoMapper;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfoExample;
import org.yuan.boot.webmvc.app.pojo.condition.BaseCustomerInfoCondition;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-05 19:40
 */
@AllArgsConstructor
@Component
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class BaseCustomerInfoDaoImpl extends BaseDaoImpl<BaseCustomerInfo, BaseCustomerInfoMapper> implements BaseCustomerInfoDao {

    @Override
    public PageResult<BaseCustomerInfo> selectPage(BaseCustomerInfoCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        List<BaseCustomerInfo> customerInfos = baseMapper().selectByCondition(condition);
        return new PageResult<>(PageInfo.of(customerInfos));
    }

    @Override
    public List<BaseCustomerInfo> selectList(BaseCustomerInfoCondition condition) {
        return baseMapper().selectByCondition(condition);
    }

    @Override
    public Optional<BaseCustomerInfo> selectOne(BaseCustomerInfo customerInfo) {
        return Optional.ofNullable(baseMapper().selectOneByCondition(customerInfo));
    }

    @Override
    public Optional<BaseCustomerInfo> selectById(Long id) {
        return Optional.ofNullable(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(BaseCustomerInfo customerInfo) {
        customerInfo = customerInfo.setId(snowflake().nextId()).setCreateTime(new Date());
        baseMapper().insertSelective(customerInfo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(BaseCustomerInfo customerInfo) {
        customerInfo = customerInfo.setUpdateTime(new Date());
        baseMapper().updateByPrimaryKeySelective(customerInfo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long id) {
        baseMapper().deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(List<Long> ids) {
        BaseCustomerInfoExample example = new BaseCustomerInfoExample();
        example.or().andIdIn(ids);
        baseMapper().deleteByExample(example);
    }
}