package org.yuan.boot.webmvc.app.service;

import com.github.pagehelper.PageInfo;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.db.service.BaseService;

import java.util.List;
import java.util.Optional;

/**
 * @author yuane
 */
public interface SysUserService extends BaseService<SysUser> {
    /**
     * 保存用户
     *
     * @param sysUserVo 用户实体VO
     */
    void save(SysUserVo sysUserVo);

    /**
     * 修改用户
     *
     * @param sysUserVo 用户实体VO
     */
    void modify(SysUserVo sysUserVo);

    /**
     * 删除用户
     *
     * @param id 主键
     */
    void delete(Long id);

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 用户信息
     */
    Optional<SysUser> selectById(Long id);

    /**
     * 全等查询
     *
     * @param sysUser 用户
     * @return 用户
     */
    Optional<SysUser> selectOne(SysUser sysUser);

    /**
     * 条件列表查询
     *
     * @param condition 条件
     * @return 用户列表
     */
    List<SysUser> selectList(SysUserCondition condition);

    /**
     * 分页查询
     *
     * @param condition 条件
     * @return 分页结果
     */
    PageInfo<SysUser> selectPage(SysUserCondition condition);
}
