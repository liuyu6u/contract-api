package retail.domain.example;

import retail.annotation.Jdoc;

import java.util.Date;
import java.util.List;

/**
 * Created by LiuYu on 2016/6/13.
 */
public class Computer {

    @Jdoc(value = "联想", doc = "电脑所属品牌")
    private String brand;

    @Jdoc(value="16",doc="显示器的大小")
    private int size;

    @Jdoc(value="4.44",doc="内存大小")
    private float memory;

    @Jdoc(value="1562598452",doc="出厂日期")
    private Date assemble;

    @Jdoc(value="2,4,8,16,32",doc="可以支持的内存大小")
    private Integer[] supportMemories;

    @Jdoc(value="usb1,usb2,usb3",doc="支持的usb类型")
    private String[] supportUSBs;

    @Jdoc(doc="电脑包含的组件列表")
    private List<Component> components;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public Date getAssemble() {
        return assemble;
    }

    public void setAssemble(Date assemble) {
        this.assemble = assemble;
    }

    public Integer[] getSupportMemories() {
        return supportMemories;
    }

    public void setSupportMemories(Integer[] supportMemories) {
        this.supportMemories = supportMemories;
    }

    public String[] getSupportUSBs() {
        return supportUSBs;
    }

    public void setSupportUSBs(String[] supportUSBs) {
        this.supportUSBs = supportUSBs;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
}
