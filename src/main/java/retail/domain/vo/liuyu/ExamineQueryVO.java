package retail.domain.vo.liuyu;

import retail.annotation.Jdoc;
import retail.domain.entity.ContractGoodsEntity;
import retail.domain.entity.Dictionary;

import java.util.Date;

/**
 * 344 档期毛补审批筛选接口设计调
 * Created by LiuYu on 2016/6/14.
 */
public class ExamineQueryVO {
    /**
     * 档期号
     */
    @Jdoc(refClz = ContractGoodsEntity.class, refField = "scheduleNo")
    private String scheduleNo;
    /**
     * 商品编码
     */
    @Jdoc(refClz = ContractGoodsEntity.class, refField = "goodsNo")
    private String goodsNo;
    /**
     * 商品名称
     */
    @Jdoc(refClz = ContractGoodsEntity.class, refField = "goodsName")
    private String goodsName;
    /**
     * 供应商卡号
     */
    @Jdoc(refClz = ContractGoodsEntity.class, refField = "supplierCardNo")
    private String supplierCardNo;
    /**
     * 供应商名称
     */
    @Jdoc(refClz = ContractGoodsEntity.class, refField = "supplierName")
    private String supplierName;
    /**
     * 执行开始时间
     */
    @Jdoc(refClz = ContractGoodsEntity.class, refField = "executeStart")
    private Date executeStart;
    /**
     * 执行结束时间
     */
    @Jdoc(refClz = ContractGoodsEntity.class, refField = "executeEnd")
    private Date executeEnd;
    /**
     * 协议号
     */
    @Jdoc(refClz = ContractGoodsEntity.class, refField = "protoNo")
    private String protoNo;
    /**
     *毛利补偿方式
     */
    @Jdoc(refClz = Dictionary.class,refField = "compensateRawWay")
    private String compensateRawWay;
    /**
     *毛利补偿方式具体细节
     */
    @Jdoc(refClz = Dictionary.class,refField = "compensateRawWayDetail")
    private String compensateRawWayDetail;
    /**
     * 促销门店组集合，以逗号分隔
     */
    @Jdoc(refClz=ContractGoodsEntity.class,refField="groupShops")
    private String groupShops;
    /**
     * 追加店铺号集合，以逗号分隔
     */
    @Jdoc(refClz=ContractGoodsEntity.class,refField="shops")
    private String shops;
    /**
     * 排除门店号集合，以逗号分隔
     */
    @Jdoc(refClz=ContractGoodsEntity.class,refField="outShops")
    private String outShops;

    public String getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(String scheduleNo) {
        this.scheduleNo = scheduleNo;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSupplierCardNo() {
        return supplierCardNo;
    }

    public void setSupplierCardNo(String supplierCardNo) {
        this.supplierCardNo = supplierCardNo;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public String getProtoNo() {
        return protoNo;
    }

    public void setProtoNo(String protoNo) {
        this.protoNo = protoNo;
    }

    public String getCompensateRawWay() {
        return compensateRawWay;
    }

    public void setCompensateRawWay(String compensateRawWay) {
        this.compensateRawWay = compensateRawWay;
    }

    public String getCompensateRawWayDetail() {
        return compensateRawWayDetail;
    }

    public void setCompensateRawWayDetail(String compensateRawWayDetail) {
        this.compensateRawWayDetail = compensateRawWayDetail;
    }

    public String getGroupShops() {
        return groupShops;
    }

    public void setGroupShops(String groupShops) {
        this.groupShops = groupShops;
    }

    public String getShops() {
        return shops;
    }

    public void setShops(String shops) {
        this.shops = shops;
    }

    public String getOutShops() {
        return outShops;
    }

    public void setOutShops(String outShops) {
        this.outShops = outShops;
    }
}
