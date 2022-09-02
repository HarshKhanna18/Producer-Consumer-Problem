/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.producerandconsumeralgorithm;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
class Produce_Thread extends Thread{
    Company p;
	Produce_Thread(Company p){
		this.p=p;
	}
	public void run(){
		int i=1;
		while(true){
                    try {
                        this.p.produce_item(i);
                    } catch (Exception ex) {
                        Logger.getLogger(Produce_Thread.class.getName()).log(Level.SEVERE, null, ex);
                    }
			try{Thread.sleep(1000);}catch(Exception e){}
			i++;
		}
		
	}
}
