package com.store.cor.handler;

/**
 * @Package com.store.cor.handler
 * @ClassName: com.store.cor.handler.PriceHandler  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月3日 下午1:27:15
 * @Description: 价格处理人，负责处理客户折扣的申请。
 */
public abstract class PriceHandler {

	/**
	 * 直接后继，用于传递请求。
	 */
	protected PriceHandler successor;
	
	protected String name;
	
	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}


	public String getCurrentName(){
		name=this.getClass().getName();
		name=name.substring(name.lastIndexOf(".")+1);
		return name;
	}

	/**
	 * @author 张明明
	 * @date 2016年3月3日 下午1:30:30
	 * @param discount 申请的折扣。
	 * @Description: 处理折扣申请。
	 */
	public abstract void processDiscount(float discount); 
}
