package retail.domain;

import retail.annotation.Jdoc;

/**
 * Created by LiuYu on 2016/6/13.
 */
public class Test {

    @Jdoc(value="nihaoa",doc="你好")
    private String nihao;

    public String getNihao() {
        return nihao;
    }

    public void setNihao(String nihao) {
        this.nihao = nihao;
    }
}
