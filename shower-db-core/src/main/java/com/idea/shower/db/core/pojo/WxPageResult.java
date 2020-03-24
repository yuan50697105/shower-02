package com.idea.shower.db.core.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxPageResult<T> {
    private Iterable<T> data;
    private long totalPages;

}
