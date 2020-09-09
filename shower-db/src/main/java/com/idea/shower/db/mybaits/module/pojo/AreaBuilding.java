package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import lombok.*;

/**
 * 楼宇信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AreaBuilding extends BaseDbEntity {
    public static final String COL_ID = "id";
    public static final String COL_CREATE_DATE = "create_date";
    public static final String COL_UPDATE_DATE = "update_date";
    public static final String COL_CREATOR = "creator";
    public static final String COL_UPDATER = "updater";
    public static final String COL_DEL_FLAG = "del_flag";
    public static final String COL_NAME = "name";
    public static final String COL_CODE = "code";
    public static final String COL_AREA_ID = "area_id";
    private static final long serialVersionUID = 1L;
    private String delFlag;

    /**
     * 楼宇名称
     */
    private String name;

    /**
     * 楼宇编号
     */
    private String code;

    /**
     * 所属区域ID
     */
    private Long areaId;
}