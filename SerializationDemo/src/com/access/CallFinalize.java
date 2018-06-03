package com.access; // This package is different from the upper class package

import com.check.CheckFinalize;

public class CallFinalize{
        public static void main(String[] args){
               CheckFinalize cf = new CheckFinalize();
               cf.finalize();
               cf.update();  // will throw IOException as connection is closed
       }
        
        
}