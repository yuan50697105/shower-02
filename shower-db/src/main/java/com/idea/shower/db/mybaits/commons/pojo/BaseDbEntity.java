package com.idea.shower.db.mybaits.commons.pojo;

<<<<<<< HEAD
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
=======
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.idea.shower.db.mybaits.commons.interceptor.annotation.*;
import lombok.Data;
<<<<<<< HEAD

import java.util.Date;
import java.util.Map;
=======
import lombok.EqualsAndHashCode;

import java.util.Date;
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92

/**
 * @program: shower-01
 * @description: 数据表基础实体
 * @author: yuane
 * @create: 2020-01-20 16:24
 */
<<<<<<< HEAD
@Data
public class BaseDbEntity {
=======
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseDbEntity extends com.idea.shower.db.mybaits.base.pojo.BaseDbEntity {
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
    @Id
    @TableId
    private Long id;
    @CreateUser
    private String creator;
    @UpdateUser
    private String updater;
    @CreateTime
    private Date createDate;
    @UpdateTime
    private Date updateDate;
    @TableLogic(delval = "1", value = "0")
    private String delFlag;


<<<<<<< HEAD
    public void copyFromByOptions(BaseDbEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
    }

    public void copyFromByOptions(Map<?, ?> map, CopyOptions copyOptions) {
        BeanUtil.fillBeanWithMap(map, this, copyOptions);
    }

    public void copyFrom(BaseDbEntity t, String... ignoreProperties) {
        copyFromByOptions(t, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }

    public void copyFrom(Map<?, ?> map, String... ignoreProperties) {
        copyFromByOptions(map, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }
=======
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
}