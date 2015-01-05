package utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;



public class Config {
	private static Map<String, Integer> proper = new HashMap<String, Integer>();
	private static Config config;
	private static String campaign_id;
	private static String lineitem_id;
	private static String camp_id;
	
	public static Config getInstance(){
		if(config == null){
			config = new Config();
		}
		return config;
	}
	
	public void LoadConf(String path,String type) throws IOException{
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(conf);
		FSDataInputStream in = fs.open(new Path(path));
		
		//Useful	
		Properties props = new Properties();
		props.load(in);
		StringTokenizer property = new StringTokenizer(props.getProperty(type),",");
		lineitem_id = props.getProperty("lineitem_id");
		campaign_id = props.getProperty("campaign_id");
		camp_id = props.getProperty("bilin_ci");
		
		int pos=0;
		while(property.hasMoreTokens()){
			proper.put(property.nextToken(), pos++);
		}
		in.close();
	}
	
	public static Map<String, Integer> getProper(){
		return Config.proper;
	}
	
	public static String getCampaign_id(){
		return Config.campaign_id;
	}
	
	public static String getLineitem_id(){
		return Config.lineitem_id;
	}
	
	public static String getCamp_id(){
		return Config.camp_id;
	}
	
}
