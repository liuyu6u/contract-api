package retail.domain.param.base;

import retail.annotation.Jdoc;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by LiuYu on 2016/6/14.
 */
public class ContractGoodsParam {

    /**
     * 档期号
     */
    @Jdoc(value= "BL6031", doc ="档期号")
    private String scheduleNo;
    /**
     * 商品编码
     */
    @Jdoc(value= "51922", doc ="商品编码")
    private String goodsNo;
    /**
     * 商品名称
     */
    @Jdoc(value= "燕京330ml精品听啤", doc ="商品名称")
    private String goodsName;
    /**
     * 供应商卡号
     */
    @Jdoc(value= "300702", doc ="供应商卡号")
    private String supplierCardNo;
    /**
     * 供应商名称
     */
    @Jdoc(value= "北京燕京啤酒股份有限公司（精品）", doc ="供应商名称")
    private String supplierName;
    /**
     * 是否票扣
     */
    @Jdoc(value= "1", doc ="是否票扣 1是2否")
    private Integer isTicketOff;
    /**
     * 执行开始时间
     */
    @Jdoc(value= "1465885614000", doc ="档期执行开始时间")
    private Date executeStart;
    /**
     * 执行结束时间
     */
    @Jdoc(value= "1465885614000", doc ="档期执行结束时间")
    private Date executeEnd;
    /**
     * 促销门店组集合，以逗号分隔
     */
    @Jdoc(value= "PF01,PF02,PF03,PF11,PH01,PH11,PH31", doc ="促销门店组集合，以逗号分隔")
    private String groupShops;
    /**
     * 追加店铺号集合，以逗号分隔
     */
    @Jdoc(value= "1457,1464,1465", doc ="追加店铺号集合，以逗号分隔")
    private String shops;
    /**
     * 排除门店号集合，以逗号分隔
     */
    @Jdoc(value= "1492,1505", doc ="排除门店号集合，以逗号分隔")
    private String outShops;
    /**
     * 销售毛利补偿方式 1按额补偿至 2按率补偿至 3按EA补偿4销售毛补按率补偿 5按率阶梯补偿-全额 6按率阶梯补偿-分段。库存毛利补偿 1 库存毛补
     */
    @Jdoc(value= "1", doc ="销售毛利补偿方式 1按额补偿至 2按率补偿至 3按EA补偿 4销售毛补按率补偿 5按率阶梯补偿-全额 6按率阶梯补偿-分段。库存毛利补偿 1 库存毛补")
    private Integer saleMaoCompensateWay;
    /**
     * 按额补偿至
     */
    @Jdoc(value= "3.21", doc ="按额补偿至")
    private BigDecimal toQuotaCompensate;
    /**
     * 按率补偿至
     */
    @Jdoc(value= "3.21", doc ="按率补偿至")
    private BigDecimal toRateCompensate;
    /**
     * 按率补偿%
     */
    @Jdoc(value= "0.55", doc ="按率补偿%")
    private BigDecimal rateCompensate;
    /**
     * 按EA补偿
     */
    @Jdoc(value= "3.21", doc ="按EA补偿")
    private BigDecimal eaCompensate;
    /**
     * 第一档起
     */
    @Jdoc(value= "100.00", doc ="第一档起")
    private BigDecimal firstStart;
    /**
     * 第一档止
     */
    @Jdoc(value= "150.00", doc ="第一档止")
    private BigDecimal firstEnd;
    /**
     * 第一档补偿率
     */
    @Jdoc(value= "0.01", doc ="第一档补偿率")
    private BigDecimal firstRate;
    /**
     * 第二档
     */
    @Jdoc(value= "150.00", doc ="第二档起")
    private BigDecimal secondStart;
    /**
     * 第二档止
     */
    @Jdoc(value= "200.00", doc ="第二档止")
    private BigDecimal secondEnd;
    /**
     * 第二档补偿率
     */
    @Jdoc(value= "0.02", doc ="第二档补偿率")
    private BigDecimal secondRate;
    /**
     * 第三档
     */
    @Jdoc(value= "200.00", doc ="第三档起")
    private BigDecimal thirdStart;
    /**
     * 第三档止
     */
    @Jdoc(value= "250.00", doc ="第三档止")
    private BigDecimal thirdEnd;
    /**
     * 第三档补偿率
     */
    @Jdoc(value= "0.03", doc ="第三档补偿率")
    private BigDecimal thirdRate;
    /**
     * 第四档
     */
    @Jdoc(value= "250.00", doc ="第四档起")
    private BigDecimal fourthStart;
    /**
     * 第四档止
     */
    @Jdoc(value= "300.00", doc ="第四档止")
    private BigDecimal fourthEnd;
    /**
     * 第四档补偿率
     */
    @Jdoc(value= "0.04", doc ="第四档补偿率")
    private BigDecimal fourthRate;
    /**
     * 第五档
     */
    @Jdoc(value= "300.00", doc ="第五档起")
    private BigDecimal fifthStart;
    /**
     * 第五档止
     */
    @Jdoc(value= "350.00", doc ="第五档止")
    private BigDecimal fifthEnd;
    /**
     * 第五档补偿率
     */
    @Jdoc(value= "0.05", doc ="第五档补偿率")
    private BigDecimal fifthRate;

