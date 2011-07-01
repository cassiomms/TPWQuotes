INSERT INTO tquote (code,name,profile) VALUES ('MSFT','Microsoft','Microsoft'),('MVDA','nVIDIA','nVIDIAP'),('AMD','AMD','AMDP'),('INTC','INTEL','INTELP');
INSERT INTO tick (date,value,quote_code) VALUES ('2011-06-30',22.16,'INTC'),('2011-06-29',21.39,'INTC'),
												('2011-06-28',21.49,'INTC'),('2011-06-27',21.34,'INTC'),
												('2011-06-30',6.99,'AMD'),('2011-06-29',6.89,'AMD'),
												('2011-06-28',6.95,'AMD'),('2011-06-27',6.91,'AMD'),
												('2011-06-30',15.94,'MVDA'),('2011-06-29',15.74,'MVDA'),
												('2011-06-28',15.50,'MVDA'),('2011-06-27',15.41,'MVDA'),
												('2011-06-30',26.00,'MSFT'),('2011-06-29',25.62,'MSFT'),
												('2011-06-28',25.80,'MSFT'),('2011-06-27',25.20,'MSFT');
												
INSERT INTO user_tb(id,name,email,password,photo,phone,funds,debt) VALUES ('001','Jose','jose@email.com','jose','/usr/local/tpwquotes/001.gif','5555',500,500),
																		('0','Silvio Santos','silvio@email.com','silvio','/usr/local/tpwquotes/0.gif','3333',5000000000,0);
																		
INSERT INTO ttransaction(transtype,id,date,value,code,quantity,seller_id,buyer_id) VALUES 
																				('investment',10000,'2011-06-28',1000,'INTC',25,'0','001'),
																				('loan',10001,'2011-06-29',500,NULL,NULL,'0','001');
																				
INSERT INTO balance(date,fund,debt,user_id) VALUES ('2011-06-27',1000,0,'001'),
												('2011-06-28',0,0,'001'),
												('2011-06-29',500,500,'001'),
												('2011-06-30',500,500,'001');
