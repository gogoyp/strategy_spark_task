package sale.strategy.job.bean;


import java.util.Date;

public class TfSmUserStrategy extends BaseBean
{
     public TfSmUserStrategy()
     {
          super();
          addPrimaryKey("STRATEGY_ID");
          addPrimaryKey("SERIAL_NUMBER");
     }

     /*
     *营销策略编码
     */
     private  String strategyId;

     /*
     *营销策略名称
     */
     private  String strategyName;

     /*
     *用户ID
     */
     private  String userId;

     /*
     *用户号码
     */
     private  String serialNumber;

     /*
     *策略推广省份编码
     */
     private  String strategyProvCode;

     /*
     *来源静态参数表[TD_S_STATIC]可以保存多个以$分隔如：HFDYE$JZTS
     */
     private  String strategyType;

     /*
     *来源静态参数表[TD_S_STATIC]可以保存多个以$分隔如：HFDYE$JZTS
     */
     private  String strategyChannel;

     /*
     *对象ID[来源TD_SM_PRODUCT_CONF参数表]
     */
     private  String objectId;

     /*
     *策略优先级[1-N]数字越大优先级越低
     */
     private  String strategyPriority;

     /*
     *状态(0：正式 1：失效)
     */
     private  String status;

     private  Date createDate;

     public  String   getStrategyId()
     {
          return this.strategyId;
     }

     public  void  setStrategyId(String strategyId)
     {
          this.strategyId = strategyId;
          addKey("STRATEGY_ID");
     }

     public  String   getStrategyName()
     {
          return this.strategyName;
     }

     public  void  setStrategyName(String strategyName)
     {
          this.strategyName = strategyName;
          addKey("STRATEGY_NAME");
     }

     public  String   getUserId()
     {
          return this.userId;
     }

     public  void  setUserId(String userId)
     {
          this.userId = userId;
          addKey("USER_ID");
     }

     public  String   getSerialNumber()
     {
          return this.serialNumber;
     }

     public  void  setSerialNumber(String serialNumber)
     {
          this.serialNumber = serialNumber;
          addKey("SERIAL_NUMBER");
     }

     public  String   getStrategyProvCode()
     {
          return this.strategyProvCode;
     }

     public  void  setStrategyProvCode(String strategyProvCode)
     {
          this.strategyProvCode = strategyProvCode;
          addKey("STRATEGY_PROV_CODE");
     }

     public  String   getStrategyType()
     {
          return this.strategyType;
     }

     public  void  setStrategyType(String strategyType)
     {
          this.strategyType = strategyType;
          addKey("STRATEGY_TYPE");
     }

     public  String   getStrategyChannel()
     {
          return this.strategyChannel;
     }

     public  void  setStrategyChannel(String strategyChannel)
     {
          this.strategyChannel = strategyChannel;
          addKey("STRATEGY_CHANNEL");
     }

     public  String   getObjectId()
     {
          return this.objectId;
     }

     public  void  setObjectId(String objectId)
     {
          this.objectId = objectId;
          addKey("OBJECT_ID");
     }

     public  String   getStrategyPriority()
     {
          return this.strategyPriority;
     }

     public  void  setStrategyPriority(String strategyPriority)
     {
          this.strategyPriority = strategyPriority;
          addKey("STRATEGY_PRIORITY");
     }

     public  String   getStatus()
     {
          return this.status;
     }

     public  void  setStatus(String status)
     {
          this.status = status;
          addKey("STATUS");
     }

     public  Date   getCreateDate()
     {
          return this.createDate;
     }

     public  void  setCreateDate(Date createDate)
     {
          this.createDate = createDate;
          addKey("CREATE_DATE");
     }


}