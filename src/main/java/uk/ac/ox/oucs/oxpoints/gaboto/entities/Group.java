package uk.ac.ox.oucs.oxpoints.gaboto.entities;


import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uk.ac.ox.oucs.oxpoints.gaboto.entities.Agent;


/**
 * Gaboto generated Entity.
 * @see net.sf.gaboto.generation.GabotoGenerator
 */
public class Group extends Agent {


  private static Map<String, List<Method>> indirectPropertyLookupTable;
  static{
    indirectPropertyLookupTable = new HashMap<String, List<Method>>();
  }

  @Override
  public String getType(){
    return "http://xmlns.com/foaf/0.1/Group";
  }







  protected List<Method> getIndirectMethodsForProperty(String propertyURI){
    List<Method> list = super.getIndirectMethodsForProperty(propertyURI);
    if(list == null)
      return indirectPropertyLookupTable.get(propertyURI);
    
    else{
      List<Method> tmp = indirectPropertyLookupTable.get(propertyURI);
      if(tmp != null)
        list.addAll(tmp);
    }
    return list;
  }

}