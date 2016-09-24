/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author ASUS
 */
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO cde application logic here
        doubleLnkList Lista = new doubleLnkList();
        Lista.insertFirst("hola");
        Lista.insertFirst(4);
        Lista.insertFirst(75);
        Lista.insertLast(47777);
        Lista.searchNode("hola");
        Lista.showList();
        
    }
    
}
