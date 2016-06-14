package retail.domain.example.subs;

import retail.annotation.Jdoc;

/**
 * Created by LiuYu on 2016/6/13.
 */
public class Component{

    @Jdoc(value="主板", doc="组件名称")
    private String compName;

    @Jdoc(value="455", doc="组件的价格")
    private String price;

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
