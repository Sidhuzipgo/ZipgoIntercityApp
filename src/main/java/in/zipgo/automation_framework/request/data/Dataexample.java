package in.zipgo.automation_framework.request.data;

import java.net.UnknownHostException;
import java.util.Set;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.steadystate.css.parser.selectors.SyntheticElementSelectorImpl;


public class Dataexample {
/*	
	MongoClientURI uri = new MongoClientURI("mongodb://deploy:569Z197xtKzvCwDe@zipgostaging-shard-00-00-ib4to.mongodb.net:27017,zipgostaging-shard-00-01-ib4to.mongodb.net:27017,zipgostaging-shard-00-02-ib4to.mongodb.net:27017/zipgo?ssl=true&replicaSet=ZipGoStaging-shard-0&authSource=admin");

	MongoClient mongoClient = new MongoClient(uri);

	MongoDatabase db = mongoClient.getDatabase("zipgo");
	
	Mongo m = new Mongo();
    DB db1 = m.getDB("zipgo");
    DBCollection coll =  (DBCollection) db.getCollection("first");
    DBObject doc = new BasicDBObject();
    //DBCursor cur =coll.executeQuery("db1.first.find({"username":"joe"})")
*/
	
	public static void main( String args[] ) throws UnknownHostException{

	
	MongoClientURI uri = new MongoClientURI("mongodb://deploy:569Z197xtKzvCwDe@zipgostaging-shard-00-00-ib4to.mongodb.net:27017,zipgostaging-shard-00-01-ib4to.mongodb.net:27017,zipgostaging-shard-00-02-ib4to.mongodb.net:27017/zipgo?ssl=true&replicaSet=ZipGoStaging-shard-0&authSource=admin");

	
	MongoClient mongoClient = new MongoClient(uri);

	MongoDatabase db = mongoClient.getDatabase("zipgo");
	
	DB db1=mongoClient.getDB("zipgo");

	      //MongoCollection<Document> order = db.getCollection("pass_configs");
         // MongoCollection<Document> order = db.getCollection("orders");
        
         
       //   DBCursor cursor=db1.getCollection("multi_currency_customer_moneys").find(new BasicDBObject());
         // Set<String> cursor2=db1.getCollectionNames();
          
         // System.out.println(cursor2);
    	  //System.out.println("abc");

         // while(cursor.hasNext()) {
        	 //System.out.println("werwr");
        	// System.out.println((cursor.next()));
        	  
        	 
          //}
          DBCollection collection1 = db1.getCollection("orders");
         System.out.println("11111");
          BasicDBObject searchQuery = new BasicDBObject();
          System.out.println("22222");

          searchQuery.put("_id", "1034522");
          System.out.println("33333");

          DBCursor cursor3 = collection1.find(searchQuery);
          System.out.println("44444");

          while (cursor3.hasNext()) {
        	  
              System.out.println("55555");

              System.out.println(cursor3.next());
          }
          
          
			

          MongoCollection<Document> customermoney = (MongoCollection<Document>) db1.getCollection("multi_currency_customer_moneys");
          String f = null;
			for (Document doc :customermoney.find()){
				
				//System.out.println("sdfdsf");
				
			   
				if(doc.containsValue("1039551")) {
					//System.out.println(doc.get("email"));
					//f=(String) doc.get("current_value");
					
					
				}
				
				
			}
			System.out.println(f);
          
          
    }
	
	
}
