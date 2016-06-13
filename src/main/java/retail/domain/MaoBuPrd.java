package retail.domain;

import retail.annotation.Jdoc;

import java.util.List;

/**
 * 主数据记录
 * Created by LiuYu on 2016/6/13.
 */
public class MaoBuPrd {

    @Jdoc(value = "123af",doc="档期号")
    private String dangQiHao = "dangQiHao"; //档期号
    @Jdoc(value = "6165114",doc="商品编码")
    private String shangPingBianMa = "shangPingBianMa"; //商品编码

    @Jdoc(value="123",doc="idd")
    private int id;

    @Jdoc(value="1,2,3",doc="maoBuPrdListsdfdf")
    private List<Integer> maoBuPrdList;


    public List<Integer> getMaoBuPrdList() {
        return maoBuPrdList;
    }

    public void setMaoBuPrdList(List<Integer> maoBuPrdList) {
        this.maoBuPrdList = maoBuPrdList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDangQiHao() {
        return dangQiHao;
    }

    public void setDangQiHao(String dangQiHao) {
        this.dangQiHao = dangQiHao;
    }

    public String getShangPingBianMa() {
        return shangPingBianMa;
    }

    public void setShangPingBianMa(String shangPingBianMa) {
        this.shangPingBianMa = shangPingBianMa;
    }
}
