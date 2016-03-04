package com.store.cor;

import java.util.Random;

import com.store.cor.handler.PriceHandler;
import com.store.cor.handler.PriceHandlerFactory;

/**
 * @Package com.store.cor
 * @ClassName: com.store.cor.Customer  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月3日 下午2:03:11
 * @Description:客户，发起折扣的申请。
 * 每一个客户都会有一个销售人员为其服务，因此需要建立 顾客与销售人员的联系。
 */
public class Customer {

	// 折扣处理者。
	private PriceHandler priceHandler;

	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}
	
	/**
	 * @author 张明明
	 * @date 2016年3月3日 下午2:09:07
	 * @param discount
	 * @Description: 客户发起折扣的申请。
	 */
	public void requestDiscount(float discount){
		priceHandler.processDiscount(discount);
	}
	
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
		
		Random rand=new Random();
		for(int i=0;i<100;i++){
			System.out.print(i+"：        ");
			customer.requestDiscount(rand.nextFloat());
		}
		
	}
	
	
	
	
	
}
