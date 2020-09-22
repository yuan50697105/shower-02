package com.idea.shower.db.mybaits.module.pojo;

<<<<<<< HEAD
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
=======
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 用户反馈
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Feedback extends BaseDbEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_TIME = "create_time";
    public static final String COL_UPDATE_TIME = "update_time";
    public static final String COL_CREATE_USER = "create_user";
    public static final String COL_UPDATE_USER = "update_user";
    public static final String COL_CUSTOMER_ID = "customer_id";
    public static final String COL_TITLE = "title";
    public static final String COL_CONTENT = "content";
    public static final String COL_IMAGE = "image";
    public static final String COL_RESPOND_STATUS = "respond_status";
    public static final String COL_RESPOND_CONTENT = "respond_content";
    public static final String COL_RESPOND_TIME = "respond_time";
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 用户ID
     */
    private Long customerId;

    /**
     * 反馈标题
     */
    private String title;

    /**
     * 反馈内容
     */
    private String content;

    /**
     * 反馈图片路径
     */
    private String image;

    /**
     * 官方回复状态
     */
    private Integer respondStatus;

    /**
     * 官方回复内容
     */
    private String respondContent;

    /**
     * 官方回复时间
     */
    private Date respondTime;
<<<<<<< HEAD

    public void copyFromByOptions(BaseDbEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
    }
=======
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
}