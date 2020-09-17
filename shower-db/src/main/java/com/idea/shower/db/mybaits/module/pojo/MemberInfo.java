package com.idea.shower.db.mybaits.module.pojo;

<<<<<<< HEAD
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
=======
import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import java.util.Date;
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 会员信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfo extends BaseDbEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATOR = "creator";
    public static final String COL_UPDATER = "updater";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_CUSTOMER_ID = "customer_id";
    public static final String COL_CUSTOMER_NICK_NAME = "customer_nick_name";
    public static final String COL_CUSTOMER_OPEN_ID = "customer_open_id";
    public static final String COL_CUSTOMER_UNION_ID = "customer_union_id";
    public static final String COL_TYPE = "type";
    public static final String COL_CODE = "code";
    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 客户昵称
     */
    private String customerNickName;

    /**
     * 客户微信openId
     */
    private String customerOpenId;

    /**
     * 客户UNIONID
     */
    private String customerUnionId;

    /**
     * 客户类型
     */
    private Integer type;

    /**
     * 会员编号
     */
    private String code;
<<<<<<< HEAD

    public void copyFromByOptions(BaseDbEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
    }
=======
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
}