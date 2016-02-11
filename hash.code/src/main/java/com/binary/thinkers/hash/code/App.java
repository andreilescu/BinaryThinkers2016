package com.binary.thinkers.hash.code;

import com.binary.thinkers.hash.code.parser.FileParser;
import com.binary.thinkers.hash.code.parser.impl.FileParserImpl;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Try to read info form file");
        
        FileParser fileParser = new FileParserImpl();
        String fileName = "mother_of_all_warehouses.in";
        
        fileParser.convertFileToWarehouses(fileName);
        
        Integer rowNumbers = fileParser.getRowNumber(fileName);
        Integer columnNumbers = fileParser.getColumnNumber(fileName);
        
        
        System.out.println("row:" + rowNumbers);
        System.out.println("col: " + columnNumbers);
    }
}


