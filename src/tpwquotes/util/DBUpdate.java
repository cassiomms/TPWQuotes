package tpwquotes.util;

import java.io.*;
import java.util.*;
import tpwquotes.model.*;
import tpwquotes.util.*;
import org.hibernate.*;
import org.hibernate.criterion.*;

public class DBUpdate {
	
	public static void GetUpdates() throws Exception {
		Session dbsession = DB.getSessionFactory().getCurrentSession();
		dbsession.beginTransaction();
		
		List qt = dbsession.createCriteria(Quote.class).list();
		
		
		ArrayList<Quote> quotes = new ArrayList(qt);
		
		ArrayList<Tick> ticks = QuoteBot.getTicks(quotes);

		for(int i = 0; i<ticks.size(); i++)
			dbsession.save(ticks.get(i));
		
		dbsession.getTransaction().commit();
		DB.getSessionFactory().close();
	}


	public static void main(String args[]) throws Exception {
	
		Session dbsession = DB.getSessionFactory().getCurrentSession();
		Quote q = new Quote();
  		q.setCode("MSFT");
  		q.setName("Microsoft Corporation");
  		q.setProfile("profile");
  		Quote q2 = new Quote();
  		q2.setCode("NVDA");
  		q2.setName("nVidia Corporation");
  		q2.setProfile("profile");
  		ArrayList<Quote> aq = new ArrayList();
  		aq.add(q);
  		aq.add(q2);
  		
  		dbsession.beginTransaction();
  		dbsession.save(q);
  		dbsession.save(q2);
  		
  		dbsession.getTransaction().commit();
		DB.getSessionFactory().close();
  		
		GetUpdates();
	
	}
}
