package retail.domain.entity;

import retail.annotation.Jdoc;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by LiuYu on 2016/6/14.
 */
public class ContractGoodsEntity implements java.io.Serializable {
    /**
     * 主键
     */
    @Jdoc(value = "1", doc = "合同商品数据库主键ID")
    private Integer id;
    /**
     * 主合同主键
     */
    @Jdoc(value= "1", doc ="主合同主键")
    private Integer contractMainId;
    /**
     * 主体主键
     */
    @Jdoc(value= "1", doc ="主体主键")
    private Integer contractId;
    /**
     * 协议号
     */
    @Jdoc(value= "2016020322", doc ="协议号")
    private String protoNo;
    /**
     * 合同号
     */
    @Jdoc(value= "3434232", doc ="合同号")
    private String contractNo;
    /**
     * 档期号
     */
    @Jdoc(value= "BL6031", doc ="档期号")
    private String scheduleNo;
    /**
     * 档期开始时间
     */
    @Jdoc(value= "1465885614000", doc ="档期开始时间")
    private Date scheduleStart;
    /**
     * 档期结束时间
     */
    @Jdoc(value= "1465885614000", doc ="档期结束时间")
    private Date scheduleEnd;
    /**
     * 采购部 预留
     */
//    @Jdoc(value= "", doc ="")
    private String purchaseDepartment;
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
     * u课
     */
    @Jdoc(value= "a", doc ="u课")
    private String uGroup;
    /**
     * 执行开始时间
     */
    @Jdoc(value= "1465885614000", doc ="执行开始时间")
    private Date executeStart;
    /**
     * 执行结束时间
     */
    @Jdoc(value= "1465885614000", doc ="执行结束时间")
    private Date executeEnd;
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
     * 销售毛利补偿方式 1按额补偿至 2按率补偿至 3按EA补偿4销售毛补按率补偿 5按率阶梯补偿-全额 6按率阶梯补偿-分段。库存毛利补偿 1 库存毛补
     */
    @Jdoc(value= "1", doc ="销售毛利补偿方式 1按额补偿至 2按率补偿至 3按EA补偿4销售毛补按率补偿 5按率阶梯补偿-全额 6按率阶梯补偿-分段。库存毛利补偿 1 库存毛补")
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
    /**
     * 1是0否
     */
    @Jdoc(value= "1", doc ="是否正常 1是0否")
    private Integer isAbnormal;
    /**
     * 首个异常码
     */
    @Jdoc(value= "1", doc ="首个异常码")
    private Integer firstAbnormal;
    /**
     * 首个异常描述
     */
    @Jdoc(value= "商品不存在", doc ="首个异常描述")
    private String firstAbnormalDesc;
    /**
     * 1导入2新增
     */
    @Jdoc(value= "1", doc ="是导入的还是新增的 1导入2新增")
    private Integer createWay;
    /**
     * 1 审批中 2 审批通过 3 审批驳回
     */
    @Jdoc(value= "2", doc ="审批状态 1审批中 2审批通过 3审批驳回")
    private Integer addExamineStatus;
    /**
     * 1是0否
     */
    @Jdoc(value= "1", doc ="是否创建合同 1是0否")
    private Integer isCreateContract;
    /**
     * 0-"未发送"1-"待确认",2- "执行中",3-"审批中",4-"未通过",5-"待执行",6-"已结束"
     */
    @Jdoc(value= "0", doc ="合同的状态 0-\"未发送\"1-\"待确认\",2- \"执行中\",3-\"审批中\",4-\"未通过\",5-\"待执行\",6-\"已结束\"")
    private Integer theContractStatus;
    /**
     * 协议类型,1-无档期库存毛利补偿,2-无档期销售毛利补偿 3有档期库存毛利补偿 4 有档期销售毛利补偿 5 日常维护协议
     */
    @Jdoc(value= "2", doc ="协议类型,1-无档期库存毛利补偿,2-无档期销售毛利补偿 3有档期库存毛利补偿 4 有档期销售毛利补偿 5 日常维护协议")
    private Integer protoType;
    /**
     * 归档时间
     */
    @Jdoc(value= "1465885614000", doc ="归档时间")
    private Date fileTime;
    /**
     * 创建人类型
     */
    @Jdoc(value= "1", doc ="创建人类型")
    private Integer createRelationType;
    /**
     * 创建人id
     */
    @Jdoc(value= "1", doc ="创建人id")
    private Integer createRelationId;
    /**
     * 创建时间
     */
    @Jdoc(value= "1465885614000", doc ="创建时间")
    private Date createDate;
    /**
     * 最后修改人类型
     */
    @Jdoc(value= "1", doc ="最后修改人类型")
    private Integer modifyRelationType;
    /**
     * 最后操作人id
     */
    @Jdoc(value= "1", doc ="最后操作人id")
    private Integer modifyRelationId;
    /**
     * 最后修改时间
     */
    @Jdoc(value= "1465885614000", doc ="最后修改时间")
    private Date modifyDate;
    /**
     * 数据状态
     */
    @Jdoc(value= "1", doc ="数据状态")
    private Integer status;
    /**
     * 备注
     */
    @Jdoc(value= "其他信息", doc ="备注")
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContractMainId() {
        return contractMainId;
    }

