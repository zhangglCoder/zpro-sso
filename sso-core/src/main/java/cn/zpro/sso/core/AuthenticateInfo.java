package cn.zpro.sso.core;

/**
 * 认证信息对象
 * @author dell
 */
public class AuthenticateInfo {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "AuthenticateInfo{" +
                "userId='" + userId + '\'' +
                '}';
    }
}
