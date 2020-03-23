package com.idea.shower.app.wx.mp.util;

/**
 * 维护用户token
 * @author wcq
 * @title: UserTokenManager
 * @projectName shower-01
 * @date 2020/3/2315:40
 */
public class UserTokenManager {
    public static String generateToken(Long id) {
        JwtHelper jwtHelper = new JwtHelper();
        return jwtHelper.createToken(id);
    }
    public static Integer getUserId(String token) {
        JwtHelper jwtHelper = new JwtHelper();
        Integer userId = jwtHelper.verifyTokenAndGetUserId(token);
        if(userId == null || userId == 0){
            return null;
        }
        return userId;
    }
}
