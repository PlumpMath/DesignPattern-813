package com.store.cor.handler;

/**
 * @Package com.store.cor.handler
 * @ClassName: com.store.cor.handler.PriceHandlerFactory  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月3日 下午1:31:53
 * @Description:创建PriceHandler 的工厂类。
 */
public class PriceHandlerFactory {

	/**
	 * @author 张明明
	 * @date 2016年3月3日 下午1:33:03
	 * @return
	 * @Description:创建PriceHandler,制定各自的后继者。
	 */
	public static PriceHandler createPriceHandler(){
		PriceHandler sales=new Sales();
		PriceHandler leader=new Leader();
		PriceHandler manager=new Manager();
		PriceHandler director=new Director();
		PriceHandler vicePresident=new VicePresident();
		PriceHandler ceo=new CEO();
		
		sales.setSuccessor(leader);
		leader.setSuccessor(manager);
		manager.setSuccessor(director);
		director.setSuccessor(vicePresident);
		vicePresident.setSuccessor(ceo);
		return sales;
	}
}
