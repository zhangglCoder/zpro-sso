package cn.zpro.sso.app.dto;

public class ResponseMsg<T> {
    private boolean success;
    private T obj;
    private String error;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public ResponseMsg(boolean success, T obj) {
        this.success = success;
        this.obj = obj;
    }

    public ResponseMsg(String error) {
        this.success = false;
        this.error = error;
    }

    public ResponseMsg() {
    }
}
