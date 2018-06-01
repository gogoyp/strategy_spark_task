package sale.strategy.job.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseBean implements Serializable
{
     private Map<String,Object> attrMap = new HashMap<String,Object>();

     private List<String> updateKeys = new ArrayList<String>();

     private List<String> primaryKeys = new ArrayList<String>();

     public Map<String,Object> getAttrMap()
     {
          return this.attrMap;
     }

     private void setAttrMap(Map<String,Object> attrMap)
     {
          this.attrMap = attrMap;
     }

     public void addKey(String updateKey)
     {
          if (!updateKeys.contains(updateKey))
          {
               updateKeys.add(updateKey);
          }
     }

     public List<String> getUpdateKeys()
     {
          return updateKeys;
     }

     public void addPrimaryKey(String primaryKey)
     {
          if (!primaryKeys.contains(primaryKey))
          {
               primaryKeys.add(primaryKey);
          }
     }

     public List<String> getPrimaryKeys()
     {
          return primaryKeys;
     }



}