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
public enum TypesOfDataEnum {
    
    INTEGER(1, "Integer'Image"),
    FLOAT(2, "Float'Image"),
    CHARACTER(3, "Character'Image"),
    BOOLEAN(4, "Boolean'Image");
    
    private int codigo;
    private String nome;
    
    private TypesOfDataEnum(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public static String fromInt(int code){
        switch(code){
            case 1:
                return INTEGER.nome;
            case 2:
                return FLOAT.nome;
            case 3:
                return CHARACTER.nome;
            case 4:
                return BOOLEAN.nome;
        }
        return null;
    }
}
