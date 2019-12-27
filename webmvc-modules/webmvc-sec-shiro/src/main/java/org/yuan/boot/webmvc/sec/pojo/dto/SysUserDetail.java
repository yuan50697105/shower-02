package org.yuan.boot.webmvc.sec.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Set;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-27 21:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class SysUserDetail {
    private Long id;
    private String username;
    private String password;
    private String realName;
    private String nickName;
    private Set<String> roles;
    private Set<String> permission;
    private Set<String> authorities;


}