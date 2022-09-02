/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.myproject.producerandconsumeralgorithm;

/**
 *
 * @author HP
 */
public class ProducerAndConsumerAlgorithm {

    public static void main(String[] args) {
        Company ob=new Company();
	Produce_Thread pi=new Produce_Thread(ob);
	Consume_Thread ci=new Consume_Thread(ob);
	pi.start();
	ci.start();
    }
}
