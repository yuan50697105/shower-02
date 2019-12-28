package org.yuan.boot.webmvc.app.service;

import com.github.pagehelper.PageInfo;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.db.service.BaseService;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-28 12:20
 */
public interface SysRoleService extends BaseService<SysRole> {
    /**
     * 分页查询
     *
     * @param condition 条件
     * @return 分页
     */
    PageInfo<SysRole> selectPage(SysRoleCondition condition);

    /**
     * @param condition
     * @return
     */
    List<SysRole> selectList(SysRoleCondition condition);

    Optional<SysRole> selectOne(SysRole sysRole);

    Optional<SysRole> selectById(Long id);

    void saveVo(SysRoleVo sysRoleVo);

    void modifyVo(SysRoleVo sysRoleVo);

    void delete(Long id);
}