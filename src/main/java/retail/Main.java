package retail;

import retail.domain.param.liuyu.*;
import retail.domain.vo.liuyu.*;
import retail.service.JsonApiDocGenerator;

/**
 * Created by LiuYu on 2016/6/13.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        /*刘宇*/
//        /*343 维护列表重新创建接口设计*/
//        JsonApiDocGenerator.generate("343 维护列表重新创建接口设计-request", new RecreateContractGoodsParam());
//
//        /*344 档期毛补审批筛选接口设计调 - request*/
//        JsonApiDocGenerator.generate("344 档期毛补审批筛选接口设计调-request", new ExamineQueryParam());
        /*344 档期毛补审批筛选接口设计调 - response*/
        JsonApiDocGenerator.generate("344 档期毛补审批筛选接口设计调-response", new ExamineQueryVO());

    }

}
