package retail.domain.vo;

import retail.annotation.Jdoc;

import java.util.List;

/**
 * Created by LiuYu on 2016/6/14.
 */
public class ContractGoodsVO {
    /**主键*/
    @Jdoc(value = "1", doc = "主键ID")
    private Integer id;
    /**档期号*/
    @Jdoc(value = "BL6031", doc = "档期号")
    private String scheduleNo;
    /**商品编码*/
    @Jdoc(value = "51922", doc = "商品编号")
    private String goodsNo;
    /**商品名称*/
    @Jdoc(value = "燕京330ml精品听啤", doc = "商品名称")
    private String goodsName;
    /**供应商*/
    @Jdoc(value = "300702北京燕京啤酒股份有限公司（精品）", doc = "供商")
    private String supplier;
    /**执行时间*/
    @Jdoc(value = "2016.5.4-2016.5.10", doc = "执行时间")
    private String executeDate;
    /**协议号*/
    @Jdoc(value = "2016020322", doc = "协议号")
    private String protoNo;
    /**状态 0-"未发送"1-"待确认",2- "执行中",3-"审批中",4-"未通过",5-"待执行",6-"已结束" */
    @Jdoc(value = "0", doc = "状态")
    private Integer theContractStatus;
    /**毛利补偿类型 0-"销售毛利补偿"1-"库存毛利补偿"**/
    @Jdoc(value = "0", doc = "毛利补偿类型")
    private String maoCompensateType;
    /**毛利补偿描述**/
    @Jdoc(value = "按销售额全额补偿：\n" +
            "0-10000元 折扣率 1%\n" +
            "10000元-50000元 0.9%\n" +
            "50000元以上 0.8%\n", doc = "毛利补偿描述")
    private String maoCompensateDesc;
    /**促销门店组*/
    @Jdoc(value = "PF01,PF02,PF03,PF11,PH01,PH11,PH31", doc = "门店组")
    private List<String> shopsGroup;
    /**促销门店*/
    @Jdoc(value = "1457,1464,1465", doc = "门店")
    private List<String> shops;
    /**排除门店*/
    @Jdoc(value = "1492,1505", doc = "排除门店")
    private List<String> excludeShops;
    /**异常描述**/
    @Jdoc(value = "查无此档期号", doc = "异常描述")
    private String exceptionDesc;
    /**异常类型 0-"无异常"1-"需要处理的异常"2-"可忽略的异常"**/
    @Jdoc(value = "0", doc = "异常类型")
    private Integer exceptionType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getExecuteDate() {
        return executeDate;
    }

    public void setExecuteDate(String executeDate) {
        this.executeDate = executeDate;
    }

    public String getProtoNo() {
        return protoNo;
    }

    public void setProtoNo(String protoNo) {
        this.protoNo = protoNo;
    }

    public Integer getTheContractStatus() {
        return theContractStatus;
    }

    public void setTheContractStatus(Integer theContractStatus) {
        this.theContractStatus = theContractStatus;
    }

    public String getMaoCompensateType() {
        return maoCompensateType;
    }

    public void setMaoCompensateType(String maoCompensateType) {
        this.maoCompensateType = maoCompensateType;
    }

    public String getMaoCompensateDesc() {
        return maoCompensateDesc;
    }

    public void setMaoCompensateDesc(String maoCompensateDesc) {
        this.maoCompensateDesc = maoCompensateDesc;
    }

    public List<String> getShopsGroup() {
        return shopsGroup;
    }

    public void setShopsGroup(List<String> shopsGroup) {
        this.shopsGroup = shopsGroup;
    }

    public List<String> getShops() {
        return shops;
    }

    public void setShops(List<String> shops) {
        this.shops = shops;
    }

    public List<String> getExcludeShops() {
        return excludeShops;
    }

    public void setExcludeShops(List<String> excludeShops) {
        this.excludeShops = excludeShops;
    }

    public String getExceptionDesc() {
        return exceptionDesc;
    }

    public void setExceptionDesc(String exceptionDesc) {
        this.exceptionDesc = exceptionDesc;
    }

    public Integer getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(Integer exceptionType) {
        this.exceptionType = exceptionType;
    }

}
