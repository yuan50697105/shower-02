package com.idea.shower.db.mybaits.module.pojo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import io.renren.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * customer_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfo extends BaseEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATOR = "creator";
    public static final String COL_UPDATER = "updater";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_OPEN_ID = "open_id";
    public static final String COL_UNION_ID = "union_id";
    public static final String COL_NICK_NAME = "nick_name";
    public static final String COL_GENDER = "gender";
    public static final String COL_PHONE_NUM = "phone_num";
    /**
     * 用户微信OpenId
     */
    private String openId;

    /**
     * 用户微信UNIONID（未使用）
     */
    private String unionId;

    /**
     * 用户微信昵称
     */
    private String nickName;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 电话
     */
    private String phoneNum;

    public void copyFromByOptions(BaseDbEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
    }
}