package in.zipgo.automation_framework.request.data;

import java.net.UnknownHostException;
import java.util.Iterator;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DataCabSeats {
	
	//started
	//canceled
	//finished
    //pending
	public static void main( String args[] ) throws UnknownHostException{
		

		MongoClientURI uri = new MongoClientURI("mongodb://deploy:569Z197xtKzvCwDe@zipgostaging-shard-00-00-ib4to.mongodb.net:27017,zipgostaging-shard-00-01-ib4to.mongodb.net:27017,zipgostaging-shard-00-02-ib4to.mongodb.net:27017/zipgo?ssl=true&replicaSet=ZipGoStaging-shard-0&authSource=admin");



		MongoClient mongoClient = new MongoClient(uri);

		MongoDatabase db = mongoClient.getDatabase("zipgo");

		
		BasicDBObject searchQuery = new BasicDBObject();

			    
		   
			//MongoCollection<Document> pass = db.getCollection("pass_configs");
			MongoCollection<Document> order = db.getCollection("orders");
			
			
			//MongoCollection<Document> cust = db.getCollection("customers");
			//MongoCollection<Document> custmoney= db.getCollection("multi_currency_customer_moneys");
			//MongoCollection<Document> zipgomoney= db.getCollection("multi_currency_wallets");
		//MongoCollection<Document> cabtrips= db.getCollection("cab_trips");
		MongoCollection<Document> cabseats= db.getCollection("cab_audits");
		MongoCollection<Document> cust = db.getCollection("customers");
		MongoCollection<Document> cabtrips = db.getCollection("cab_trips");
		MongoCollection<Document> cabreg = db.getCollection("cab_trip_regulations");
	
		
		int amaxseat=0;
		int avaseat=0;
		String stat=null;
		
		int a=0;
		int takenseat=0;
		String status=null;
		String available_seats=null;
		String maximum_seats=null;
		int cabidnum=10581;
		int cabid=0;
		String username=null;
		int x=1045956;
	    String fini="finished";
	    String started="started";
		for(Document doc:cabreg.find()) {
			//System.out.println(doc.toJson());
			System.out.println(doc.get("cab_trip_id"));
			if(doc.containsValue("55c6fcce9ac697c5500004c3")) {
				System.out.println("sdfdsfsdf");
				int b=(int) doc.get("total_taken_seat");
				System.out.println(b);
			}
			}
		
	    
		//55c6c2229ac697c550000185
		
	  /*  for(Document doc1:cabreg.find()) {
	    	System.out.println(doc1.toJson());
	    	//total_taken_seat
                if(doc1.containsValue(cabidnum)) {
				
				takenseat=(int)doc1.get("total_taken_seat");
				
			}
	    }
	    System.out.println(takenseat);
	    for(Document doc1:cabseats.find()) {
	    	//System.out.println(doc1.toJson());
	    	//System.out.println(doc1.get("available_seat_numbers"));
			if(doc1.containsValue(cabidnum)) {
				
				a=(int)doc1.get("total_available_seat");
				a=a+a;
			}

	    }
	    System.out.println(a);
			
		for (Document doc :cabtrips.find()){

		if(doc.containsValue(cabidnum)) {
			
			   amaxseat=(int)doc.get("maximum_seats");
			   avaseat=(int) doc.get("available_seats");
		    stat=(String)doc.get("status");
			
		   


		}


        }
		
		System.out.println(amaxseat+"  "+avaseat+" "+stat);

		
	
		
	*/
	
	}
    }
