package com.store.cor.handler;

/**
 * @Package com.store.cor.handler
 * @ClassName: com.store.cor.handler.Director  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月3日 下午1:47:51
 * @Description:销售总监，可以审批40%以内的折扣。
 */
public class Director extends PriceHandler {

	/** 
	 * @author 张明明
	 * @date 2016年3月3日 下午1:47:51
	 * @param discount
	 * @Description:处理折扣申请,当折扣大于0.40的时候，转交给直接上级审批。
	 */
	@Override
	public void processDiscount(float discount) {
		if(discount<=0.40){
			System.out.format("%s批准了折扣：%.3f%n", getCurrentName(),discount);
		}else{
			successor.processDiscount(discount);
		}
	}

}
