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
 * 设备运行记录
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceRecord extends BaseDbEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATOR = "creator";
    public static final String COL_UPDATER = "updater";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_DEVICE_ID = "device_id";
    public static final String COL_DEVICE_CODE = "device_code";
    public static final String COL_TYPE = "type";
    public static final String COL_CONTENT = "content";
    /**
     * 设备ID
     */
    private Long deviceId;

    /**
     * 设备编号
     */
    private String deviceCode;

    /**
     * 操作类型
     */
    private Integer type;

    /**
     * 详情
     */
    private String content;
<<<<<<< HEAD

    public void copyFromByOptions(BaseDbEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
    }
=======
>>>>>>> a178c58e5809b456110adbffef77878d464c4e92
}