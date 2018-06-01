package sale.strategy.job.bean;



import java.util.Date;

public class TfSmStrategy extends BaseBean
{
     public TfSmStrategy()
     {
          super();
          addPrimaryKey("STRATEGY_ID");
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
     *策略推广级别(0:省级 1:地市级)
     */
     private  String strategyArea;

     /*
     *策略推广省份编码
     */
     private  String strategyProvCode;

     /*
     *推广区域（0718$0719$0720）
     */
     private  String areaCode;

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
     *营销策略目标
     */
     private  String strategyAim;

     /*
     *营销策略状态(0:草稿 1:待审批 2:执行中 3:已完成（到期） 4:已完成（手工中止） 5:已评估 6:已归档)
     */
     private  String strategyStatus;

     /*
     *营销策略用途(0:为政策找寻用户 1:为用户匹配政策)
     */
     private  String strategyPurpose;

     private  Date createDate;

     private  String createStaffId;

     private  String createDepartId;

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

     public  String   getStrategyArea()
     {
          return this.strategyArea;
     }

     public  void  setStrategyArea(String strategyArea)
     {
          this.strategyArea = strategyArea;
          addKey("STRATEGY_AREA");
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

     public  String   getAreaCode()
     {
          return this.areaCode;
     }

     public  void  setAreaCode(String areaCode)
     {
          this.areaCode = areaCode;
          addKey("AREA_CODE");
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

     public  String   getStrategyAim()
     {
          return this.strategyAim;
     }

     public  void  setStrategyAim(String strategyAim)
     {
          this.strategyAim = strategyAim;
          addKey("STRATEGY_AIM");
     }

     public  String   getStrategyStatus()
     {
          return this.strategyStatus;
     }

     public  void  setStrategyStatus(String strategyStatus)
     {
          this.strategyStatus = strategyStatus;
          addKey("STRATEGY_STATUS");
     }

     public  String   getStrategyPurpose()
     {
          return this.strategyPurpose;
     }

     public  void  setStrategyPurpose(String strategyPurpose)
     {
          this.strategyPurpose = strategyPurpose;
          addKey("STRATEGY_PURPOSE");
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

     public  String   getCreateStaffId()
     {
          return this.createStaffId;
     }

     public  void  setCreateStaffId(String createStaffId)
     {
          this.createStaffId = createStaffId;
          addKey("CREATE_STAFF_ID");
     }

     public  String   getCreateDepartId()
     {
          return this.createDepartId;
     }

     public  void  setCreateDepartId(String createDepartId)
     {
          this.createDepartId = createDepartId;
          addKey("CREATE_DEPART_ID");
     }


}