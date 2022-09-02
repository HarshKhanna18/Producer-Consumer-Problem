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
public class Consume_Thread extends Thread {
        Company p;
	Consume_Thread(Company p){
		this.p=p;
	}
	public void run(){
		while(true){
                    try {
                        this.p.consume_item();
                    } catch (Exception ex) {
                        Logger.getLogger(Consume_Thread.class.getName()).log(Level.SEVERE, null, ex);
                    }
			try{Thread.sleep(2000);}catch(Exception e){}
		}
		
	}
}
