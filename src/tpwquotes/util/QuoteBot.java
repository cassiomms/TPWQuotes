package tpwquotes.util;

import java.util.*;
import tpwquotes.util.*;
//import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import tpwquotes.model.*;

public class QuoteBot {

	 public static String now(String dateFormat, Calendar cal) {
		cal = Calendar.getInstance();
   		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
   		return sdf.format(cal.getTime());
	}
	

	public static ArrayList<Tick> getTicks(ArrayList<Quote> quotes) throws Exception {
		Calendar cal = Calendar.getInstance();
  		String day = now("dd",cal);
  		String month = now("MM",cal);
  		String year = now("yyyy",cal);
  		
  		ArrayList<Tick> ans = new ArrayList(); 
  		for (int i = 0; i<quotes.size();i++) {
  			String data = Robot.get("http://ichart.finance.yahoo.com/table.csv?s="+quotes.get(i).getCode()+
  			"&a="+month+"&b="+day+"&c="+year+"&d="+month+"&e="+day+"&f="+year+"&g=d&ignore=.csv");
  			data = data.substring(71, 76);
  			Float f = Float.parseFloat(data);
  			Tick t1 = new Tick();
  			TickPk t1pk = new TickPk();
  			t1pk.setQuote(quotes.get(i));
  			//t1pk.setDate(Date.valueof(year+"-"+month+"-"+day));
  			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
  			t1pk.setDate(sdf.parse(year+"-"+month+"-"+day));
  			t1.setId(t1pk);
  			t1.setValue(f);
  			ans.add(t1);
  		}
  		return ans;
  	}
  	
  	public static void main(String args[]) throws Exception {
  		Quote q = new Quote();
  		q.setCode("MSFT");
  		q.setName("Microsoft");
  		q.setProfile("profile");
  		ArrayList<Quote> aq = new ArrayList();
  		aq.add(q);
  		
  		ArrayList<Tick> at;
  		at = getTicks(aq);
  		
  		System.out.println(at.get(0));
  	}	
}