    public void setContractMainId(Integer contractMainId) {
        this.contractMainId = contractMainId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getProtoNo() {
        return protoNo;
    }

    public void setProtoNo(String protoNo) {
        this.protoNo = protoNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(String scheduleNo) {
        this.scheduleNo = scheduleNo;
    }

    public Date getScheduleStart() {
        return scheduleStart;
    }

    public void setScheduleStart(Date scheduleStart) {
        this.scheduleStart = scheduleStart;
    }

    public Date getScheduleEnd() {
        return scheduleEnd;
    }

    public void setScheduleEnd(Date scheduleEnd) {
        this.scheduleEnd = scheduleEnd;
    }

    public String getPurchaseDepartment() {
        return purchaseDepartment;
    }

    public void setPurchaseDepartment(String purchaseDepartment) {
        this.purchaseDepartment = purchaseDepartment;
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

    public String getuGroup() {
        return uGroup;
    }

    public void setuGroup(String uGroup) {
        this.uGroup = uGroup;
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

    public Integer getSaleMaoCompensateWay() {
        return saleMaoCompensateWay;
    }

    public void setSaleMaoCompensateWay(Integer saleMaoCompensateWay) {
        this.saleMaoCompensateWay = saleMaoCompensateWay;
    }

    public BigDecimal getToQuotaCompensate() {
        return toQuotaCompensate;
    }

    public void setToQuotaCompensate(BigDecimal toQuotaCompensate) {
        this.toQuotaCompensate = toQuotaCompensate;
    }

    public BigDecimal getToRateCompensate() {
        return toRateCompensate;
    }

    public void setToRateCompensate(BigDecimal toRateCompensate) {
        this.toRateCompensate = toRateCompensate;
    }

    public BigDecimal getRateCompensate() {
        return rateCompensate;
    }

    public void setRateCompensate(BigDecimal rateCompensate) {
        this.rateCompensate = rateCompensate;
    }

    public BigDecimal getEaCompensate() {
        return eaCompensate;
    }

    public void setEaCompensate(BigDecimal eaCompensate) {
        this.eaCompensate = eaCompensate;
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

    public BigDecimal getFirstStart() {
        return firstStart;
    }

    public void setFirstStart(BigDecimal firstStart) {
        this.firstStart = firstStart;
    }

    public BigDecimal getFirstEnd() {
        return firstEnd;
    }

    public void setFirstEnd(BigDecimal firstEnd) {
        this.firstEnd = firstEnd;
    }

    public BigDecimal getFirstRate() {
        return firstRate;
    }

    public void setFirstRate(BigDecimal firstRate) {
        this.firstRate = firstRate;
    }

    public BigDecimal getSecondStart() {
        return secondStart;
    }

    public void setSecondStart(BigDecimal secondStart) {
        this.secondStart = secondStart;
    }

    public BigDecimal getSecondEnd() {
        return secondEnd;
    }

    public void setSecondEnd(BigDecimal secondEnd) {
        this.secondEnd = secondEnd;
    }

    public BigDecimal getSecondRate() {
        return secondRate;
    }

    public void setSecondRate(BigDecimal secondRate) {
        this.secondRate = secondRate;
    }

    public BigDecimal getThirdStart() {
        return thirdStart;
    }

    public void setThirdStart(BigDecimal thirdStart) {
        this.thirdStart = thirdStart;
    }

    public BigDecimal getThirdEnd() {
        return thirdEnd;
    }

    public void setThirdEnd(BigDecimal thirdEnd) {
        this.thirdEnd = thirdEnd;
    }

    public BigDecimal getThirdRate() {
        return thirdRate;
    }

    public void setThirdRate(BigDecimal thirdRate) {
        this.thirdRate = thirdRate;
    }

    public BigDecimal getFourthStart() {
        return fourthStart;
    }

    public void setFourthStart(BigDecimal fourthStart) {
        this.fourthStart = fourthStart;
    }

    public BigDecimal getFourthEnd() {
        return fourthEnd;
    }

    public void setFourthEnd(BigDecimal fourthEnd) {
        this.fourthEnd = fourthEnd;
    }

    public BigDecimal getFourthRate() {
        return fourthRate;
    }

    public void setFourthRate(BigDecimal fourthRate) {
        this.fourthRate = fourthRate;
    }

    public BigDecimal getFifthStart() {
        return fifthStart;
    }

    public void setFifthStart(BigDecimal fifthStart) {
        this.fifthStart = fifthStart;
    }

    public BigDecimal getFifthEnd() {
        return fifthEnd;
    }

    public void setFifthEnd(BigDecimal fifthEnd) {
        this.fifthEnd = fifthEnd;
    }

    public BigDecimal getFifthRate() {
        return fifthRate;
    }

    public void setFifthRate(BigDecimal fifthRate) {
        this.fifthRate = fifthRate;
    }

    public Integer getIsAbnormal() {
        return isAbnormal;
    }

    public void setIsAbnormal(Integer isAbnormal) {
        this.isAbnormal = isAbnormal;
    }

    public Integer getFirstAbnormal() {
        return firstAbnormal;
    }

    public void setFirstAbnormal(Integer firstAbnormal) {
        this.firstAbnormal = firstAbnormal;
    }

    public String getFirstAbnormalDesc() {
        return firstAbnormalDesc;
    }

    public void setFirstAbnormalDesc(String firstAbnormalDesc) {
        this.firstAbnormalDesc = firstAbnormalDesc;
    }

    public Integer getCreateWay() {
        return createWay;
    }

    public void setCreateWay(Integer createWay) {
        this.createWay = createWay;
    }

    public Integer getAddExamineStatus() {
        return addExamineStatus;
    }

    public void setAddExamineStatus(Integer addExamineStatus) {
        this.addExamineStatus = addExamineStatus;
    }

    public Integer getIsCreateContract() {
        return isCreateContract;
    }

    public void setIsCreateContract(Integer isCreateContract) {
        this.isCreateContract = isCreateContract;
    }

    public Integer getTheContractStatus() {
        return theContractStatus;
    }

    public void setTheContractStatus(Integer theContractStatus) {
        this.theContractStatus = theContractStatus;
    }

    public Integer getProtoType() {
        return protoType;
    }

    public void setProtoType(Integer protoType) {
        this.protoType = protoType;
    }

    public Date getFileTime() {
        return fileTime;
    }

    public void setFileTime(Date fileTime) {
        this.fileTime = fileTime;
    }

    public Integer getCreateRelationType() {
        return createRelationType;
    }

    public void setCreateRelationType(Integer createRelationType) {
        this.createRelationType = createRelationType;
    }

    public Integer getCreateRelationId() {
        return createRelationId;
    }

    public void setCreateRelationId(Integer createRelationId) {
        this.createRelationId = createRelationId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getModifyRelationType() {
        return modifyRelationType;
    }

    public void setModifyRelationType(Integer modifyRelationType) {
        this.modifyRelationType = modifyRelationType;
    }

    public Integer getModifyRelationId() {
        return modifyRelationId;
    }

    public void setModifyRelationId(Integer modifyRelationId) {
        this.modifyRelationId = modifyRelationId;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
