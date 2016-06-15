package retail.domain.param.liuyu;

import retail.annotation.Jdoc;
import retail.domain.entity.ContractGoodsEntity;

/**
 * Created by LiuYu on 2016/6/14.
 */
public class ExamineFlowRecordsParam {
    @Jdoc(refClz = ContractGoodsEntity.class,refField = "id")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
