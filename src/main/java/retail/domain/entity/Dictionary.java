package retail.domain.entity;

import retail.annotation.Jdoc;

/**
 * Created by LiuYu on 2016/6/14.
 */
public class Dictionary {

    @Jdoc(value="销售毛补",doc="毛利补偿方式: 销售毛补、库存毛补")
    private String compensateRawWay;

    @Jdoc(value="按EA补偿: 0.5元",doc="毛利补偿方式具体细节")
    private String compensateRawWayDetail;
}
