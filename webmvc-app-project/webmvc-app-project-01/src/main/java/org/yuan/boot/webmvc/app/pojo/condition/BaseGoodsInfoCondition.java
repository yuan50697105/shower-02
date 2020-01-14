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
 * @create: 2020-01-13 15:00
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public final class BaseGoodsInfoCondition extends AbstractBaseCondition {
    private Long id;
    private List<Long> ids;
    private String value;
    private String name;
    private String code;
    private Integer enabled;

    public BaseGoodsInfoCondition() {
    }

    public BaseGoodsInfoCondition(int page, int size) {
        super(page, size);
    }

    @Builder
    public BaseGoodsInfoCondition(int page, int size, Long id, List<Long> ids, String value, String name, String code, Integer enabled) {
        super(page, size);
        this.id = id;
        this.ids = ids;
        this.value = value;
        this.name = name;
        this.code = code;
        this.enabled = enabled;
    }
}
