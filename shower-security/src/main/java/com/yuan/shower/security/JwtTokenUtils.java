package com.yuan.shower.security;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: boot-01
 * @description:
 * @author: yuane
 * @create: 2020-05-31 16:07
 */
public class JwtTokenUtils {

    public static final String TOKEN_HEADER = "X-Token";
    public static final String TOKEN_PREFIX = "";
    public static final String TOKEN = "token";
    public static final String SUBJECT = "congge";

    public static final long EXPIRITION = 1000 * 24 * 60 * 60 * 7;

    public static final String APPSECRET_KEY = "congge_secret";
    public static final String ID_CLAIMS = "userId";
    private static final String ROLE_CLAIMS = "role";

    public static String generateJsonWebToken(User user) {

        if (user.getId() == null || user.getUsername() == null) {
            return null;
        }

        Map<String, Object> map = new HashMap<>();
        map.put(ROLE_CLAIMS, JSONUtil.toJsonStr(user.getRoles()));

        String token = Jwts
                .builder()
                .setSubject(SUBJECT)
                .setClaims(map)
                .claim("id", user.getId())
                .claim("username", user.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRITION))
                .signWith(SignatureAlgorithm.HS256, APPSECRET_KEY).compact();
        return token;
    }

    /**
     * 生成token
     *
     * @param username
     * @param role
     * @return
     */
    public static String createToken(Long id, String username, String role) {

        Map<String, Object> map = new HashMap<>();
        map.put(ROLE_CLAIMS, role);
        map.put(ID_CLAIMS, id);
        String token = Jwts
                .builder()
                .setSubject(username)
                .setClaims(map)
                .claim("username", username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRITION))
                .signWith(SignatureAlgorithm.HS256, APPSECRET_KEY).compact();
        return token;
    }

    public static String createToken(Long id, String username, List<String> role) {

        Map<String, Object> map = new HashMap<>();
        map.put(ROLE_CLAIMS, role);
        map.put(ID_CLAIMS, id);
        String token = Jwts
                .builder()
                .setSubject(username)
                .setClaims(map)
                .claim("username", username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRITION))
                .signWith(SignatureAlgorithm.HS256, APPSECRET_KEY).compact();
        return token;
    }

    public static Claims checkJWT(String token) {
        try {
            final Claims claims = Jwts.parser().setSigningKey(APPSECRET_KEY).parseClaimsJws(token).getBody();
            return claims;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取用户名
     *
     * @param token
     * @return
     */
    public static String getUsername(String token) {
        Claims claims = Jwts.parser().setSigningKey(APPSECRET_KEY).parseClaimsJws(token).getBody();
        return claims.get("username").toString();
    }

    /**
     * 获取用户角色
     *
     * @param token
     * @return
     */
    public static List<String> getUserRole(String token) {
        Claims claims = Jwts.parser().setSigningKey(APPSECRET_KEY).parseClaimsJws(token).getBody();
        JSONArray jsonArray = JSONUtil.parseArray(claims.get(ROLE_CLAIMS));
        return JSONUtil.toList(jsonArray, String.class);
    }

    public static Long getUserId(String TOKEN) {
        Claims claims = Jwts.parser().setSigningKey(APPSECRET_KEY).parseClaimsJws(TOKEN).getBody();
        return (Long) claims.get(ID_CLAIMS);
    }

    /**
     * 是否过期
     *
     * @param token
     * @return
     */
    public static boolean isExpiration(String token) {
        Claims claims = Jwts.parser().setSigningKey(APPSECRET_KEY).parseClaimsJws(token).getBody();
        return claims.getExpiration().before(new Date());
    }

//    public static void main(String[] args) {
//        String name = "acong";
//        String role = "rol";
//        String token = createToken(name, role);
//        System.out.println(token);
//
//        Claims claims = checkJWT(token);
//        System.out.println(claims.get("username"));
//
//        System.out.println(getUsername(token));
//        System.out.println(getUserRole(token));
//        System.out.println(isExpiration(token));
//
//    }


    /**
     * eyJhbGciOiJIUzI1NiJ9.
     * eyJzdWIiOiJjb25nZ2UiLCJpZCI6IjExMDExIiwibmFtZSI6Im51b3dlaXNpa2kiLCJpbWciOiJ3d3cudW9rby5jb20vMS5wbmciLCJpYXQiOjE1NTQ5OTI1NzksImV4cCI6MTU1NTU5NzM3OX0.
     * 6DJ9En-UBcTiMRldZeevJq3e1NxJgOWryUyim4_-tEE
     *
     * @param args
     */

	/*public static void main(String[] args) {

		Users user = new Users();
		user.setId("11011");
		user.setUserName("nuoweisiki");
		user.setFaceImage("www.uoko.com/1.png");
		String token = generateJsonWebToken(user);

		System.out.println(token);

		Claims claims = checkJWT(token);
		if (claims != null) {
			String id = claims.get("id").toString();
			String name = claims.get("name").toString();
			String img = claims.get("img").toString();

			String rol = claims.get("rol").toString();

			System.out.println("id:" + id);
			System.out.println("name:" + name);
			System.out.println("img:" + img);

			System.out.println("rol:" + rol);



		}

	}*/

}
