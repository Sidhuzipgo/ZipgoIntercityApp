package in.zipgo.automation_framework.request.data;


	
	import java.net.UnknownHostException;

	import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;



	import org.bson.Document;
import org.bson.conversions.Bson;
import org.testng.Assert;



	import com.mongodb.BasicDBObject;

	import com.mongodb.DB;

	import com.mongodb.DBCollection;

	import com.mongodb.DBCursor;

	import com.mongodb.DBObject;

	import com.mongodb.MongoClient;

	import com.mongodb.MongoClientOptions;

	import com.mongodb.MongoClientURI;

	import com.mongodb.ServerAddress;

	import com.mongodb.client.FindIterable;

	import com.mongodb.client.MongoCollection;

	import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.util.JSON;



	public class Databbb {



		public static void main( String args[] ) throws UnknownHostException{

			

		

			MongoClientURI uri = new MongoClientURI("mongodb://deploy:569Z197xtKzvCwDe@zipgostaging-shard-00-00-ib4to.mongodb.net:27017,zipgostaging-shard-00-01-ib4to.mongodb.net:27017,zipgostaging-shard-00-02-ib4to.mongodb.net:27017/zipgo?ssl=true&replicaSet=ZipGoStaging-shard-0&authSource=admin");



					MongoClient mongoClient = new MongoClient(uri);

					MongoDatabase db = mongoClient.getDatabase("zipgo");

					System.out.println("MongoDBConnection:done");

				    


				//MongoCollection<Document> order = db.getCollection("pass_configs");
				//MongoCollection<Document> order = db.getCollection("orders");
				//MongoCollection<Document> cust = db.getCollection("customers");
				MongoCollection<Document> custmoney= db.getCollection("multi_currency_customer_moneys");
				
				
				
				
				
				
				
				
				
				 double f = 0;
				 Object x=null;
					for (Document doc :custmoney.find()){
						System.out.println(doc.toJson());
						
						if(doc.containsValue("Rs")) {
							f=(double) doc.get("current_value");
						}
						if(doc.containsValue("null  ")) {
							f=(double) doc.get("current_value");
						}
						
						
						if(doc.containsValue("19.0")) {
							//System.out.println(doc.get("email"));
							
							 x=doc.get("currency_code");
							 System.out.println(x);
							
							f=(double) doc.get("currency_code");
							System.out.println("....."+f);
							
						}
						
						
					}
					System.out.println(f);

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			/*	for (Document doc :cust.find()) {
					System.out.println("    "+doc);
				}
				
				 String f = null;
				for (Document doc :order.find()){
					
					//System.out.println(doc.toJson());
					//System.out.println(doc);

					//if(doc.containsKey("_id")) {
						//System.out.println("......................................");
					//}
			        if(doc.containsValue("membership_plans")) {
					//System.out.println(",,,,,,,,..........,,,m,,.,.,.,.,");
					//doc.containsValue("membership_plans");
					System.out.println(doc.containsValue("membership_plans"));
					System.out.println(doc.get("_id"));

				}
					
				   
					if(doc.containsValue("+917204902260")) {
						//System.out.println(doc.get("email"));
						f=(String) doc.get("email");
						
						
					}
					
					
				}
				System.out.println(f);

*/

				
				//System.out.println("1111"+order);
/*
				long ordercount = order.count();

				System.out.println("Total order Count="+ordercount);
				
				BasicDBObject query2 = BasicDBObject.parse("{phone: {$et: \"7204902260\"}}");*/
				//FindIterable<Document> dumps = crapCollection.find(query2);

				//DBObject dbObject = (DBObject)JSON.parse("{phone: {$gt: \"7204902260\"}}");
				//FindIterable<Document> dumps = order.find(); 
		

				//MongoIterable<Document> cursor = order.find(new BasicDBObject("name", "345345"));
				//System.out.println(cursor);
				 //((DBCursor) cursor).one().get("name")


				/*MongoCollection<Document> pass = db.getCollection("orders");

				System.out.println(collection);

				long ordercount = collection.count();

				System.out.println("Total Order Count="+ordercount);

				

//				collection.find();

	*/			

				

				

				

				

				

				//=====================================================================================================

				

				/*//Setting search query with the required key-value pair

				BasicDBObject searchQuery = new BasicDBObject();

				searchQuery.put("cab_id",5426);   

				 

				

				

				//DBCursor with the find query result

				FindIterable<Document> cursor = collection.find(searchQuery);

				System.out.println(cursor);

			 

			        //Fetching the response

				String orders_count = null;			

				

				    while(((Iterator<DBObject>) cursor).hasNext()) {

				    	orders_count = orders_count.concat(((Iterator<DBObject>) cursor).next().toString());

				   }*/

				

				

				    System.out.println("finished");

		}

	}


