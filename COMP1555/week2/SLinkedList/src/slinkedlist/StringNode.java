/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package slinkedlist;


/**
 *
 * @author Cos Ierotheou
 */
public class StringNode {
  // Instance variables:
  private String element;
  private Integer age;
  private StringNode next;
  //int age = 0 ;
  /** Creates a node with null references to its element and next node. */
  public StringNode() {
    this("", 0 ,null);
  }
  /** Creates a node with the given element and next node. */
  public StringNode(String e, Integer a, StringNode n) {
    element = e;
    age = a;  
    next = n;
  }
  // Accessor methods:
  public String getElement() {
    return element; 
  }
  
  public Integer getAge(){
      return age;
  }
  
  public StringNode getNext() { 
    return next;
  }
  
  // Modifier methods:
  public void setElement(String newElem) { 
    element = newElem; 
  }
  
  public void setAge(Integer newAge){
      age = newAge;
  }
  
  public void setNext(StringNode newNext) {
    next = newNext; 
  }
}
