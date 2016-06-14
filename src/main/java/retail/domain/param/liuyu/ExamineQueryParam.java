package retail.domain.param.liuyu;

import retail.annotation.Jdoc;
import retail.domain.entity.ContractGoodsEntity;

import java.util.Date;

/**
 * 344 档期毛补审批筛选接口设计调
 * Created by LiuYu on 2016/6/14.
 */
public class ExamineQueryParam {
    /**
     * 档期号
     */
    @Jdoc(refClz=ContractGoodsEntity.class,refField="scheduleNo")
    private String scheduleNo;
    /**
     * 执行开始时间
     */
    @Jdoc(refClz=ContractGoodsEntity.class,refField="executeStart")
    private Date executeStart;
    /**
     * 执行结束时间
     */
    @Jdoc(refClz=ContractGoodsEntity.class,refField="executeEnd")
    private Date executeEnd;
    /**
     * 供应商卡号
     */
    @Jdoc(refClz=ContractGoodsEntity.class,refField="supplierCardNo")
    private String supplierCardNo;
    /**
     * 协议类型
     */
    @Jdoc(value="1",doc="1库存补 2销售补")
    private Integer protoType;
    /**
     * 商品编码
     */
    @Jdoc(refClz=ContractGoodsEntity.class,refField="goodsNo")
    private String goodsNo;
    /**
     * 协议号
     */
    @Jdoc(refClz=ContractGoodsEntity.class,refField="protoNo")
    private String protoNo;

    public String getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(String scheduleNo) {
        this.scheduleNo = scheduleNo;
    }

    public Date getExecuteStart() {
        return executeStart;
    }

    public void setExecuteStart(Date executeStart) {
        this.executeStart = executeStart;
    }

    public Date getExecuteEnd() {
        return executeEnd;
    }

    public void setExecuteEnd(Date executeEnd) {
        this.executeEnd = executeEnd;
    }

    public String getSupplierCardNo() {
        return supplierCardNo;
    }

    public void setSupplierCardNo(String supplierCardNo) {
        this.supplierCardNo = supplierCardNo;
    }

    public Integer getProtoType() {
        return protoType;
    }

    public void setProtoType(Integer protoType) {
        this.protoType = protoType;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getProtoNo() {
        return protoNo;
    }

    public void setProtoNo(String protoNo) {
        this.protoNo = protoNo;
    }
}
