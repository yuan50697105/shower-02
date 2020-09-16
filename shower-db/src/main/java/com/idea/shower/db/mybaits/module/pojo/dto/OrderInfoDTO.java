package com.idea.shower.db.mybaits.module.pojo.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

import java.math.BigDecimal;

 /**  
 * <p>
 * Title: ${file_name}
 * </p>  
 * <p>
 * Description: order_info
 * </p>  
 * 
 * @author finch  
 * @email  2410015564@qq.com  
 * @date   2020-08-12 ${time} 
 * @version 1.0.0
*/
@Data
public class OrderInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	private Long id;

	private Date createDate;

	private Date updateDate;

	private String orderNo;

	private Integer type;

	private Long customerId;

	private String customerOpenId;

	private String customerUnionId;

	private String deviceCode;

	private Long deviceId;

	private BigDecimal totalPrice;

	private Integer status;

	private Date useStartTime;

	private Date useEndTime;

	private String transactionId;


}