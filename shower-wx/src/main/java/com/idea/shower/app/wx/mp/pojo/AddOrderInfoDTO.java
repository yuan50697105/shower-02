package com.idea.shower.app.wx.mp.pojo;

import com.idea.shower.app.db.module.pojo.OrderInfo;
import com.idea.shower.app.db.module.pojo.OrderItem;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-03-28 19:08
 */
@Data
@Builder
public class AddOrderInfoDTO {
    private OrderInfo orderInfo;
    private List<OrderItem> orderItems;
}