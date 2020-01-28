package org.yuan.boot.shower.wx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.yuan.boot.shower.db.pojo.OrderInfo;
import org.yuan.boot.shower.db.pojo.OrderItem;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-28 13:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WxOrderInfoQueryResult {
    private OrderInfo orderInfo;
    private List<OrderItem> orderItems;
}