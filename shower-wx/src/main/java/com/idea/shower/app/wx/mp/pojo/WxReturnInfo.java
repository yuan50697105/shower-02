package com.idea.shower.app.wx.mp.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: my-shower-01
 * @description:
 * @author: yuane
 * @create: 2020-02-14 22:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WxReturnInfo {
    private String return_code;
    private String return_msg;
}