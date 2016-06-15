package retail.domain.entity;

import retail.annotation.Jdoc;

import java.util.Date;

/**
 * Created by LiuYu on 2016/6/14.
 */
public class Dictionary {
    @Jdoc(value = "销售毛补", doc = "毛利补偿方式: 销售毛补、库存毛补")
    private String compensateRawWay;
    @Jdoc(value = "按EA补偿: 0.5元", doc = "毛利补偿方式具体细节")
    private String compensateRawWayDetail;

    /*
    * 审批相关的字典
    * */
    @Jdoc(value = "采购经理总监审批", doc = "审批节点名称")
    private String nodeName;
    @Jdoc(value="1465885614000",doc="任务开始时间")
    private Date taskBeginTime;
    @Jdoc(value="1465885614000",doc="审批完成时间")
    private Date examineFinishTime;
    @Jdoc(value="审批已完成",doc="审批状态")
    private String examineStatus;
    @Jdoc(value="同意",doc="审批意见")
    private String examineAdvice;
}
