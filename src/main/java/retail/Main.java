package retail;

import retail.domain.example.Computer;
import retail.domain.example.subs.WebResult;
import retail.service.JsonApiDocGenerator;

/**
 * Created by LiuYu on 2016/6/13.
 */
public class Main {

    public static void main(String[] args) throws Exception {

        JsonApiDocGenerator.generate("示例文档", new WebResult<>(new Computer()));
//        JsonApiDocGenerator.generate("示例文档", new Computer());
    }

}
