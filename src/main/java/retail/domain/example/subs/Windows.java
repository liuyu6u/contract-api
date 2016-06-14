package retail.domain.example.subs;

import retail.annotation.Jdoc;

/**
 * Created by LiuYu on 2016/6/14.
 */
public class Windows {

    @Jdoc(value="windows操作系统",doc = "操作系统名称")
    private String osName;

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }
}
