/*package com.artronics.unidroid;



	
	
//package com.ni.linkedinclient;
import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.code.linkedinapi.client.LinkedInApiClient;
import com.google.code.linkedinapi.client.LinkedInApiClientFactory;
import com.google.code.linkedinapi.client.oauth.LinkedInAccessToken;
import com.google.code.linkedinapi.client.oauth.LinkedInOAuthService;
import com.google.code.linkedinapi.client.oauth.LinkedInOAuthServiceFactory;
import com.google.code.linkedinapi.client.oauth.LinkedInRequestToken;
import com.google.code.linkedinapi.schema.Person;
import com.google.code.linkedinapi.schema.Source;
//import net.htmlparser.jericho.Source;


public class test extends Activity {    
	
	private WebView mWebView;   
	public static final String TAG= "Linkedin Client";   
	public  String authUrl= null;    
	private LinkedInOAuthService oauthService;    
	private LinkedInRequestToken requestToken;    
	private String consumerSecretValue;    
	private String consumerKeyValue;    @SuppressWarnings("unused")    
	private String myurl;        
	/** Called when the activity is first created.  
	@Override    
	public void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);        
		setContentView(R.layout.main);        
		mWebView = (WebView) findViewById(R.id.linkin);        
		mWebView.setVerticalScrollBarEnabled(false);       
		mWebView.setHorizontalScrollBarEnabled(false);        
		mWebView.setWebViewClient(new MyWebviewClient());      
		mWebView.getSettings().setJavaScriptEnabled(true);        
		
		try        {            
			consumerKeyValue = "6BG5tBiZTTW2X0RhZVpCh-sdeNBPRXLK6-UVD-Y208LOSeHQie-y4uizAt1Mslaq";
			//line.getOptionValue(CONSUMER_KEY_OPTION);           
			consumerSecretValue = "rBOHMBGFjMgM63uwgXIo-sLQO7iUNGA5ytMJYKNnw3eaMNuIWPXFfgG9A7elHq5R";
			//line.getOptionValue(CONSUMER_SECRET_OPTION);          
			oauthService = LinkedInOAuthServiceFactory.getInstance().createLinkedInOAuthService(consumerKeyValue, consumerSecretValue);   
			System.out.println("Fetching request token from LinkedIn...");       
			requestToken = oauthService.getOAuthRequestToken();         
			authUrl = requestToken.getAuthorizationUrl();        
			//System.out.println("Request token: " + requestToken.getToken());   
			// System.out.println("Token secret: " + requestToken.getTokenSecret());  
			//System.out.println("Expiration time: " + requestToken.getExpirationTime());   
			System.out.println("Now visit:\n" + authUrl + "\n... and grant this app authorization");     
			System.out.println("Enter the PIN code and hit ENTER when you're done:"); 
			mWebView.loadUrl(authUrl);          
			//mWebView.setWebViewClient(new LIView());     
			// BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			//String pin = br.readLine();           
			System.out.println("Fetching access token from LinkedIn..."); 
			//AccessToken at = new AccessToken();       
			//String pin =at.accesstoken();        
			//LinkedInAccessToken accessToken = oauthService.getOAuthAccessToken(requestToken, pin);  
			}        
		catch (Exception e) 
		{          
			e.printStackTrace();    
			
		}   
		}    
	class MyWebviewClient extends WebViewClient{  
		@Override      
		public void onLoadResource(WebView view, String url) {      
			super.onLoadResource(view, url);   
			Log.i("rrr", "onLoadResource");    
			}        @Override      
			public void onPageFinished(WebView view, String url) {  
				// TODO Auto-generated method stub        
				super.onPageFinished(view, url);   
				Log.i("rrr", "onPageFinished");  
				}        @Override       
				public void onPageStarted(WebView view, String url, Bitmap favicon)
				{       
					// TODO Auto-generated method stub   
					super.onPageStarted(view, url, favicon);    
					Log.i("rrr", "onPageStarted "+ authUrl);  
					String pinUrl = "https://www.linkedin.com/uas/oauth/authorize/submit";   
					if(pinUrl.equals(url)){          
						try         
						{            
							String pin = accesstoken(url);          
							Log.i("rrr", "onPageStarted2 *************"+ pin +"  "+ url) ;         
							LinkedInAccessToken accessToken = oauthService.getOAuthAccessToken(requestToken, pin);    
							System.out.println("Access token: " + accessToken.getToken());
							System.out.println("Token secret: " + accessToken.getTokenSecret());   
							LinkedInApiClientFactory factory = LinkedInApiClientFactory.newInstance(consumerKeyValue, consumerSecretValue);   
							
							LinkedInApiClient client = factory.createLinkedInApiClient(accessToken);   
							System.out.println("Fetching profile for current user.");           
							Person profile = client.getProfileForCurrentUser();          
							System.out.println("getting connections" +profile.getId()); 
							System.out.println("Names" +profile.getFirstName());        
							System.out.println("Getting location " +profile.getLocation().getCountry().getCode());       
							}               
						catch (Exception e)          
						{                  
							// TODO Auto-generated catch block     
							e.printStackTrace();            
							}        
						}  
					}   
				}   
	public static String accesstoken(String args) 
	{        
		DefaultHttpClient httpClient = new DefaultHttpClient();  
		HttpGet httpget = new HttpGet(args);      
		try {        
			org.apache.http.HttpResponse httpResponse = httpClient.execute(httpget);  
			HttpEntity hen = httpResponse.getEntity();     
			Source source = new Source(hen.getContent());       
			List<net.htmlparser.jericho.Element> elementList=source.getAllElements();
			for (net.htmlparser.jericho.Element element : elementList) 
			{            
				if(element.getName().equals("div"))  
				{                  
					String attr = element.getAttributeValue("Class");  
					if(attr != null && attr.equals("access-code"))                
						Log.i("rrr", "88888888888888" + element.getContent().toString()); 
					return element.getContent().toString();  
					}            
				}      
			} 
		catch (ClientProtocolException e) {  
			// TODO Auto-generated catch block     
			e.printStackTrace();  
			} catch (IOException e) 
			{            // TODO Auto-generated catch block   
				e.printStackTrace();    
				}      
		return null;
		}
	}
						
		
					
		
		
		































}
*/