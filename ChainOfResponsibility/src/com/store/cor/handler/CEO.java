package com.store.cor.handler;

/**
 * @Package com.store.cor.handler
 * @ClassName: com.store.cor.handler.CEO  
 * @author 张明明  braveheart1115@163.com
 * @date 2016年3月3日 下午1:55:37
 * @Description:CEO， 可以批准55%以内的折扣,折扣超出55%， 就拒绝申请。
 */
public class CEO extends PriceHandler {

	/** 
	 * @author 张明明
	 * @date 2016年3月3日 下午1:55:37
	 * @param discount
	 * @Description:
	 */
	@Override
	public void processDiscount(float discount) {
		if(discount<=0.55){
			System.out.format("%s批准了折扣%.3f%n", getCurrentName(),discount);
		}else{
			System.out.format("%s拒绝了折扣%.3f%n", getCurrentName(),discount);
		}
	}

}
