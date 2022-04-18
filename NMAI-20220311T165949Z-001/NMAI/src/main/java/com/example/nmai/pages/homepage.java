package com.example.nmai.pages;

import java.io.IOException;

import okhttp3.*;

public class homepage {
	public static void main(String[] args) throws IOException {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
				.url("https://exercisedb.p.rapidapi.com/exercises/bodyPart/back")
				.get()
				.addHeader("x-rapidapi-host", "exercisedb.p.rapidapi.com")
				.addHeader("x-rapidapi-key", "24c7aefa92msh65d245d3e2bf9d2p1359acjsn201d3a869065")
				.build();
		Response response = client.newCall(request).execute();
			System.out.println(response.body().string());
	

	}
}
