package cn.zpro.sso.app.vo;

public class UserVo {

    private String userId;

    private String userPwd;

    public UserVo() {
    }

    public UserVo(String userId, String userPwd) {
        this.userId = userId;
        this.userPwd = userPwd;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}
