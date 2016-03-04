package com.store.cor.handler;

/**
 * @Package com.store.cor.handler
 * @ClassName: com.store.cor.handler.Manager  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月3日 下午1:44:29
 * @Description:销售经理，可以审批30%以内的折扣。
 */
public class Manager extends PriceHandler {

	/** 
	 * @author 张明明
	 * @date 2016年3月3日 下午1:44:29
	 * @param discount
	 * @Description:处理折扣申请,当折扣大于0.30的时候，转交给直接上级审批。
	 */
	@Override
	public void processDiscount(float discount) {
		if(discount<=0.3){
			System.out.format("%s批准了折扣：%.3f%n", getCurrentName(),discount);
		}else{
			successor.processDiscount(discount);
		}
	}

}
