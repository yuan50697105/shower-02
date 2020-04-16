package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 区域信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AreaInfo extends BaseDbEntity {
    private static final long serialVersionUID = 1L;
    /**
     * 区域名称
     */
    private String name;

    /**
     * 区域编号
     */
    private String code;

    public static AreaInfoBuilder builder() {
        return new AreaInfoBuilder();
    }
}