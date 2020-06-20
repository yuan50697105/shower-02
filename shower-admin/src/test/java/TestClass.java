import ai.yue.library.base.view.Result;
import cn.hutool.json.JSONUtil;
import com.idea.shower.admin.ShowerAdminApplication;
import com.idea.shower.admin.admin.pojo.AdminUserVO;
import com.idea.shower.admin.admin.service.AdminUserBackService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-06-20 18:55
 */
@SpringBootTest(classes = ShowerAdminApplication.class)
public class TestClass {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    private AdminUserBackService adminUserBackService;

    @Test
    void name() {
        AdminUserVO vo = new AdminUserVO();
        vo.setUsername("admin");
        vo.setPassword("admin");
        vo.setName("管理员");
        vo.setRoleIds(Arrays.asList(1L));
        Result<?> result = adminUserBackService.add(vo);
        System.out.println("JSONUtil.toJsonPrettyStr(result) = " + JSONUtil.toJsonPrettyStr(result));
    }
}