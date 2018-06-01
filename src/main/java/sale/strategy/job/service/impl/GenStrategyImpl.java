package sale.strategy.job.service.impl;

import sale.strategy.job.service.GenStrategy;
import sale.strategy.job.service.TfSmStrategyRepository;
import sale.strategy.job.service.TfSmUserStrategyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yinp
 * Create Time: 2018年05月11日 14:42
 **/
@Service("genStrategy")
public class GenStrategyImpl implements GenStrategy {

    @Autowired
    TfSmStrategyRepository tfSmStrategyRepository;

    @Autowired
    TfSmUserStrategyRepository tfSmUserStrategyRepository;


//    @Autowired
//    private RedisTemplate redisTemplate;

    private static final String SM_STRATEGY_SEQUENCE = "STRATEGY_SEQ:";


    public void genStrategy(String line, String fileName) {
//        String[] fileInfo = fileName.split("_");
//        //filename 产品大类ID_省分_时间_XXXX.TXT（内只有用户号码列表），
//        String uniqueCode = fileInfo[0] + fileInfo[1];
//        if (!redisTemplate.exists(SM_STRATEGY_SEQUENCE + uniqueCode)) {
//            TfSmStrategy tfSmStrategy = new TfSmStrategy();
//            String strategyId = this.genStrategyId();
//            tfSmStrategy.setStrategyId(strategyId);
//            tfSmStrategy.setAreaCode(fileInfo[1]);
//            tfSmStrategy.setCreateDate(new Date());
//            tfSmStrategy.setCreateDepartId("ZZZZ");
//            tfSmStrategy.setCreateStaffId("ZZZZ");
//            tfSmStrategy.setObjectId(fileInfo[0]);
//            tfSmStrategy.setAreaCode(fileInfo[1]);
//            tfSmStrategy.setStrategyAim("");
//            tfSmStrategy.setStrategyType("");
//            tfSmStrategy.setStrategyStatus("3");
//            tfSmStrategy.setStrategyChannel("");
//            tfSmStrategy.setStrategyName("测试");
//            tfSmStrategy.setStrategyPriority("");
//            tfSmStrategy.setStrategyProvCode(fileInfo[1]);
//            tfSmStrategy.setStrategyPurpose("");
//            tfSmStrategyRepository.save(tfSmStrategy);
//            redisTemplate.set(SM_STRATEGY_SEQUENCE + uniqueCode, strategyId);
//        }

    }


    public void genUserStrategy(List<String> list, String fileName) {
//        String[] fileInfo = fileName.split("_");
//        String uniqueCode = fileInfo[0] + fileInfo[1];
//        ArrayList<TfSmUserStrategy> userList = new ArrayList<>();
//        String strategyId = redisTemplate.get(SM_STRATEGY_SEQUENCE + uniqueCode);
//        for(String line:list){
//            if (!redisTemplate.exists(uniqueCode + line)&&!StringUtils.isEmpty(line)) {
//                redisTemplate.set(uniqueCode + line, "yyf");
//                TfSmUserStrategy tfSmUserStrategy = new TfSmUserStrategy();
//                tfSmUserStrategy.setCreateDate(new Date());
//                tfSmUserStrategy.setObjectId(fileInfo[0]);
//                tfSmUserStrategy.setSerialNumber(line);
//                tfSmUserStrategy.setStatus("0");
//                tfSmUserStrategy.setStrategyChannel("WECHAT");
//                tfSmUserStrategy.setStrategyId(strategyId);
//                tfSmUserStrategy.setUserId("");
//                tfSmUserStrategy.setStrategyType("");
//                tfSmUserStrategy.setStrategyName("");
//                tfSmUserStrategy.setStrategyPriority("");
//                tfSmUserStrategy.setStrategyProvCode(fileInfo[1]);
//                userList.add(tfSmUserStrategy);
//            }
//
//        }
//
//        if(userList.size()>0){
//            tfSmUserStrategyRepository.saveBatch(userList);
//        }
    }


    private String genStrategyId() {
//        long id = redisTemplate.incrBy(SM_STRATEGY_SEQUENCE, 1);
//        if (id >= 99999999)
//            redisTemplate.delete(SM_STRATEGY_SEQUENCE);//后续改成批量取
//        String fileNamePrefix = DateFormatUtils.format(new Date(), "yyMMddHHmm");
//        DecimalFormat df = new DecimalFormat("00000000");
//        return fileNamePrefix + df.format(id);

        // TODO: 18/6/1
        return "";
    }


}
