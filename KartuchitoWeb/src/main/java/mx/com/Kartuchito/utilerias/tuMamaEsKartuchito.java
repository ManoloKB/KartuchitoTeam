package mx.com.Kartuchito.utilerias;

import org.json.JSONObject;

import com.conekta.Charge;
import com.conekta.Conekta;
import com.conekta.Error;

public class tuMamaEsKartuchito {
	
	public static void pincheManuelValesPitos(){
	
		Conekta.setApiKey("key_s5FcDnP9pLqeBzLaCxQP1A");
		Charge charge = null;
		JSONObject valid_payment_method;
		JSONObject valid_visa_card;
		valid_visa_card = new JSONObject("{'card':'tok_test_visa_4242'}");
		valid_payment_method = new JSONObject("{'description':'Stogies'," +
		  "'reference_id':'el-german-dejale-como-angel'," +
		  "'amount':299," +
		  "'currency':'MXN'}");
		JSONObject params = valid_payment_method.put("card", valid_visa_card.get("card"));
		try {
		  charge = Charge.create(params);
		} catch(Error e) {
		  System.out.println(e.toString());
		}

		 System.out.println(charge.status);

//		{
//		  amount=20000,
//		  id=530680e6d7e1a076e4000595,
//		  status=paid,
//		  description=Stogies,
//		  reference_id=9839-wolf_pack,
//		  created_at=1392935143,
//		  livemode=false,
//		  payment_method={
//		    exp_month=12,
//		    exp_year=19,
//		    name=JorgeLopez,
//		    auth_code=725872,
//		    brand=visa,
//		    last4=4242
//		  },
//		  currency=MXN
//		}

	}	
	
	public static void main(String[] args) {
		
		pincheManuelValesPitos();
	}
	
}
