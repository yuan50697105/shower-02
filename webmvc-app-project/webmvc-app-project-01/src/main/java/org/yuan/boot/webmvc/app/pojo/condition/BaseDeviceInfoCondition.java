package org.yuan.boot.webmvc.app.pojo.condition;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.yuan.boot.db.pojo.AbstractBaseCondition;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuanez
 * @create: 2020-01-13 15:04
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public final class BaseDeviceInfoCondition extends AbstractBaseCondition {
    private Long id;
    private List<Long> ids;
    private String value;
    private String code;
    private String name;
    private Integer enabled;

    public BaseDeviceInfoCondition() {
    }

    public BaseDeviceInfoCondition(int page, int size) {
        super(page, size);
    }

    @Builder
    public BaseDeviceInfoCondition(int page, int size, Long id, List<Long> ids, String value, String code, String name, Integer enabled) {
        super(page, size);
        this.id = id;
        this.ids = ids;
        this.value = value;
        this.code = code;
        this.name = name;
        this.enabled = enabled;
    }
}
