package com.idea.shower.db.mybaits.module.pojo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

/**
 * device_info
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "device_info")
public class DeviceInfo extends BaseDbEntity {
    /**
     * 设备编号
     */
    @TableField(value = "code")
    private String code;

    /**
     * 产品编号
     */
    @TableField(value = "product_key")
    private String productKey;

    /**
     * 设备名称
     */
    @TableField(value = "device_name")
    private String deviceName;

    /**
     * 设备类型
     */
    @TableField(value = "`type`")
    private Integer type;

    /**
     * 定价编号
     */
    @TableField(value = "price_code")
    private String priceCode;

    /**
     * 启用状态(0:未启用；1已启用)
     */
    @TableField(value = "enabled")
    private Integer enabled;

    /**
     * 经度
     */
    @TableField(value = "longitude")
    private Double longitude;

    /**
     * 纬度
     */
    @TableField(value = "latitude")
    private Double latitude;

    /**
     * 区域ID
     */
    @TableField(value = "area_id")
    private Long areaId;

    /**
     * 区域名称
     */
    @TableField(value = "area_name")
    private String areaName;

    /**
     * 楼宇ID
     */
    @TableField(value = "building_id")
    private Long buildingId;

    /**
     * 楼宇名称
     */
    @TableField(value = "building_name")
    private String buildingName;

    /**
     * 设备图片
     */
    @TableField(value = "picture")
    private String picture;

    /**
     * 运行状态 0 可用 1 使用中
     */
    @TableField(value = "run_status")
    private Integer runStatus;

    @TableField(value = "picture_url")
    private String pictureUrl;

    public static final String COL_ID = "id";

    public static final String COL_CREATE_DATE = "create_date";

    public static final String COL_UPDATE_DATE = "update_date";

    public static final String COL_UPDATER = "updater";

    public static final String COL_CREATOR = "creator";

    public static final String COL_DEL_FLAG = "del_flag";

    public static final String COL_CODE = "code";

    public static final String COL_PRODUCT_KEY = "product_key";

    public static final String COL_DEVICE_NAME = "device_name";

    public static final String COL_TYPE = "type";

    public static final String COL_PRICE_CODE = "price_code";

    public static final String COL_ENABLED = "enabled";

    public static final String COL_LONGITUDE = "longitude";

    public static final String COL_LATITUDE = "latitude";

    public static final String COL_AREA_ID = "area_id";

    public static final String COL_AREA_NAME = "area_name";

    public static final String COL_BUILDING_ID = "building_id";

    public static final String COL_BUILDING_NAME = "building_name";

    public static final String COL_PICTURE = "picture";

    public static final String COL_RUN_STATUS = "run_status";

    public static final String COL_PICTURE_URL = "picture_url";

    public void copyFromByOptions(BaseDbEntity t, CopyOptions copyOptions) {
        BeanUtil.copyProperties(t, this, copyOptions);
    }
}