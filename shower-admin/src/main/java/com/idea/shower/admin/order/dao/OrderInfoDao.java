package com.idea.shower.admin.order.dao;

import com.idea.shower.app.db.module.pojo.OrderInfo;
import io.renren.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

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

@Mapper
public interface OrderInfoDao extends BaseDao<OrderInfo> {
	
}