    public BigDecimal getFifthRate() {
        return fifthRate;
    }

    public void setFifthRate(BigDecimal fifthRate) {
        this.fifthRate = fifthRate;
    }

    public BigDecimal getFifthEnd() {
        return fifthEnd;
    }

    public void setFifthEnd(BigDecimal fifthEnd) {
        this.fifthEnd = fifthEnd;
    }

    public BigDecimal getFifthStart() {
        return fifthStart;
    }

    public void setFifthStart(BigDecimal fifthStart) {
        this.fifthStart = fifthStart;
    }

    public BigDecimal getFourthRate() {
        return fourthRate;
    }

    public void setFourthRate(BigDecimal fourthRate) {
        this.fourthRate = fourthRate;
    }

    public BigDecimal getFourthEnd() {
        return fourthEnd;
    }

    public void setFourthEnd(BigDecimal fourthEnd) {
        this.fourthEnd = fourthEnd;
    }

    public BigDecimal getFourthStart() {
        return fourthStart;
    }

    public void setFourthStart(BigDecimal fourthStart) {
        this.fourthStart = fourthStart;
    }

    public BigDecimal getThirdRate() {
        return thirdRate;
    }

    public void setThirdRate(BigDecimal thirdRate) {
        this.thirdRate = thirdRate;
    }

    public BigDecimal getThirdEnd() {
        return thirdEnd;
    }

    public void setThirdEnd(BigDecimal thirdEnd) {
        this.thirdEnd = thirdEnd;
    }

    public BigDecimal getThirdStart() {
        return thirdStart;
    }

    public void setThirdStart(BigDecimal thirdStart) {
        this.thirdStart = thirdStart;
    }

    public BigDecimal getSecondRate() {
        return secondRate;
    }

    public void setSecondRate(BigDecimal secondRate) {
        this.secondRate = secondRate;
    }

    public BigDecimal getSecondEnd() {
        return secondEnd;
    }

    public void setSecondEnd(BigDecimal secondEnd) {
        this.secondEnd = secondEnd;
    }

    public BigDecimal getSecondStart() {
        return secondStart;
    }

    public void setSecondStart(BigDecimal secondStart) {
        this.secondStart = secondStart;
    }

    public BigDecimal getFirstRate() {
        return firstRate;
    }

    public void setFirstRate(BigDecimal firstRate) {
        this.firstRate = firstRate;
    }

    public BigDecimal getFirstEnd() {
        return firstEnd;
    }

    public void setFirstEnd(BigDecimal firstEnd) {
        this.firstEnd = firstEnd;
    }

    public BigDecimal getFirstStart() {
        return firstStart;
    }

    public void setFirstStart(BigDecimal firstStart) {
        this.firstStart = firstStart;
    }

    public BigDecimal getEaCompensate() {
        return eaCompensate;
    }

    public void setEaCompensate(BigDecimal eaCompensate) {
        this.eaCompensate = eaCompensate;
    }

    public BigDecimal getRateCompensate() {
        return rateCompensate;
    }

    public void setRateCompensate(BigDecimal rateCompensate) {
        this.rateCompensate = rateCompensate;
    }

    public BigDecimal getToRateCompensate() {
        return toRateCompensate;
    }

    public void setToRateCompensate(BigDecimal toRateCompensate) {
        this.toRateCompensate = toRateCompensate;
    }

    public BigDecimal getToQuotaCompensate() {
        return toQuotaCompensate;
    }

    public void setToQuotaCompensate(BigDecimal toQuotaCompensate) {
        this.toQuotaCompensate = toQuotaCompensate;
    }

    public Integer getSaleMaoCompensateWay() {
        return saleMaoCompensateWay;
    }

    public void setSaleMaoCompensateWay(Integer saleMaoCompensateWay) {
        this.saleMaoCompensateWay = saleMaoCompensateWay;
    }

    public String getOutShops() {
        return outShops;
    }

    public void setOutShops(String outShops) {
        this.outShops = outShops;
    }

    public String getShops() {
        return shops;
    }

    public void setShops(String shops) {
        this.shops = shops;
    }

    public String getGroupShops() {
        return groupShops;
    }

    public void setGroupShops(String groupShops) {
        this.groupShops = groupShops;
    }

    public Date getExecuteEnd() {
        return executeEnd;
    }

    public void setExecuteEnd(Date executeEnd) {
        this.executeEnd = executeEnd;
    }

    public Date getExecuteStart() {
        return executeStart;
    }

    public void setExecuteStart(Date executeStart) {
        this.executeStart = executeStart;
    }

    public Integer getIsTicketOff() {
        return isTicketOff;
    }

    public void setIsTicketOff(Integer isTicketOff) {
        this.isTicketOff = isTicketOff;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierCardNo() {
        return supplierCardNo;
    }

    public void setSupplierCardNo(String supplierCardNo) {
        this.supplierCardNo = supplierCardNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(String scheduleNo) {
        this.scheduleNo = scheduleNo;
    }
}
