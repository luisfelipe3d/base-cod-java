/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada2java;

/**
 *
 * @author home
 */
public class TypeHandler {

    private static TypeHandler uniqueInstance;
    private VariableHandler var = VariableHandler.getInstance();
    
    private TypeHandler() {

    }

    public static synchronized TypeHandler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new TypeHandler();
        }
        return uniqueInstance;
    }
    
    
    
}
