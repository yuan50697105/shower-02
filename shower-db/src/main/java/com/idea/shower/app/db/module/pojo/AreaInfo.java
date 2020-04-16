package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import lombok.*;

import java.io.Serializable;

/**
 * 区域信息
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AreaInfo extends BaseDbEntity implements Serializable {
    /**
     * 区域名称
     */
    private String name;

    /**
     * 区域编号
     */
    private String code;

    private static final long serialVersionUID = 1L;

    public static AreaInfoBuilder builder() {
        return new AreaInfoBuilder();
    }
}