package org.example;

class DeviceService{
        Printer printer;
        Fax fax;
        
        Printer getPrinter(){
            if(printer==null){
                printer= new Printer();    
            }
            return printer;
        }
        
        Fax getFax(){
            if(fax==null){
                fax = new Fax();  
            }
            
            return fax;
        }
    }