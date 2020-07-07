package com.idea.shower.app.db.module.dao.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.idea.shower.app.db.module.mapper.AdminRoleRouteMapper;
import com.idea.shower.app.db.module.pojo.AdminRoleRouteExample;
import java.util.List;
import com.idea.shower.app.db.module.pojo.AdminRoleRoute;
import com.idea.shower.app.db.module.dao.AdminRoleRouteDao;
@Service
public class AdminRoleRouteDaoImpl implements AdminRoleRouteDao {

    @Resource
    private AdminRoleRouteMapper adminRoleRouteMapper;

    @Override
    public long countByExample(AdminRoleRouteExample example) {
        return adminRoleRouteMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AdminRoleRouteExample example) {
        return adminRoleRouteMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return adminRoleRouteMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AdminRoleRoute record) {
        return adminRoleRouteMapper.insert(record);
    }

    @Override
    public int insertSelective(AdminRoleRoute record) {
        return adminRoleRouteMapper.insertSelective(record);
    }

    @Override
    public List<AdminRoleRoute> selectByExample(AdminRoleRouteExample example) {
        return adminRoleRouteMapper.selectByExample(example);
    }

    @Override
    public AdminRoleRoute selectByPrimaryKey(Long id) {
        return adminRoleRouteMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(AdminRoleRoute record,AdminRoleRouteExample example) {
        return adminRoleRouteMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(AdminRoleRoute record,AdminRoleRouteExample example) {
        return adminRoleRouteMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(AdminRoleRoute record) {
        return adminRoleRouteMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(AdminRoleRoute record) {
        return adminRoleRouteMapper.updateByPrimaryKey(record);
    }

}
