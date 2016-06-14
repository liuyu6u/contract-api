package retail.domain.example.subs;

import retail.annotation.Jdoc;

/**
 * Created by LiuYu on 2016/6/14.
 */
public class Machine {

    @Jdoc(value="铁",doc="制作材料")
    private String madeOf;

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }
}
