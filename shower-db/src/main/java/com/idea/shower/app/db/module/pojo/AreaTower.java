package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 区域楼宇信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AreaTower extends BaseDbEntity {
    private static final long serialVersionUID = 1L;
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

    public static AreaTowerBuilder builder() {
        return new AreaTowerBuilder();
    }
}