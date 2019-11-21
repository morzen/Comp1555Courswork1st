/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slinkedlist;

import java.util.NoSuchElementException;

/**
 *
 * @author barnabe
 */


    

public class disneyClass {
    
    
    
    protected StringNode head;
    public  disneyClass() {
        head = new StringNode();
    }
    
    
    public static void main(String[] args) {
    
        SLinkedList nameNage = new SLinkedList();
        nameNage.head.setElement("Cinderella");
        nameNage.head.setAge(21);
        
        nameNage.addFirst("Sleepy",28);
        nameNage.addMid("Sneezy",27,"Sleepy");
        nameNage.addMid("Dopey",25,"Sneezy");
        nameNage.addMid("Bashful",22,"Dopey");
        nameNage.addMid("Happy",26,"Bashful");
        nameNage.addMid("Doc",35,"Happy");
        nameNage.addMid("Grumpy",29,"Doc");
        nameNage.addMid("Snow White",18,"Grumpy");
        nameNage.addMid("Pinocchio",26,"Snow White");
        nameNage.addMid("Ariel",22,"Pinocchio");
        nameNage.addMid("Mickey",31,"Ariel");
        nameNage.addMid("Minnie",28,"Mickey");
        nameNage.addMid("Donald",33,"Minnie");
        nameNage.addMid("Winnie",45,"Donald");
        nameNage.addMid("Peter Pan",19,"Winnie");
        nameNage.addLast("Tinkerbell",25);
        
        nameNage.printList(nameNage);
        
        
    }

}



