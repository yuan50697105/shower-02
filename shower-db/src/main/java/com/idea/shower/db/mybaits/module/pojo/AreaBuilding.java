package com.idea.shower.db.mybaits.module.pojo;

import com.idea.shower.db.mybaits.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 楼宇信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AreaBuilding extends BaseDbEntity {
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