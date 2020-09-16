package com.idea.shower.db.mybaits.module.pojo.ao;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
* <p>
* Title: ${file_name}
* </p>
* <p>
* Description: customer_info
* </p>
*
* @author finch
* @email  2410015564@qq.com
* @date   2020-09-16 ${time}
* @version 1.0.0
*/
@Data
public class CustomerInfoAo implements Serializable {
   private static final long serialVersionUID = 1L;

   private Long id;

   private Date createDate;

   private Date updateDate;

   private Long creator;

   private Long updater;

   private String delFlag;

   private String openId;

   private String unionId;

   private String nickName;

   private Integer gender;

   private String phoneNum;


}