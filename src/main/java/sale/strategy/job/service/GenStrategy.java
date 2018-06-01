package sale.strategy.job.service;

import java.io.Serializable;
import java.util.List;

public interface GenStrategy extends Serializable {
    public void  genStrategy(String  line,String fileName);
    public void genUserStrategy(List<String> list, String fileName);
}
