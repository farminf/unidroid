package com.artronics.unidroid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.SyncStateContract.Constants;

import com.google.code.linkedinapi.client.LinkedInApiClient;
import com.google.code.linkedinapi.client.LinkedInApiClientFactory;
import com.google.code.linkedinapi.client.oauth.LinkedInOAuthService;
import com.google.code.linkedinapi.client.oauth.LinkedInOAuthServiceFactory;
import com.google.code.linkedinapi.client.oauth.LinkedInRequestToken;

public class LinkedInActivity extends Activity {

	/*
	 public static final String CONSUMER_KEY = "4zm4j0svgrnb";
     public static final String CONSUMER_SECRET = "fAPILw6iTGEBAc4O";
     public static final String OAUTH_CALLBACK_SCHEME = "x-oauthflow-linkedin";
     public static final String OAUTH_CALLBACK_HOST = "callback";
     public static final String OAUTH_CALLBACK_URL = OAUTH_CALLBACK_SCHEME + "://" + OAUTH_CALLBACK_HOST;
	
     final LinkedInOAuthService oAuthService = LinkedInOAuthServiceFactory.getInstance().createLinkedInOAuthService(Constants.CONSUMER_KEY, Constants.CONSUMER_SECRET);
     final LinkedInApiClientFactory factory = LinkedInApiClientFactory.newInstance(Constants.CONSUMER_KEY, Constants.CONSUMER_SECRET);
     LinkedInRequestToken liToken;
     LinkedInApiClient client,
     
     liToken = oAuthService.getOAuthRequestToken(Constants.OAUTH_CALLBACK_URL);
     Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(liToken.getAuthorizationUrl()));
     startActivity(i);
     
     String verifier = intent.getData().getQueryParameter("oauth_verifier");
     
     LinkedInAccessToken accessToken = oAuthService.getOAuthAccessToken(liToken, verifier);
     client = factory.createLinkedInApiClient(accessToken);

client.postNetworkUpdate("LinkedIn Android app test");


     
}*/
}
