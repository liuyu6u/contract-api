package retail.domain.vo.liuyu;

import retail.annotation.Jdoc;
import retail.domain.entity.ContractGoodsEntity;
import retail.domain.entity.Dictionary;

import java.util.Date;

/**
 * Created by LiuYu on 2016/6/14.
 */
public class ExamineFlowRecordsVO {

    @Jdoc(refClz=Dictionary.class,refField="nodeName")
    private String nodeName;
    @Jdoc(refClz=Dictionary.class,refField="taskBeginTime")
    private Date taskBeginTime;
    @Jdoc(refClz=Dictionary.class,refField="examineFinishTime")
    private Date examineFinishTime;
    @Jdoc(refClz=Dictionary.class,refField="examineStatus")
    private String examineStatus;
    @Jdoc(refClz=Dictionary.class,refField="examineAdvice")
    private String examineAdvice;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Date getTaskBeginTime() {
        return taskBeginTime;
    }

    public void setTaskBeginTime(Date taskBeginTime) {
        this.taskBeginTime = taskBeginTime;
    }

    public Date getExamineFinishTime() {
        return examineFinishTime;
    }

    public void setExamineFinishTime(Date examineFinishTime) {
        this.examineFinishTime = examineFinishTime;
    }

    public String getExamineAdvice() {
        return examineAdvice;
    }

    public String getExamineStatus() {
        return examineStatus;
    }

    public void setExamineStatus(String examineStatus) {
        this.examineStatus = examineStatus;
    }



    public void setExamineAdvice(String examineAdvice) {
        this.examineAdvice = examineAdvice;
    }
}
