package com.idea.shower.app.db.module.pojo;

import com.idea.shower.app.db.commons.pojo.BaseDbEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminPermission extends BaseDbEntity implements Serializable {
    /**
     * name
     */
    private String name;

    private static final long serialVersionUID = 1L;

    public static AdminPermissionBuilder builder() {
        return new AdminPermissionBuilder();
    }
}