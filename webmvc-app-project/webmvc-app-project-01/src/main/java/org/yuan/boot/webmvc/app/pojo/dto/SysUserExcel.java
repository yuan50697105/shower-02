package org.yuan.boot.webmvc.app.pojo.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * @program: learning-demo-02
 * @description: 用户excel实体
 * @author: yuane
 * @create: 2019-12-28 11:19
 */
@Data
public class SysUserExcel {
    /**
     * username
     */
    @Excel(name = "用户名", isImportField = "true")
    @NotEmpty
    private String username;
    /**
     * realName
     */
    @Excel(name = "姓名", isImportField = "true")
    @NotEmpty
    private String realName;
    /**
     * nickName
     */
    @Excel(name = "昵称", isImportField = "true")
    @NotEmpty
    private String nickName;
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