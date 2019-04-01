package in.zipgo.automation_framework.request.data;

import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Datatwo {
	

	public static void main( String args[] ) throws UnknownHostException{
	

		MongoClientURI uri = new MongoClientURI("mongodb://deploy:569Z197xtKzvCwDe@zipgostaging-shard-00-00-ib4to.mongodb.net:27017,zipgostaging-shard-00-01-ib4to.mongodb.net:27017,zipgostaging-shard-00-02-ib4to.mongodb.net:27017/zipgo?ssl=true&replicaSet=ZipGoStaging-shard-0&authSource=admin");
		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase db = mongoClient.getDatabase("zipgo");

		
        
			    
		   
			MongoCollection<Document> pass = db.getCollection("pass_configs");
			MongoCollection<Document> order = db.getCollection("orders");
			MongoCollection<Document> custmoney= db.getCollection("multi_currency_customer_moneys");
			MongoCollection<Document> zipgomoney= db.getCollection("multi_currency_wallets");
			MongoCollection<Document> cust = db.getCollection("customers");

			
			int x=1046601;
			int x1=1037854;
			int  x4=1037729;
			int x3=1045958;
			int virtualwallet=0;
			double Realwallet=0;
			String username = "asd";
			double a=121;
			for(Document doc1:custmoney.find()) {
			if(doc1.containsValue(x)) 
			{
			        double rw=(double) doc1.get("current_value");
			        System.out.println("rw "+rw);
//			        custmoney.updateOne(arg0, arg1)
			       
			        
			       // double rw1=(double) doc1.put("current_value", 123);
			       // custmoney.updateOne({ _id: doc1._id }, { current_value});
			            
			       
			        
			        
			        
			    	BasicDBObject newDocument = new BasicDBObject();
			    	
			    	BasicDBObject searchQuery = new BasicDBObject().append("current_value", rw);
			    		
			    	newDocument.put("$set",new BasicDBObject("current_value",a));

			        custmoney.updateOne(searchQuery, newDocument);
			        
			        double rw1=(double) doc1.get("current_value");
			        Realwallet=rw1+Realwallet;

					System.out.println("Real Money "+Realwallet);
			}
			}
			
			
			for(Document doc:zipgomoney.find()) {
				SimpleDateFormat date1 = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
			
				Date d=new Date();
				//System.out.println(d);
				date1.format(d);
				if(doc.containsValue(x)) {
					double  f=(double) doc.get("balance");
					

					
					//double  f2=(double) doc.put
                    System.out.println("f= "+f);

					//System.out.println("Virtual Money "+f);
					Date l= (Date) doc.get("expiry_time");					
					l.compareTo(d);
				    System.out.println("date comparison  "+l.compareTo(d));
					if(l.compareTo(d)==1) {
						virtualwallet=(int) (virtualwallet+f);
					}
					else {
					}
				}
			}
			
			for(Document doc2:cust.find()) {
				if(doc2.containsValue(x)) 
				{
					username=(String) doc2.get("name");

				}
				}
			System.out.println("Total virtual wallet "+virtualwallet);
			double TotalCustWallet=Realwallet+virtualwallet;
            System.out.println("Total money of " +username+"="+TotalCustWallet);
		
			
		
			

			
     }
	

    }

