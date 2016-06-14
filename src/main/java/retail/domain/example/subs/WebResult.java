package retail.domain.example.subs;

import retail.annotation.Jdoc;

/**
 * Created by LiuYu on 2016/6/14.
 */
public class WebResult<T> {

    public WebResult(T model) {
        this.model = model;
    }

    @Jdoc(value = "001",doc="返回的代码")
    private String code;

    @Jdoc(value="true",doc="是否成功")
    private boolean success;

    @Jdoc(value="请求成功!",doc="返回的消息")
    private String message;

    @Jdoc(doc="数据模型")
    private T model;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public<T> T getModel() {
        return (T)model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}
