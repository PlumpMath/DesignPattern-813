package com.store.cor.handler;

/**
 * @Package com.store.cor.handler
 * @ClassName: com.store.cor.handler.Leader  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月3日 下午1:39:30
 * @Description:销售小组长，可以审批15%以内的折扣。
 */
public class Leader extends PriceHandler {

	/**
	 * @author 张明明
	 * @date 2016年3月3日 下午1:30:30
	 * @param discount 申请的折扣。
	 * @Description: 处理折扣申请,当折扣大于0.15的时候，转交给直接上级审批。
	 */
	@Override
	public void processDiscount(float discount) {
		if(discount<=0.15){
			System.out.format("%s批准了折扣：%.3f%n", getCurrentName(),discount);
		}else{
			successor.processDiscount(discount);
		}
	}

}
