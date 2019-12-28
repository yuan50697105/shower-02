package org.yuan.boot.webmvc.app.pojo.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-28 12:16
 */
@Data
public class SysRoleExcel {
    /**
     * name
     */
    @Excel(name = "角色名称", isImportField = "true")
    private String name;
    /**
     * createUser
     */
    @Excel(name = "创建人")
    private String createUser;
    /**
     * createTime
     */
    @Excel(name = "创建时间", format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /**
     * enabled
     */
    @Excel(name = "启用状态", replace = {"启用_1", "停用_0"})
    private Integer enabled;
}