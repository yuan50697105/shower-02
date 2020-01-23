package org.yuan.boot.shower.wx.pojo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-20 18:29
 */
@Data
public class WxOrderVO {
    @NotEmpty
    private Integer type;
    @NotEmpty
    private Long customerId;
    @NotEmpty
    private Integer deviceId;
    @NotEmpty(groups = {AddPrepay.class})
    private BigDecimal prepayDecimal;

    public interface AddPrepay {
    }


}