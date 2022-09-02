/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.producerandconsumeralgorithm;

/**
 *
 * @author HP
 */
class Company {
        int n;
        boolean flag=false;
	synchronized public void produce_item(int n) throws Exception{
            if(flag){
                wait();
            }
		this.n=n;
                System.out.println("Produce item :"+n);
                flag=true;
                notify();
		
	}
	synchronized public int consume_item() throws Exception{
            if(!flag){
                wait();
            }
		System.out.println("Consume item :"+this.n);
                flag=false;
                notify();
		return this.n;
	}
}
