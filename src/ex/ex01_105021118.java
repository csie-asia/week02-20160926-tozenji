package ex;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 1050210XX 周永振老師
 */

public class ex01_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float p = 0.5f;
		float n = 1522;
		float d = 0;
		
		if(n<=600){
			d = n*p;
		}else{
				if (n<=1200){
		    d = n*p*0.9f;
		}else{
		    d = n*p*0.79f;	
			}
		}
		
		
		System.out.println(d);

	}

}
