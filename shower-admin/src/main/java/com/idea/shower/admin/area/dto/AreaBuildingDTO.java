package com.idea.shower.admin.area.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


 /**  
 * <p>
 * Title: ${file_name}
 * </p>  
 * <p>
 * Description: 楼宇信息
 * </p>  
 * 
 * @author finch  
 * @email  2410015564@qq.com  
 * @date   2020-08-12 ${time} 
 * @version 1.0.0
*/
@Data
public class AreaBuildingDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	private Long id;

	private Date createTime;

	private Date updateTime;

	private String createUser;

	private String updateUser;

	private String name;

	private String code;

	private Long areaId;


}