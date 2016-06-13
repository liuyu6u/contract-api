package retail;

import retail.domain.MaoBuPrd;
import retail.service.JsonApiDocGenerator;

/**
 * Created by LiuYu on 2016/6/13.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        JsonApiDocGenerator.generate("abc", new MaoBuPrd());
    }

}
