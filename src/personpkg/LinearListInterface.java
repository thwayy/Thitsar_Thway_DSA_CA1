/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package personpkg;

/**
 *
 * @author Thitsar Thway
 */
public interface LinearListInterface {
    
    public boolean isEmpty();
    
    public int size();
    
    public Object get(int position);
    
    public void remove(int position);
    
    public void add(int position, Object element);

    public void add(Object element);
    
    public String printList();
}
