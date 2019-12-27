package org.yuan.boot.webmvc.db.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.db.core.BaseCoreEntity;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseEntity<T> extends BaseCoreEntity<T> {
    @TableId(type = IdType.AUTO)
    private Long id;

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }
}
