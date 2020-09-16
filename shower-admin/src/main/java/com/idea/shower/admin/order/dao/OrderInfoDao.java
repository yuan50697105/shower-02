package com.idea.shower.admin.order.dao;

import com.idea.shower.admin.order.dto.OrderInfoDTO;
import com.idea.shower.db.mybaits.module.pojo.OrderInfo;
import io.renren.common.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

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

     List<OrderInfoDTO> selectPageByChoices(Map<String, Object> params);
 }