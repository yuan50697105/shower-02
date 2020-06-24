package com.idea.shower.security;

import lombok.*;

import java.util.List;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-31 16:07
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
    @NonNull
    private Long id;
    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    private List<String> roles;

    private List<String> permissions;

}
